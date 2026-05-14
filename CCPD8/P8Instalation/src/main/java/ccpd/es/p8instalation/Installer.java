/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/moduleInstall.java to edit this template
 */
package ccpd.es.p8instalation;

import beleris.es.finalinformationmanager.MainErrorManager;
import beleris.es.finalutils.FileManagerGenerator;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8dbmanager.FDBManExtra;
import java.awt.EventQueue;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.openide.LifecycleManager;
import org.openide.modules.ModuleInstall;
import org.openide.windows.WindowManager;

public class Installer extends ModuleInstall {

    private static final long serialVersionUID = 3887998096463964445L;
    private FileManagerGenerator FMG = new FileManagerGenerator();
    private boolean userauthen;
    private FDBManExtra DBManager;

    void SetupDB() {
        CreateDBsStructure();
    }

    void SetupGui() {
        /*   Date current = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(current);
        int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dayofweek) {
            case 1: {
                try {
                    UIManager.setLookAndFeel(new RadianceCeruleanLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }

            case 2: {
                try {
                    UIManager.setLookAndFeel(new RadianceBusinessLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }

            case 3: {
                try {
                    UIManager.setLookAndFeel(new RadianceBusinessBlueSteelLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }

            case 4: {
                try {
                    UIManager.setLookAndFeel(new RadianceBusinessBlackSteelLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }

            case 5: {
                try {
                    UIManager.setLookAndFeel(new RadianceCremeLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
            case 6: {
                try {
                    UIManager.setLookAndFeel(new RadianceCremeCoffeeLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }

            case 7: {
                try {
                    UIManager.setLookAndFeel(new RadianceSaharaLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }

            default: {
                try {
                    UIManager.setLookAndFeel(new RadianceNebulaLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }

        }
        UIManager.put("Button.arc", 999);
        UIManager.put("Component.arc", 999);
        UIManager.put("ProgressBar.arc", 999);
        UIManager.put("TextComponent.arc", 999);
        UIManager.put("Component.arrowType", "triangle");*/
    }

    @Override
    public void restored() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                SetupGui();
                SetupDB();
            }
        }
        );
    }

    private void CreateDBsStructure() {
        String SQLCommand = "";
        CreateConfigDir();
        //DabaseManagerCheck();
        CheckfirstInstall();
        PConfig.setDBName("ccpd_lists");

        DBManager = new FDBManExtra(PConfig.getSQLURL(), PConfig.getAdminDBPassword(), PConfig.getDBName(), PConfig.getAdminDBName(), FDBManExtra.DB_MYSQL_Selected);
        if (!PConfig.isProgramInstalled()) {
            DatabasesInstallCreation();
            ConfigureRegistreredUserAndAdminUser();
        }
        FinishInstalation();
    }

    private void CheckfirstInstall() {
        if (FMG.FileExists(PConfig.getProgramHomeConfigPath() + "/programa.instalado")) {
            PConfig.setProgramInstalled(true);
        } else {
            // ProgramInstalled();
            PConfig.setProgramInstalled(false);
            //FMG = new FileManagerGenerator(FMG.ifmCreateWrite, "programa.instalado");
        }

    }

    private void ProgramInstalled() {
        SimpleDateFormat MyDateFormat = new SimpleDateFormat("ddMMyyyy");
        Calendar calendario = GregorianCalendar.getInstance();
        java.util.Date fecha = calendario.getTime();
        PConfig.setProgramInstalled(true);
        FMG = new FileManagerGenerator(FMG.getIfmCreateWrite(), PConfig.getProgramHomePath() + "/programa.instalado");
        FMG.WriteString(MyDateFormat.format(fecha));
        FMG.CloseAll();
        //FMG = new FileManagerGenerator(FMG.ifmCreateWrite, "programa.instalado");
    }

    private void DabaseManagerCheck() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            //LoggingManagerGenerator.getGlobalLogger().info("No encuentro el gestor de base de datos Mysql, instálelo.");
            MainErrorManager.ShowDError("No encuentro el gestor de base de datos Mysql, instálelo.");
            LifecycleManager.getDefault().exit();
        }
    }

    private void DatabasesInstallCreation() {
        CreatePrimaryDatabase();
    }

    public String GetSQLFile(String Path) {
        String sql = "";
        if (FMG.FileExists(Path)) {
            try {
                InputStream is = getClass().getResourceAsStream(Path);
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                StringBuilder sqlBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sqlBuilder.append(line).append("\n");
                }
                sql = sqlBuilder.toString();
                // Now use 'sql' variable for your database operations
                // ...
            } catch (IOException ex) {
                // Handle file reading error
                MainErrorManager.ShowDError("No encuentro el scritp de creación de la base de datos /sqlscripts/initdb.sql. " + ex.getLocalizedMessage());
            }
        }
        return sql;
    }

    public void CreatePrimaryDatabase() {
        String DBTableCreateStat = "";
        DBTableCreateStat = GetSQLFile("sqlscripts/initdb.sql");
        DBManager.ExecuteQueryTableDBWithOptions(DBTableCreateStat);
        //  FDBMan.CreateDBTableWithFields(DBTableCreateStat, PConfig.getAdminUserName(), PConfig.getAdminUserPass(), getDBActualName());
    }

    private void ConfigureRegistreredUserAndAdminUser() {
        Frame f = WindowManager.getDefault().getMainWindow();
        DBAutInstall DAutenInstallPONE = new DBAutInstall(f, true);
        DAutenInstallPONE.setLocationRelativeTo(f);
        DAutenInstallPONE.setVisible(true);
        f = WindowManager.getDefault().getMainWindow();
        UserAutoInstall DAutenInstallPTWO = new UserAutoInstall(f, true);
        DAutenInstallPTWO.setLocationRelativeTo(f);
        DAutenInstallPTWO.setVisible(true);
        userauthen = DAutenInstallPTWO.isFilled();
        if (!userauthen) {
            MainErrorManager.ShowDError("Tiene que introducir los datos del cliente suministrados para la instalación del programa.");
            LifecycleManager.getDefault().exit();
        } else {
            MainErrorManager.ShowDWarning("Asegurese que los datos del cliente son los suministrados para evitar errores en el programa.");
        }
    }

    private void CreateConfigDir() {
        FileManagerGenerator FMG = new FileManagerGenerator();
        String HP = PConfig.getProgramHomeConfigPath();
        if (!FMG.FileExists(HP)) {
            FMG.CreateDir(HP);
        }
    }

    private void DeactivateForeingTablesCheck() {
        String DBTableCreateStat = "set foreign_key_checks=0";
        DBManager.ExecuteQueryTableDBWithOptions(DBTableCreateStat);
    }

    private void ActivateForeingTablesCheck() {
        String DBTableCreateStat = "set foreign_key_checks=1";
        DBManager.ExecuteQueryTableDBWithOptions(DBTableCreateStat);
    }

    private void FinishInstalation() {

        ProgramInstalled();

    }

}

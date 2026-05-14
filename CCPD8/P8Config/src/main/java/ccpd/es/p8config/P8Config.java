/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.p8config;

import beleris.es.finalprimaryclasses.CL_Client;
import beleris.es.finalprimaryclasses.CL_Enterprise;
import beleris.es.finalprimaryclasses.CL_File;
import java.awt.image.BufferedImage;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Emilio David Diaus López 2008-2025
 */
public class P8Config {

    private CL_File ActualFile = new CL_File();
    private CL_Client ActualClient = new CL_Client();
    private CL_Enterprise ActualEnterprise = new CL_Enterprise();
    public static P8Config PConfig = new P8Config();
    private boolean UserAuthenticated = false;
    private boolean ClientActivated = false;
    private boolean EntityActivated = false;
    private boolean FileActivated = false;
    private int iClientsNumber = 0;
    private int iEnterprisesNumber = 0;
    Path path = Paths.get("");
    private String ProgramHomePath = System.getProperty("user.home");
    String dN = path.toAbsolutePath().toString();
    String ApplicationPath = dN;
    String ProgramHomeConfigPath = ProgramHomePath + "/.ccpd/";

    // Variables de la ayuda
    private String HelpModule = "";
    // Variables de la ayuda
    private String HelpFileModule = "";
    private String HelpTitleModule = "";

    private String BackupHelpModule = "";
    // Variables de la ayuda
    private String BackupHelpFileModule = "";
    private String BackupHelpTitleModule = "";

    private BufferedImage EntityLogo = null;
    private BufferedImage EntityLogoPDF = null;
    private String DBName = "";
    private String SQLURL = "jdbc:mysql://localhost:3306/" + getDBName();

    private String UserDBPassword = "B3WQA7FZis9BUXtFqJ2-";
    private String UserDBName = "ccpduserdb";
    private String AdminDBPassword = "FR6rjcwMeVCgdWQzDxG5-";
    private String AdminDBName = "root";
    private boolean ProgramInstalled=false;

    public P8Config() {
       // SQLURL = "jdbc:mariadb://localhost:3306/" + getDBName() + "?permitMysqlScheme";
    }

    /**
     * @return the ActualClient
     */
    public CL_Client getActualClient() {
        return ActualClient;
    }

    /**
     * @param ActualClient the ActualClient to set
     */
    public void setActualClient(CL_Client ActualClient) {
        this.ActualClient = ActualClient;
    }

    /**
     * @return the UserAuthenticated
     */
    public boolean isUserAuthenticated() {
        return UserAuthenticated;
    }

    /**
     * @param UserAuthenticated the UserAuthenticated to set
     */
    public void setUserAuthenticated(boolean UserAuthenticated) {
        this.UserAuthenticated = UserAuthenticated;
    }

    /**
     * @return the ActualEnterprise
     */
    public CL_Enterprise getActualEnterprise() {
        return ActualEnterprise;
    }

    /**
     * @param ActualEnterprise the ActualEnterprise to set
     */
    public void setActualEnterprise(CL_Enterprise ActualEnterprise) {
        this.ActualEnterprise = ActualEnterprise;
    }

    /**
     * @return the ActualFile
     */
    public CL_File getActualFile() {
        return ActualFile;
    }

    /**
     * @param ActualFile the ActualFile to set
     */
    public void setActualFile(CL_File ActualFile) {
        this.ActualFile = ActualFile;
    }

    /**
     * @return the EntityActivated
     */
    public boolean isEntityActivated() {
        return EntityActivated;
    }

    /**
     * @param EntityActivated the EntityActivated to set
     */
    public void setEnterpriseActivated(boolean EntityActivated) {
        this.EntityActivated = EntityActivated;
    }

    /**
     * @return the FileActivated
     */
    public boolean isFileActivated() {
        return FileActivated;
    }

    /**
     * @param FileActivated the FileActivated to set
     */
    public void setFileActivated(boolean FileActivated) {
        this.FileActivated = FileActivated;
    }

    /**
     * @return the ProgramHomePath
     */
    public String getProgramHomePath() {
        return ProgramHomePath;
    }

    /**
     * @param ProgramHomePath the ProgramHomePath to set
     */
    public void setProgramHomePath(String ProgramHomePath) {
        this.ProgramHomePath = ProgramHomePath;
    }

    /**
     * @return the ProgramHomeConfigPath
     */
    public String getProgramHomeConfigPath() {
        return ProgramHomeConfigPath;
    }

    /**
     * @param ProgramHomeConfigPath the ProgramHomeConfigPath to set
     */
    public void setProgramHomeConfigPath(String ProgramHomeConfigPath) {
        this.ProgramHomeConfigPath = ProgramHomeConfigPath;
    }

    /**
     * @return the ApplicationPath
     */
    public String getApplicationPath() {
        return ApplicationPath;
    }

    /**
     * @return the HelpModule
     */
    public String getHelpModule() {
        return HelpModule;
    }

    /**
     * @param HelpModule the HelpModule to set
     */
    public void setHelpModule(String HelpModule) {
        this.HelpModule = HelpModule;
    }

    /**
     * @return the HelpFileModule
     */
    public String getHelpFileModule() {
        return HelpFileModule;
    }

    /**
     * @param HelpFileModule the HelpFileModule to set
     */
    public void setHelpFileModule(String HelpFileModule) {
        this.HelpFileModule = HelpFileModule;
    }

    /**
     * @return the HelpTitleModule
     */
    public String getHelpTitleModule() {
        return HelpTitleModule;
    }

    /**
     * @param HelpTitleModule the HelpTitleModule to set
     */
    public void setHelpTitleModule(String HelpTitleModule) {
        this.HelpTitleModule = HelpTitleModule;
    }

    public void BackupHelpconfig() {
        setBackupHelpModule(getHelpModule());
        setBackupHelpFileModule(getHelpFileModule());
        setBackupHelpTitleModule(getHelpTitleModule());
    }

    public void RestoreHelpconfig() {
        setHelpModule(getBackupHelpModule());
        setHelpFileModule(getBackupHelpFileModule());
        setHelpTitleModule(getBackupHelpTitleModule());
    }

    /**
     * @return the BackupHelpModule
     */
    public String getBackupHelpModule() {
        return BackupHelpModule;
    }

    /**
     * @param BackupHelpModule the BackupHelpModule to set
     */
    public void setBackupHelpModule(String BackupHelpModule) {
        this.BackupHelpModule = BackupHelpModule;
    }

    /**
     * @return the BackupHelpFileModule
     */
    public String getBackupHelpFileModule() {
        return BackupHelpFileModule;
    }

    /**
     * @param BackupHelpFileModule the BackupHelpFileModule to set
     */
    public void setBackupHelpFileModule(String BackupHelpFileModule) {
        this.BackupHelpFileModule = BackupHelpFileModule;
    }

    /**
     * @return the BackupHelpTitleModule
     */
    public String getBackupHelpTitleModule() {
        return BackupHelpTitleModule;
    }

    /**
     * @param BackupHelpTitleModule the BackupHelpTitleModule to set
     */
    public void setBackupHelpTitleModule(String BackupHelpTitleModule) {
        this.BackupHelpTitleModule = BackupHelpTitleModule;
    }

    public void setHelpConfig(String title, String tempHM, String tempHFM) {
        BackupHelpconfig();
        setHelpTitleModule(title);
        setHelpModule(tempHM);
        setHelpFileModule(tempHFM);
    }

    /**
     * @return the ClientAuthenticated
     */
    public boolean isClientActivated() {
        return ClientActivated;
    }

    /**
     * @return the iClientsNumber
     */
    public int getiClientsNumber() {
        return iClientsNumber;
    }

    /**
     * @param iClientNumber the iClientsNumber to set
     */
    public void setiClientsNumber(int iClientsNumber) {
        this.iClientsNumber = iClientsNumber;
    }

    /**
     * @return the iEnterprisesNumber
     */
    public int getiEnterprisesNumber() {
        return iEnterprisesNumber;
    }

    /**
     * @param iEnterprisesNumber the iEnterprisesNumber to set
     */
    public void setiEnterprisesNumber(int iEnterprisesNumber) {
        this.iEnterprisesNumber = iEnterprisesNumber;
    }

    /**
     * @param ClientActivated the ClientActivated to set
     */
    public void setClientActivated(boolean ClientActivated) {
        this.ClientActivated = ClientActivated;
    }

    /**
     * @return the EntityLogo
     */
    public BufferedImage getEntityLogo() {
        return EntityLogo;
    }

    /**
     * @param EntityLogo the EntityLogo to set
     */
    public void setEntityLogo(BufferedImage EntityLogo) {
        this.EntityLogo = EntityLogo;
    }

    /**
     * @return the EntityLogoPDF
     */
    public BufferedImage getEntityLogoPDF() {
        return EntityLogoPDF;
    }

    /**
     * @param EntityLogoPDF the EntityLogoPDF to set
     */
    public void setEntityLogoPDF(BufferedImage EntityLogoPDF) {
        this.EntityLogoPDF = EntityLogoPDF;
    }

    /**
     * @return the DBName
     */
    public String getDBName() {
        return DBName;
    }

    /**
     * @param DBName the DBName to set
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * @return the SQLURL
     */
    public String getSQLURL() {
        return SQLURL;
    }

    /**
     * @param SQLURL the SQLURL to set
     */
    public void setSQLURL(String SQLURL) {
        this.SQLURL = SQLURL;
    }

    /**
     * @return the UserDBPassword
     */
    public String getUserDBPassword() {
        return UserDBPassword;
    }

    /**
     * @param UserDBPassword the UserDBPassword to set
     */
    public void setUserDBPassword(String UserDBPassword) {
        this.UserDBPassword = UserDBPassword;
    }

    /**
     * @return the UserDBName
     */
    public String getUserDBName() {
        return UserDBName;
    }

    /**
     * @param UserDBName the UserDBName to set
     */
    public void setUserDBName(String UserDBName) {
        this.UserDBName = UserDBName;
    }

    /**
     * @return the AdminDBPassword
     */
    public String getAdminDBPassword() {
        return AdminDBPassword;
    }

    /**
     * @param AdminDBPassword the AdminDBPassword to set
     */
    public void setAdminDBPassword(String AdminDBPassword) {
        this.AdminDBPassword = AdminDBPassword;
    }

    /**
     * @return the AdminDBName
     */
    public String getAdminDBName() {
        return AdminDBName;
    }

    /**
     * @param AdminDBName the AdminDBName to set
     */
    public void setAdminDBName(String AdminDBName) {
        this.AdminDBName = AdminDBName;
    }

    public void setProgramInstalled(boolean b) {
        ProgramInstalled=b;
    }

    /**
     * @return the ProgramInstalled
     */
    public boolean isProgramInstalled() {
        return ProgramInstalled;
    }

}

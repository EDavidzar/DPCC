/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.p8dbase;

import ccpd.es.p8classes.CLAllObjectList;
import ccpd.es.p8classes.CL_DBCV;
import ccpd.es.p8utils.LoggingManagerGenerator;
import static ccpd.es.p8utils.MainErrorManager.ShowDError;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import org.openide.util.Exceptions;

/**
 *
 * @author Emilio David Diaus López 2023-2025
 */
public class DBMax {

    private boolean isokrow;
    public static final int db_using_MySQL = 0;
    public static final int db_using_SQL_Lite = 1;
    private int dbusingpar = 0;
    private Connection cnConn;
    private int ierrCode;
    private String serrSQLMessage;
    private String serrSQLState;
    private ResultSet rsCResSet;
    private String sDefaultServerNConn = "localhost";
    private int iPortNConn = 3306;
    private MysqlConnectionPoolDataSource mcpdsDataOrigin;
    private final String ServerName = "jdbc:mysql://localhost:3306";
    String SQLLiteServerName = "jdbc:sqlite:";
    private PreparedStatement stSQLStat;
    String DBManagerUrl;
    String DBUser = "";
    String DBPass = "";
    String DBOptions = "";
    private String DBName;
    private boolean bError = false;

    public DBMax(String Url, String sDBPass, String sDBName, String sDBUser, int dbusing) {
        this.DBManagerUrl = Url;
        this.DBPass = sDBPass;
        this.DBUser = sDBUser;
        this.DBName = sDBName;
        dbusingpar = dbusing;
        switch (dbusingpar) {
            case db_using_MySQL -> {
                MySql_DSPoolInitSimple(Url, DBName, DBUser, DBPass);
            }
            case db_using_SQL_Lite -> {
                SQLLite_DriverInit(DBName);
            }
            default -> {
                MySql_DSPoolInitSimple(Url, DBName, DBUser, DBPass);
            }
        }

    }

    public void SelectSingleResult(String sTmpDBTable, String sFieldtoSearch, String sFieldValuetoSearch) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_SelectSingleResult(sTmpDBTable, sFieldtoSearch, sFieldValuetoSearch);
            }
            case db_using_SQL_Lite -> {
                CLAllObjectList<CL_DBCV> FieldList = new CLAllObjectList<>();
                FieldList.add(new CL_DBCV(sFieldtoSearch, sFieldValuetoSearch));
                SQLLite_SelectManyResults(sTmpDBTable, FieldList);
            }
            default -> {
                MySQL_SelectSingleResult(sTmpDBTable, sFieldtoSearch, sFieldValuetoSearch);
            }
        }
    }

    public void MySQL_SelectSingleResult(String sTmpDBTable, String sFieldtoSearch, String sFieldValuetoSearch) {

        //  String sSQLQueryStr = "SELECT * FROM `" + AntiSQLInjection(sTmpDBTable) + "` WHERE  " + AntiSQLInjection(sFieldtoSearch)
        //        + "='" + AntiSQLInjection(sFieldValuetoSearch) + "';";
        setbError(false);
        String Statement = "SELECT * FROM " + sTmpDBTable + " WHERE " + sFieldtoSearch + "=?";

        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            stSQLStat.setString(1, sFieldValuetoSearch);
            //  rsCResSet = stSQLStat.executeQuery(sSQLQueryStr);
            rsCResSet = stSQLStat.executeQuery();
//            rsCResSet.next();

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al seleccionar datos de la tabla:" + sTmpDBTable);
            rsCResSet = null;
        } finally {
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void SelectManyResults(String sTmpDBTable, String sFieldtoSearch, String sFieldValuetoSearch, CLAllObjectList<String> DBParametersEnter, CLAllObjectList<String> DBParametersReturn) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_SelectManyResults(sTmpDBTable, sFieldtoSearch, sFieldValuetoSearch, DBParametersEnter, DBParametersReturn);
            }
            case db_using_SQL_Lite -> {
                CLAllObjectList<CL_DBCV> FieldList = new CLAllObjectList<>();
                FieldList.add(new CL_DBCV(sFieldtoSearch, sFieldValuetoSearch));
                SQLLite_SelectManyResults(sTmpDBTable, FieldList);
            }
            default -> {
                MySQL_SelectManyResults(sTmpDBTable, sFieldtoSearch, sFieldValuetoSearch, DBParametersEnter, DBParametersReturn);
            }
        }
    }

    public void SQLLite_SelectManyResults(String sDBTable, CLAllObjectList<CL_DBCV> FieldList) {
        try {
            var sql = "SELECT ";
            int index = 0;
            int totalindex = FieldList.size();
            while (index < totalindex) {
                CL_DBCV Field = FieldList.get(index);
                String sField = Field.getsTableDBField();
                sql = sql + "" + sField;
                index++;
                if (index < totalindex) {
                    sql = sql + ",";
                }
            }

            sql = sql + " FROM" + sDBTable + ";";

            cnConn = DriverManager.getConnection(SQLLiteServerName + DBName);
            var stmt = cnConn.createStatement();
            // create a new table
            stmt.executeQuery(sql);
        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al seleccionar datos de la tabla:" + sDBTable);
        }

    }

    public void MySQL_SelectManyResults(String sTmpDBTable, String sFieldtoSearch, String sFieldValuetoSearch, CLAllObjectList<String> DBParametersEnter, CLAllObjectList<String> DBParametersReturn) {

        //  String sSQLQueryStr = "SELECT * FROM `" + AntiSQLInjection(sTmpDBTable) + "` WHERE  " + AntiSQLInjection(sFieldtoSearch)
        //        + "='" + AntiSQLInjection(sFieldValuetoSearch) + "';";
        setbError(false);
        String Statement = "SELECT * FROM " + this.DBName + "." + sTmpDBTable + " WHERE " + sFieldtoSearch + "=?";

        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            stSQLStat.setString(1, sFieldValuetoSearch);
            //  rsCResSet = stSQLStat.executeQuery(sSQLQueryStr);
            rsCResSet = stSQLStat.executeQuery();
            if (rsCResSet.next()) {
                if (DBParametersEnter != null) {
                    String DBCampo = null, Result = null;
                    int iindex = 1, lastpar = 0;
                    lastpar = DBParametersEnter.size();
                    for (iindex = 1; iindex <= lastpar; iindex++) {
                        DBCampo = DBParametersEnter.get(iindex - 1);
                        if (DBCampo != null) {
                            Result = rsCResSet.getString(DBCampo);
                            DBParametersReturn.add(Result);
                        }
                    }
                }
            }

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al seleccionar datos de la tabla:" + sTmpDBTable);
        } finally {
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void CreateTable(String sDBTable, CLAllObjectList<CL_DBCV> FieldList) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_CreateTableWithFields(sDBTable, FieldList);
            }
            case db_using_SQL_Lite -> {
                SQLLlite_CreateTableWithFields(sDBTable, FieldList);
            }
            default -> {
                MySQL_CreateTableWithFields(sDBTable, FieldList);
            }
        }
    }

    public void CreateDB(String sDB) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_CreateDB(sDB);
            }
            case db_using_SQL_Lite -> {
                SQLLite_CreateDB(sDB);
            }
            default -> {
                MySQL_CreateDB(sDB);
            }

        }
    }

    public void MySQL_CreateDB(String sDBTable) {

        String Statement = "CREATE DATABASE  IF NOT EXISTS `" + sDBTable + "`;";

        boolean bRes = false;
        setbError(false);

        try {
            stSQLStat = cnConn.prepareStatement(Statement);

            bRes = stSQLStat.execute();

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al crear tabla:" + sDBTable);
        } finally {
            bRes = false;
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void SQLLite_CreateDB(String sDBTable) {

        String Statement = "CREATE DATABASE  IF NOT EXISTS `" + sDBTable + "`;";

        boolean bRes = false;
        setbError(false);

        try {
            stSQLStat = cnConn.prepareStatement(Statement);

            bRes = stSQLStat.execute();

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al crear tabla:" + sDBTable);
        } finally {
            bRes = false;
            MySQL_WhenErrorCloseConnection();

        }
    }

    public boolean DBTableExist(String sDB) {
        boolean result = false;
        return result;
    }

    public void SQLLlite_CreateTableWithFields(String sDBTable, CLAllObjectList<CL_DBCV> FieldList) {
        try {
            var sql = "CREATE TABLE IF NOT EXISTS " + sDBTable + "("
                    + "	id " + sDBTable + " INTEGER PRIMARY KEY,";
            int index = 0;
            int totalindex = FieldList.size();
            while (index < totalindex) {
                CL_DBCV Field = FieldList.get(index);
                String sField = Field.getsTableDBField();
                String sValue = Field.getsValue();
                sql = sql + "" + sField + " " + sValue;
                index++;
                if (index < totalindex) {
                    sql = sql + ",";
                }
            }

            sql = sql + ");";

            cnConn = DriverManager.getConnection(SQLLiteServerName + DBName);
            var stmt = cnConn.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al crear tabla con campos:" + sDBTable);
        }

    }

    public void MySQL_CreateTableWithFields(String sDBTable, CLAllObjectList<CL_DBCV> FieldList) {
        try {
            var sql = "CREATE TABLE IF NOT EXISTS " + sDBTable + "("
                    + "	id " + sDBTable + " INTEGER PRIMARY KEY,";
            int index = 0;
            int totalindex = FieldList.size();
            while (index < totalindex) {
                CL_DBCV Field = FieldList.get(index);
                String sField = Field.getsTableDBField();
                String sValue = Field.getsValue();
                sql = sql + "" + sField + " " + sValue;
                index++;
                if (index < totalindex) {
                    sql = sql + ",";
                }
            }

            sql = sql + ");";

            cnConn = DriverManager.getConnection(SQLLiteServerName + DBName);
            var stmt = cnConn.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al crear tabla con campos:" + sDBTable);
        }

    }

    public void UpdateTable(String sDBTable, CLAllObjectList<CL_DBCV> FieldList) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_UpdateTable(sDBTable, FieldList, null, null);
            }
            case db_using_SQL_Lite -> {
                SQLLite_UpdateTable(sDBTable, FieldList);
            }
            default -> {
                MySQL_UpdateTable(sDBTable, FieldList, null, null);
            }
        }
    }

    public void SQLLite_UpdateTable(String sDBTable, CLAllObjectList<CL_DBCV> FieldList) {
        try {
            var sql = "UPDATE " + sDBTable + " SET ";
            int index = 0;
            int totalindex = FieldList.size();
            cnConn = DriverManager.getConnection(SQLLiteServerName + DBName);
            while (index < totalindex) {
                CL_DBCV Field = FieldList.get(index);
                String sField = Field.getsTableDBField();
                String sValue = Field.getsValue();
                sql = sql + "" + sField + " " + sValue;
                index++;
                if (index < totalindex) {
                    sql = sql + ",";
                }
            }
            sql = sql + ";";
            index = 0;
            var stmt = cnConn.prepareStatement(sql);
            while (index < totalindex) {
                CL_DBCV Field = FieldList.get(index);
                String sValue = Field.getsValue();
                index++;
                stmt.setString(index + 1, sValue);
            }
            stmt.executeUpdate();
        } catch (SQLException ex) {

            ShowSQLExceptionError(ex, " Error al actualizar datos en la base de datos desde el panel:" + sDBTable);
        }

    }

    public void MySQL_UpdateTable(String sDBTable, CLAllObjectList<CL_DBCV> DBParameters, String sIndex, String siIndexItem) {

        String Statement = "UPDATE " + this.DBName + "." + sDBTable + " SET ";
        ListIterator<CL_DBCV> mlIterador = DBParameters.listIterator();
        while (mlIterador.hasNext()) {
            CL_DBCV Elemento = mlIterador.next();
            Statement += Elemento.getsTableDBField() + "=?";
            if (mlIterador.hasNext()) {
                Statement += ",";
            }
        }
        Statement += " WHERE " + this.DBName + "." + sDBTable + "." + sIndex + " = " + siIndexItem;
        /*   if (DBParameters != null) {
            mlIterador = DBParameters.listIterator();
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                Statement += Elemento.getsTableDBField() + "=?";
                if (mlIterador.hasNext()) {
                    Statement += " AND ";
                }
            }*/
        Statement += " ;";
        int iindex = 1;
        mlIterador = DBParameters.listIterator();

        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                stSQLStat.setString(iindex, Elemento.getsValue());
                iindex++;
            }
            int iRes = stSQLStat.executeUpdate();

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al actualizar datos en la base de datos desde el panel:" + sDBTable);

        } finally {
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void DeleteDataTable(String sDBTable) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                DBMax.this.MySQL_DeleteDataTable(sDBTable);
            }
            case db_using_SQL_Lite -> {
                SQLLite_DeleteDataTable(sDBTable);
            }
            default -> {
                DBMax.this.MySQL_DeleteDataTable(sDBTable);
            }
        }
    }

    public void DeleteDataTable(String sDBTable, CL_DBCV Campo) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_DeleteDataTable(sDBTable, Campo);
            }
            case db_using_SQL_Lite -> {
                SQLLite_DeleteDataTable(sDBTable, Campo);
            }
            default -> {
                DBMax.this.MySQL_DeleteDataTable(sDBTable, Campo);
            }
        }
    }

    public void MySQL_DeleteDataTable(String sDBTable, CL_DBCV Campo) {

        String Statement = "DELETE FROM " + sDBTable + " WHERE " + Campo.getsTableDBField() + " = ?;";
        //idfi_lista_control_acceso = ?";
        int iRes = 0;
        setbError(false);
        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            stSQLStat.setString(1, Campo.getsValue());

            iRes = stSQLStat.executeUpdate();
            // setiInsertedLastRow(iRes);

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al borrar datos de la tabla:" + sDBTable);
        } finally {
            iRes = 0;
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void MySQL_DeleteDataTable(String sDBTable) {

        String Statement = "DELETE FROM " + sDBTable + ";";
        int iRes = 0;
        setbError(false);
        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            iRes = stSQLStat.executeUpdate();
            // setiInsertedLastRow(iRes);

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al borrar datos de la tabla:" + sDBTable);
        } finally {
            iRes = 0;
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void SQLLite_DeleteDataTable(String sDBTable) {
        try {
            var sql = "DELETE FROM " + this.DBName + "." + sDBTable + ";";
            cnConn = DriverManager.getConnection(SQLLiteServerName + DBName);
            var stmt = cnConn.createStatement();
            // create a new table
            stmt.executeQuery(sql);
        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al borrar datos de la tabla:" + sDBTable);
        }

    }

    public void SQLLite_DeleteDataTable(String sDBTable, CL_DBCV Campo) {
        try {
            var sql = "DELETE FROM " + sDBTable + " WHERE " + Campo.getsTableDBField() + " = ?;";
            cnConn = DriverManager.getConnection(SQLLiteServerName + DBName);
            var stmt = cnConn.createStatement();
            // create a new table
            stmt.executeQuery(sql);
        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al borrar datos de la tabla:" + sDBTable);
        }

    }

    public void InsertDatainDB(String sDBTable, ArrayList<String> Columns, CLAllObjectList<CL_DBCV> InsertFields) {
        switch (getDbusingpar()) {
            case db_using_MySQL -> {
                MySQL_InsertDatainDB(sDBTable, Columns, InsertFields);
            }
            case db_using_SQL_Lite -> {
                SQLLite_InsertDatainDB(sDBTable, InsertFields);
            }
            default -> {
                MySQL_InsertDatainDB(sDBTable, Columns, InsertFields);
            }
        }
    }

    public void InsertDatainDB(String sDBTable, CLAllObjectList<CL_DBCV> InsertFields) {
        switch (getDbusingpar()) {
            case db_using_MySQL -> {
                MySQL_InsertDatainDB(sDBTable, InsertFields);
            }
            case db_using_SQL_Lite -> {
                SQLLite_InsertDatainDB(sDBTable, InsertFields);
            }
            default -> {
                MySQL_InsertDatainDB(sDBTable, InsertFields);
            }
        }
    }

    public void MySQL_InsertDatainDB(String sDBTable, CLAllObjectList<CL_DBCV> InsertFields) {

        ListIterator<CL_DBCV> mlIterador = InsertFields.listIterator();
        String sDBInsertar = "INSERT INTO " + DBName + "." + sDBTable + "  ";
        sDBInsertar += "VALUES (";
        mlIterador = InsertFields.listIterator();
        while (mlIterador.hasNext()) {
            CL_DBCV Elemento = mlIterador.next();
            sDBInsertar += "?,?)";
            if (mlIterador.hasNext()) {
                sDBInsertar += ",(";
            }
        }
        sDBInsertar += ";";
        setbError(false);
        int iRes;
        try {
            stSQLStat = cnConn.prepareStatement(sDBInsertar);
            int itindex = 1;
            // stSQLStat.setString(1, AntiSQLInjection(sDBTable));
            mlIterador = InsertFields.listIterator();
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                stSQLStat.setInt(itindex, Integer.parseInt(Elemento.getsValue()));
                stSQLStat.setString(itindex + 1, Elemento.getsTableDBField());
                itindex = itindex + 2;
            }
            iRes = stSQLStat.executeUpdate();

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al insertar datos en la base de datos desde el panel:" + sDBTable);
        } finally {
            MySQL_WhenErrorCloseConnection();

        }

    }

    public void MySQL_InsertDatainDB(String sDBTable, ArrayList<String> ColumnsName, CLAllObjectList<CL_DBCV> InsertFields) {

        ListIterator<CL_DBCV> mlIterador = null;
        ListIterator<String> mlColIterador = ColumnsName.listIterator();
        String sDBInsertar = "INSERT INTO " + DBName + "." + sDBTable + "  (";

        while (mlColIterador.hasNext()) {
            String sElemento = mlColIterador.next();
            sDBInsertar += "\'" + sElemento + "\'";
            if (mlColIterador.hasNext()) {
                sDBInsertar += ",";
            }
        }
        sDBInsertar += ") VALUES (";
        mlIterador = InsertFields.listIterator();
        while (mlIterador.hasNext()) {
            CL_DBCV Elemento = mlIterador.next();
            sDBInsertar += "?,?";
            if (mlIterador.hasNext()) {
                sDBInsertar += ",";
            }
        }
        sDBInsertar += ");";
        setbError(false);
        int iRes;
        try {
            stSQLStat = cnConn.prepareStatement(sDBInsertar);
            int itindex = 1;
            mlIterador = InsertFields.listIterator();
            int lastitem = InsertFields.size();
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                stSQLStat.setString(itindex, String.format("%d", Integer.valueOf(Elemento.getsValue())));
                stSQLStat.setString(itindex + 1, Elemento.getsTableDBField());
                itindex = itindex + 2;
            }
            iRes = stSQLStat.executeUpdate();

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al insertar datos en la base de datos desde el panel:" + sDBTable);
        } finally {
            MySQL_WhenErrorCloseConnection();

        }

    }

    public void SQLLite_InsertDatainDB(String sDBTable, CLAllObjectList<CL_DBCV> InsertFields) {

        ListIterator<CL_DBCV> mlIterador = InsertFields.listIterator();
        String sDBInsertar = "INSERT INTO " + DBName + "." + sDBTable + "  ";
        sDBInsertar += "VALUES (";
        mlIterador = InsertFields.listIterator();
        while (mlIterador.hasNext()) {
            CL_DBCV Elemento = mlIterador.next();
            sDBInsertar += "?,?)";
            if (mlIterador.hasNext()) {
                sDBInsertar += ",(";
            }
        }
        sDBInsertar += ";";
        setbError(false);
        int iRes;
        try {
            stSQLStat = cnConn.prepareStatement(sDBInsertar);
            int itindex = 1;
            // stSQLStat.setString(1, AntiSQLInjection(sDBTable));
            mlIterador = InsertFields.listIterator();
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                stSQLStat.setInt(itindex, Integer.parseInt(Elemento.getsValue()));
                stSQLStat.setString(itindex + 1, Elemento.getsTableDBField());
                itindex = itindex + 2;
            }
            iRes = stSQLStat.executeUpdate();

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al insertar datos en la base de datos desde el panel:" + sDBTable);
        } finally {
            MySQL_WhenErrorCloseConnection();

        }

    }

    public void SQLLite_InsertDatainDB(String sDBTable, ArrayList<String> ColumnsName, CLAllObjectList<CL_DBCV> InsertFields) {
        ListIterator<CL_DBCV> mlIterador = null;
        ListIterator<String> mlColIterador = ColumnsName.listIterator();
        String sDBInsertar = "INSERT INTO " + DBName + "." + sDBTable + "  (";

        while (mlColIterador.hasNext()) {
            String sElemento = mlColIterador.next();
            sDBInsertar += "\'" + sElemento + "\'";
            if (mlColIterador.hasNext()) {
                sDBInsertar += ",";
            }
        }
        sDBInsertar += ") VALUES (";
        mlIterador = InsertFields.listIterator();
        while (mlIterador.hasNext()) {
            CL_DBCV Elemento = mlIterador.next();
            sDBInsertar += "?,?";
            if (mlIterador.hasNext()) {
                sDBInsertar += ",";
            }
        }
        sDBInsertar += ");";
        setbError(false);
        int iRes;
        try {
            stSQLStat = cnConn.prepareStatement(sDBInsertar);
            int itindex = 1;
            mlIterador = InsertFields.listIterator();
            int lastitem = InsertFields.size();
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                stSQLStat.setString(itindex, String.format("%d", Integer.valueOf(Elemento.getsValue())));
                stSQLStat.setString(itindex + 1, Elemento.getsTableDBField());
                itindex = itindex + 2;
            }
            iRes = stSQLStat.executeUpdate();

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al insertar datos en la base de datos desde el panel:" + sDBTable);
        } finally {
            MySQL_WhenErrorCloseConnection();

        }

    }

    public void TruncateTable(String sDBTable) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_TruncateTable(sDBTable);
            }
            case db_using_SQL_Lite -> {
                SQLLite_TruncateTable(sDBTable);
            }
            default -> {
                MySQL_TruncateTable(sDBTable);
            }
        }
    }

    public void MySQL_TruncateTable(String sDBTable) {

        var Statement = "TRUNCATE TABLE" + sDBTable + ";";
        int iRes = 0;
        setbError(false);
        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            iRes = stSQLStat.executeUpdate();
            // setiInsertedLastRow(iRes);

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al borrar los datos de la tabla:" + sDBTable);
        } finally {
            iRes = 0;
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void SQLLite_TruncateTable(String sDBTable) {
        try {
            var sql = "TRUNCATE TABLE" + sDBTable + ";";
            cnConn = DriverManager.getConnection(SQLLiteServerName + DBName);
            var stmt = cnConn.createStatement();
            // create a new table
            stmt.executeQuery(sql);
        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al borrar los datos de la tabla:" + sDBTable);
        }

    }

    public void DropTable(String sDBTable) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_DropTable(sDBTable);
            }
            case db_using_SQL_Lite -> {
                SQLLite_DropTable(sDBTable);
            }
            default -> {
                MySQL_DropTable(sDBTable);
            }
        }
    }

    public void SQLLite_DropTable(String sDBTable) {
        try {
            var sql = "DROP TABLE IF EXISTS " + this.DBName + "." + sDBTable + ";";
            cnConn = DriverManager.getConnection(SQLLiteServerName + DBName);
            var stmt = cnConn.createStatement();
            // create a new table
            stmt.executeQuery(sql);
        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al borrar los datos de la tabla:" + sDBTable);
        }

    }

    public void MySQL_DropTable(String sDBTable) {

        String Statement = "DROP TABLE IF EXISTS " + sDBTable + ";";
        int iRes = 0;
        setbError(false);
        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            iRes = stSQLStat.executeUpdate();
            // setiInsertedLastRow(iRes);

        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al borrar la tabla:" + sDBTable);
        } finally {
            iRes = 0;
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void SQLLite_Close() {
        try {

            cnConn = DriverManager.getConnection(SQLLiteServerName + DBName);
            cnConn.close();
            // create a new table

        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al cerrar la conexxión SQLLite:");
        }

    }

    public void Close() {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_CloseDSPoolConnection();
            }
            case db_using_SQL_Lite -> {
                SQLLite_Close();
            }
            default -> {
                MySQL_CloseDSPoolConnection();
            }
        }
    }

    void SQLLite_DriverInit(String DBName) {
        try (var conn = DriverManager.getConnection(SQLLiteServerName + DBName)) {
            if (conn != null) {
                var meta = conn.getMetaData();
                System.out.println(meta.getDriverName() + " driver initialized");
                //System.out.println("A new database has been created.");
            }
        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al inicializar el driver SQLLite:");
        }

    }

    public void MySQL_CloseDSPoolConnection() {

        setbError(false);

        try {
            if (cnConn != null) {
                cnConn.close();
                cnConn = null;
            }
        } catch (SQLException ex) {
            setIerrCode(ex.getErrorCode());
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            setbError(true);

        } finally {
            if (isbError()) {
                ShowSQLExceptionError(null, " Error al cerrar la conexión de MySQL:" + serrSQLMessage);
            }
        }

        try {
            if (rsCResSet != null) {
                rsCResSet.close();
                rsCResSet = null;
            }
        } catch (SQLException ex) {
            ShowSQLExceptionError(ex, " Error al cerrar el conjunto de la conexión de MySQL:");

        } finally {
            if (isbError()) {
                rsCResSet = null;
            }
        }

        if (getMcpdsDataOrigin() != null) {
            setMcpdsDataOrigin(null);
        }

    }

    public final void MySql_DSPoolInitSimple(String stmpURL, String sDBName, String stmpUser, String stmpPass) {
        setMcpdsDataOrigin(new MysqlConnectionPoolDataSource());
        getMcpdsDataOrigin().setServerName(sDefaultServerNConn);
        getMcpdsDataOrigin().setURL(stmpURL);
        getMcpdsDataOrigin().setUser(stmpUser);
        getMcpdsDataOrigin().setPassword(stmpPass);
        getMcpdsDataOrigin().setPortNumber(iPortNConn);
        getMcpdsDataOrigin().setDatabaseName(sDBName);

        SetupConnection();
        //  try {
        //      getMcpdsDataOrigin().setServerTimezone("UTC");
        //   }
        //   catch (SQLException ex) {
        //       Logger.getLogger(DBManagerGenerator.class.getName()).log(Level.SEVERE, null, ex);
        //   }
        //dspoolDataSrc.setPortNumber(getPortNumberConnection());
    }

    public void SetupConnection() {
        if (getMcpdsDataOrigin() != null) {
            try {
                cnConn = getMcpdsDataOrigin().getConnection();
            } catch (SQLException ex) {
                ShowSQLExceptionError(ex, " Error al configurar la la conexión de MySQL:");
            } finally {
                MySQL_WhenErrorCloseConnection();
            }
        }

    }

    private void MySQL_WhenErrorCloseConnection() {
        if (isbError()) {
            MySQL_CloseDSPoolConnection();
            ShowSQLExceptionError(null, " Error al cerrar la conexión de MySQL:");
        }
    }

    /**
     * @return the mcpdsDataOrigin
     */
    public MysqlConnectionPoolDataSource getMcpdsDataOrigin() {
        return mcpdsDataOrigin;
    }

    /**
     * @param mcpdsDataOrigin the mcpdsDataOrigin to set
     */
    public void setMcpdsDataOrigin(MysqlConnectionPoolDataSource mcpdsDataOrigin) {
        this.mcpdsDataOrigin = mcpdsDataOrigin;
    }

    /**
     * @return the bError
     */
    public boolean isbError() {
        return bError;
    }

    /**
     * @param bError the bError to set
     */
    public void setbError(boolean bError) {
        this.bError = bError;
    }

    /**
     * @return the ierrCode
     */
    public int getIerrCode() {
        return ierrCode;
    }

    /**
     * @param ierrCode the ierrCode to set
     */
    public void setIerrCode(int ierrCode) {
        this.ierrCode = ierrCode;
    }

    public int getLastRow(String sDBTable) {

        int iresult = 0;

        try {

            String Statement = "select count(*) from " + DBName + "." + sDBTable + ";";

            stSQLStat = cnConn.prepareStatement(Statement);
            ResultSet rs = stSQLStat.executeQuery();
            while (rs.next()) {
                iresult = rs.getInt("count(*)");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        //return iresult;
        /*
        try {
            isokrow=rsCResSet.last(); //go to last row;
        }
        catch (SQLException ex) {
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            // ShowDError(" Error al desplazarme al último registro , conjunto de datos  " + rsCResSet.toString() + "." + serrSQLMessage);
            //  MySQL_CloseDSPoolConnection();
        }
        try {
            iresult = rsCResSet.getRow();
        }

        catch (SQLException ex) {
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            // ShowDError(" Error al desplazarme al último registro , conjunto de datos  " + rsCResSet.toString() + "." + serrSQLMessage);
            //  MySQL_CloseDSPoolConnection();
        }
         try {
            isokrow=rsCResSet.first(); //go to forst row;
        }
        catch (SQLException ex) {
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            // ShowDError(" Error al desplazarme al último registro , conjunto de datos  " + rsCResSet.toString() + "." + serrSQLMessage);
            //  MySQL_CloseDSPoolConnection();
        }
        return iresult;
    }

    public int getActualRow() {

        int iresult = 0;

        setbError(false);

        try {
            iresult = rsCResSet.getRow();

        }
        catch (SQLException ex) { // ignore }
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{this.getClass()
                .getName(), ex.getLocalizedMessage()});
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            iresult = 0;
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            // ShowDError(" Error al obtener registro actual, conjunto de datos  " + rsCResSet.toString() + "." + serrSQLMessage);
            //  MySQL_CloseDSPoolConnection();
        }
        finally {
            MySQL_WhenErrorCloseConnection();

        }*/

        return iresult;

    }

    public void ExecuteQueryTableDBWithOptions(String sDB) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_ExecuteQueryTableDBWithOptions(sDB);
            }
            case db_using_SQL_Lite -> {
                SQLLite_ExecuteQueryTableDBWithOptions(sDB);
            }
            default -> {
                MySQL_ExecuteQueryTableDBWithOptions(sDB);
            }
        }
    }

    public void SQLLite_ExecuteQueryTableDBWithOptions(String sDB) {

        String Statement = sDB;
        boolean bRes = false;
        setbError(false);

        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            bRes = stSQLStat.execute();

        } catch (SQLException ex) { // ignore }
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{this.getClass()
                .getName(), ex.getLocalizedMessage()});
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            // ShowDError(" Error al actualizar datos fichero  " + stSQLStat + "." + serrSQLMessage);
            // rsCResSet = null;
            // setiInsertedLastRow(0);
            //  iRes = 0;
            // MySQL_CloseDSPoolConnection();
        } finally {
            bRes = false;
            Close();

        }
    }

    public void MySQL_ExecuteQueryTableDBWithOptions(String sDB) {

        String Statement = sDB;
        boolean bRes = false;
        setbError(false);

        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            bRes = stSQLStat.execute();

        } catch (SQLException ex) { // ignore }
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{this.getClass()
                .getName(), ex.getLocalizedMessage()});
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            // ShowDError(" Error al actualizar datos fichero  " + stSQLStat + "." + serrSQLMessage);
            // rsCResSet = null;
            // setiInsertedLastRow(0);
            //  iRes = 0;
            // MySQL_CloseDSPoolConnection();
        } finally {
            bRes = false;
            MySQL_WhenErrorCloseConnection();

        }
    }

    public CLAllObjectList<String> LoadList(String sTable, String Scolumnname) {
        CLAllObjectList<String> LCA = new CLAllObjectList<>(1);
        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                LCA = MySQL_LoadList(sTable, Scolumnname);
            }
            case db_using_SQL_Lite -> {
                LCA = SQLLite_LoadList(sTable, Scolumnname);
            }
            default -> {
                LCA = MySQL_LoadList(sTable, Scolumnname);
            }
        }
        return LCA;
    }

    public void SelectAllRecordsWithSQLParams(String sSQLParams, CLAllObjectList<String> DBParameters) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_SelectAllRecordWithDefinedStatement(sSQLParams, DBParameters);
            }
            case db_using_SQL_Lite -> {
                CLAllObjectList<CL_DBCV> FieldList = new CLAllObjectList<>();
                // FieldList.add(new CL_DBCV(DBParameters, sFieldValuetoSearch));
                SQLLite_SelectManyResults(DBName, FieldList);
            }
            default -> {
                MySQL_SelectAllRecordWithDefinedStatement(sSQLParams, DBParameters);
            }
        }

    }

    public void MySQL_SelectAllRecordWithDefinedStatement(String sSQLParams, CLAllObjectList<String> DBParameters) {
        setbError(false);
        String Statement = sSQLParams;

        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            if (DBParameters != null) {
                String DBCampo = null;
                int iindex = 1, lastpar = 0;
                lastpar = DBParameters.size();

                for (iindex = 1; iindex <= lastpar; iindex++) {
                    DBCampo = DBParameters.get(iindex - 1);
                    if (DBCampo != null) {
                        stSQLStat.setString(iindex, DBCampo);
                    }
                }
            }
            //    stSQLStat.setString(1, sTable);

            //       stSQLStat = cnConn.createStatement();
            rsCResSet = stSQLStat.executeQuery();

            rsCResSet.next();
        } catch (SQLException ex) { // ignore }
            ShowSQLExceptionError(ex, " Error al cargar datos de la tabla:" + sSQLParams);
        } catch (NullPointerException ex) {
            ierrCode = 0xF555;
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = "error, no puedo conectar al servidor";
            ShowSQLExceptionError(null, serrSQLState);

        } finally {
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void MySQL_SelectAllRecords(String sTable) {
        String Statement = "SELECT * FROM " + DBName + "." + sTable + ";";
        MySQL_SelectAllRecordWithDefinedStatement(Statement, null);
    }

    public void SQLLite_SelectAllRecords(String sTable) {
        String Statement = "SELECT * FROM " + DBName + "." + sTable + ";";
        SQLLite_SelectManyResults(Statement, null);
    }

    public CLAllObjectList<String> MySQL_LoadList(String sTable, String Scolumnname) {
        CLAllObjectList<String> LCA = new CLAllObjectList<String>(1);
        int Count = getLastRow(sTable);
        MySQL_SelectAllRecords(sTable);
        try {
            rsCResSet.first();
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }

        for (int it = 0; it < Count; it++) {
            String sTmp_01 = getQueryResult(Scolumnname);
            LCA.add(sTmp_01);
            try {
                rsCResSet.next();
            } catch (SQLException ex) {
                ShowSQLExceptionError(ex, " Error al cargar datos de la tabla:" + sTable);
            }
        }
        return LCA;
    }

    public CLAllObjectList<String> SQLLite_LoadList(String sTable, String Scolumnname) {
        CLAllObjectList<String> LCA = new CLAllObjectList<>(1);
        int Count = getLastRow(sTable);
        MySQL_SelectAllRecords(sTable);
        try {
            rsCResSet.first();
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }

        for (int it = 0; it < Count; it++) {
            String sTmp_01 = getQueryResult(Scolumnname);
            LCA.add(sTmp_01);
            try {
                rsCResSet.next();
            } catch (SQLException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return LCA;
    }

    public String getQueryResult(String sTmpDBField) {
        String sResFieldSearched = "";

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                sResFieldSearched = MySQL_getQueryResult(sTmpDBField);
            }
            case db_using_SQL_Lite -> {
                String sFieldValuetoSearch = "";
                CLAllObjectList<CL_DBCV> FieldList = new CLAllObjectList<>();
                FieldList.add(new CL_DBCV(sTmpDBField, sFieldValuetoSearch));
                SQLLite_SelectManyResults(DBName, FieldList);
                sResFieldSearched = FieldList.get(0).getsValue();
            }
            default -> {
                sResFieldSearched = MySQL_getQueryResult(sTmpDBField);
            }
        }
        return sResFieldSearched;

    }

    public String MySQL_getQueryResult(String sTmpDBField) {

        String sResFieldSearched = "";
        String sFieldDataRowSearched = "";

        setbError(false);

        try {
            sFieldDataRowSearched = rsCResSet.getString(sTmpDBField);

        } catch (SQLException ex) { // ignore }
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{this.getClass().getName(), ex.getLocalizedMessage()});
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            sFieldDataRowSearched = "";
            //LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            // ShowDError(" Error al efectuar la consulta de datos " + sTmpDBField + "." + serrSQLMessage);
            //CloseDSPoolConnection();
        } finally {
            MySQL_WhenErrorCloseConnection();

        }

        if (CompareDBStr(sFieldDataRowSearched, "") == false) {
            sResFieldSearched = sFieldDataRowSearched;
        }

        return sResFieldSearched;

    }

    public boolean CompareDBStr(String sTmpStr1, String sTmpStr2) {

        boolean bresult = false;
        int icresult = -1;

        if ((sTmpStr1 == null) || (sTmpStr2 == null)) {
        } else {

            icresult = sTmpStr1.compareTo(sTmpStr2);

            if (icresult == 0) {
                bresult = true;
            }
        }
        return bresult;
    }

    public void UpdateDatainDB(String sDBTable, CLAllObjectList<CL_DBCV> DBParameters, String sIndex, String siIndexItem) {

        switch (getDbusingpar()) {

            case db_using_MySQL -> {
                MySQL_UpdateDatainDB(sDBTable, DBParameters, sIndex, siIndexItem);
            }
            case db_using_SQL_Lite -> {
                SQLLite_UpdateDatainDB(sDBTable, DBParameters, sIndex, siIndexItem);
            }
            default -> {
                MySQL_UpdateDatainDB(sDBTable, DBParameters, sIndex, siIndexItem);
            }
        }
    }

    public void MySQL_UpdateDatainDB(String sDBTabla, CLAllObjectList<CL_DBCV> DBParameters, String sIndex, String siIndexItem) {

        String Statement = "UPDATE " + DBName + "." + sDBTabla + " SET ";
        ListIterator<CL_DBCV> mlIterador = DBParameters.listIterator();
        while (mlIterador.hasNext()) {
            CL_DBCV Elemento = mlIterador.next();
            Statement += Elemento.getsTableDBField() + "=?";
            if (mlIterador.hasNext()) {
                Statement += ",";
            }
        }
        Statement += " WHERE " + DBName + "." + sDBTabla + "." + sIndex + " = " + siIndexItem;
        /*   if (DBParameters != null) {
            mlIterador = DBParameters.listIterator();
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                Statement += Elemento.getsTableDBField() + "=?";
                if (mlIterador.hasNext()) {
                    Statement += " AND ";
                }
            }*/
        Statement += " ;";
        int iindex = 1;
        mlIterador = DBParameters.listIterator();
        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            /*mlIterador = DBParameters.listIterator();
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                stSQLStat.setString(iindex, Elemento.getsTableDBField());
                iindex++;
            }*/
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                stSQLStat.setString(iindex, Elemento.getsValue());
                iindex++;
            }

        } catch (SQLException ex) { // ignore }
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            // rsCResSet = null;
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            ShowDError(" Error al insertar datos en la base de datos desde el panel:" + sDBTabla + "." + serrSQLMessage);

            // CloseDSPoolConnection();
        } finally {
            MySQL_WhenErrorCloseConnection();

        }

        try {
            int iRes = stSQLStat.executeUpdate();

        } catch (SQLException ex) { // ignore }
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            // ShowDError(" Error al insertar datos en la base de datos desde el panel:" + sDBTabla + "." + serrSQLMessage);
            //   rsCResSet = null;

        } finally {
            MySQL_WhenErrorCloseConnection();

        }
    }

    public void SQLLite_UpdateDatainDB(String sDBTabla, CLAllObjectList<CL_DBCV> DBParameters, String sIndex, String siIndexItem) {

        String Statement = "UPDATE " + DBName + "." + sDBTabla + " SET ";
        ListIterator<CL_DBCV> mlIterador = DBParameters.listIterator();
        while (mlIterador.hasNext()) {
            CL_DBCV Elemento = mlIterador.next();
            Statement += Elemento.getsTableDBField() + "=?";
            if (mlIterador.hasNext()) {
                Statement += ",";
            }
        }
        Statement += " WHERE " + DBName + "." + sDBTabla + "." + sIndex + " = " + siIndexItem;
        /*   if (DBParameters != null) {
            mlIterador = DBParameters.listIterator();
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                Statement += Elemento.getsTableDBField() + "=?";
                if (mlIterador.hasNext()) {
                    Statement += " AND ";
                }
            }*/
        Statement += " ;";
        int iindex = 1;
        mlIterador = DBParameters.listIterator();
        try {
            stSQLStat = cnConn.prepareStatement(Statement);
            /*mlIterador = DBParameters.listIterator();
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                stSQLStat.setString(iindex, Elemento.getsTableDBField());
                iindex++;
            }*/
            while (mlIterador.hasNext()) {
                CL_DBCV Elemento = mlIterador.next();
                stSQLStat.setString(iindex, Elemento.getsValue());
                iindex++;
            }

        } catch (SQLException ex) { // ignore }
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            // rsCResSet = null;
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            ShowDError(" Error al insertar datos en la base de datos desde el panel:" + sDBTabla + "." + serrSQLMessage);

            // CloseDSPoolConnection();
        } finally {
            Close();

        }

        try {
            int iRes = stSQLStat.executeUpdate();

        } catch (SQLException ex) { // ignore }
            setbError(true);
            ierrCode = ex.getErrorCode();
            serrSQLMessage = ex.getLocalizedMessage();
            serrSQLState = ex.getSQLState();
            LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
            // ShowDError(" Error al insertar datos en la base de datos desde el panel:" + sDBTabla + "." + serrSQLMessage);
            //   rsCResSet = null;

        } finally {
            Close();

        }
    }

    /**
     * @return the dbusingpar
     */
    public int getDbusingpar() {
        return dbusingpar;
    }

    /**
     * @param dbusingpar the dbusingpar to set
     */
    public void setDbusingpar(int dbusingpar) {
        this.dbusingpar = dbusingpar;
    }

    public void ShowSQLExceptionError(SQLException ex, String sError) {
        setbError(true);
        ierrCode = ex.getErrorCode();
        serrSQLMessage = ex.getLocalizedMessage();
        serrSQLState = ex.getSQLState();
        // rsCResSet = null;
        LoggingManagerGenerator.getGlobalLogger().log(Level.SEVERE, "{0}. Estado {1}", new Object[]{serrSQLMessage, serrSQLState});
        ShowDError(sError + "." + serrSQLMessage);
    }
}

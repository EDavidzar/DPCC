/*
 * To change this template, choose Tools | Templates
 * *
 */
package ccpd.es.p8classes;

/**
 *
 * @author Emilio David Diaus López 2023-2025
 */
public class CL_DBCV {

    private String sValue = null;
    private String sTableDBField = null;

    public CL_DBCV() {
        sTableDBField = "";
        sValue = "";
    }

    public CL_DBCV(String tmpsTableDBField, String tmpsValue) {
        sTableDBField = tmpsTableDBField;
        sValue = tmpsValue;
    }

    /**
     * @return the sValue
     */
    public String getsValue() {
        return sValue;
    }

    /**
     * @param sValue the sValue to set
     */
    public void setsValue(String sValue) {
        this.sValue = sValue;
    }

    /**
     * @return the sTableDBField
     */
    public String getsTableDBField() {
        return sTableDBField;
    }

    /**
     * @param sTableDBField the sTableDBField to set
     */
    public void setsTableDBField(String sTableDBField) {
        this.sTableDBField = sTableDBField;
    }
}

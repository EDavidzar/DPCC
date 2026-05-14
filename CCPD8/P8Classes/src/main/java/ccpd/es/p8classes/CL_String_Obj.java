/*
 * To change this template, choose Tools | Templates
 * *
 */
package ccpd.es.p8classes;

/**
 *
 * @author Emilio David Diaus López 2008-2021
 */
public class CL_String_Obj {

    private String sTableDBField = null;
    private Object oPanelObject = null;

    public CL_String_Obj() {
        sTableDBField = "";
    }

    public CL_String_Obj(String tmpCB, Object OP) {
        sTableDBField = tmpCB;
        oPanelObject = OP;
    }

    /**
     * @return the sTableDBField
     */
    public String getsTableDBField() {
        return sTableDBField;
    }

    /**
     * @param stmpsTableDBField the stmpsTableDBField to set
     */
    public void setsTableDBField(String stmpsTableDBField) {
        this.sTableDBField = stmpsTableDBField;
    }

    /**
     * @return the oPanelObject
     */
    public Object getoPanelObject() {
        return oPanelObject;
    }

    /**
     * @param ObjetoPanel the ObjetoPanel to set
     */
    public void setoPanelObject(Object ObjetoPanel) {
        this.oPanelObject = ObjetoPanel;
    }
}

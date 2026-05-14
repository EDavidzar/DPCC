/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccpd.es.p8windows;

import static beleris.es.finalinformationmanager.MainErrorManager.ShowDError;
import static ccpd.es.p8config.P8Config.PConfig;
import java.util.Set;
import org.openide.windows.TopComponent;
import static org.openide.windows.WindowManager.getDefault;
import java.awt.Component;

/**
 *
 * @author Emilio David Diaus López 2008-2021
 */
public class AddComponenttoTopCom {

    private PrincipalWindowTopComponent ftc = null;

    AddComponenttoTopCom() {

    }

    public void AddComponenttoTopCom(Component JPA) {

        Set<TopComponent> openTopComponents = getDefault().getRegistry().getOpened();
        if (PConfig.isUserAuthenticated()) {
            for (TopComponent stc : openTopComponents) {
                if ("Ventana Principal".equals(stc.getName())) {
                    setFtc((PrincipalWindowTopComponent) stc);
                    getFtc().getjPOperationsPanel().invalidate();
                    getFtc().getjPOperationsPanel().removeAll();
                    getFtc().getjPOperationsPanel().add(JPA);
                    getFtc().getjPOperationsPanel().revalidate();
                    getFtc().getjPOperationsPanel().repaint();
                }

            }
        } else {
            ShowDError("Usuario no Autenticado");
        }
    }

    /**
     *
     */
    public static AddComponenttoTopCom TCUtils = new AddComponenttoTopCom();

    /**
     * @return the ftc
     */
    public PrincipalWindowTopComponent getFtc() {
        return ftc;
    }

    /**
     * @param ftc the ftc to set
     */
    public void setFtc(PrincipalWindowTopComponent ftc) {
        this.ftc = ftc;
    }
}

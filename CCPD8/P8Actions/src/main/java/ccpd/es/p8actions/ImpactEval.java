/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import static beleris.es.finalinformationmanager.MainErrorManager.ShowDError;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8panels.Panel_TableDBManager;
import static ccpd.es.p8windows.AddComponenttoTopCom.TCUtils;
import ccpd.es.p8windows.PrincipalWindowTopComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import static org.openide.windows.WindowManager.getDefault;

@ActionID(
        category = "File",
        id = "ccpd.es.p8actions.ImpactEval"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/carpeta.png",
        displayName = "#CTL_ImpactEval"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1500),
    @ActionReference(path = "Toolbars/File", position = 190),
    @ActionReference(path = "Shortcuts", name = "DS-N")
})
@Messages("CTL_ImpactEval=Evaluaciones de Impacto")
public final class ImpactEval implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Set<TopComponent> openTopComponents = getDefault().getRegistry().getOpened();
        PrincipalWindowTopComponent ftc = null;
        if (PConfig.isUserAuthenticated()) {
            for (TopComponent stc : openTopComponents) {
                if ("Ventana Principal".equals(stc.getName())) {
                    ftc = (PrincipalWindowTopComponent) stc;
                }
                if (ftc != null) {
                    Panel_TableDBManager CLOP = new Panel_TableDBManager("ccpd_lists", "list_impact_evaluation");
                    TCUtils.AddComponenttoTopCom(CLOP);

                } else {
                    ShowDError("Usuario no Autenticado");

                }

            }

        }
}
}

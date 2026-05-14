/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import static beleris.es.finalinformationmanager.MainErrorManager.ShowDError;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8panels.PCreatingReportDocument;
import ccpd.es.p8panels.PFillingReportQuestions;
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
        id = "ccpd.es.p8actions.CompaintReport"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/informe.png",
        displayName = "#CTL_CompaintReport"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1320),
    @ActionReference(path = "Toolbars/File", position = 120),
    @ActionReference(path = "Shortcuts", name = "DOS-R")
})
@Messages("CTL_CompaintReport=Rellenar informe de cumplimiento")
public final class CompaintReport implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        PConfig.BackupHelpconfig();
        PConfig.setHelpConfig("Rellenar nforme de cumplimiento", "infocumpli", "rellenacumpli.html");
        Set<TopComponent> openTopComponents = getDefault().getRegistry().getOpened();
        PrincipalWindowTopComponent ftc = null;
        if (PConfig.isUserAuthenticated()) {
            for (TopComponent stc : openTopComponents) {
                if ("Ventana Principal".equals(stc.getName())) {
                    ftc = (PrincipalWindowTopComponent) stc;
                }
                if (ftc != null) {
                    if (PConfig.isUserAuthenticated() == true && PConfig.isClientActivated() == true && PConfig.isEntityActivated() == true) {
                        PFillingReportQuestions PFRQ = new PFillingReportQuestions();
                         TCUtils.AddComponenttoTopCom(PFRQ);
                    } else {
                        ShowDError("Debe dar de alta y seleccionar un cliente y una empresa para poder continuar ...");
                    }
                   

                } else {
                    ShowDError("Usuario no Autenticado");

                }

            }
        }
    }

}

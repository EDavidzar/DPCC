/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import static beleris.es.finalinformationmanager.MainErrorManager.ShowDError;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8panels.PCreatingReportDocument;
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
        id = "ccpd.es.p8actions.ShowComplaintReport"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/reform.png",
        displayName = "#CTL_ShowComplaintReport"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1360),
    @ActionReference(path = "Toolbars/File", position = 170),
    @ActionReference(path = "Shortcuts", name = "DS-V")
})
@Messages("CTL_ShowComplaintReport=Ver Informe de Cumplimiento")
public final class ShowComplaintReport implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        PConfig.BackupHelpconfig();
        PConfig.setHelpConfig("Ver el informe de cumplimiento", "infocumpli", "createinfocumpli.html");
        Set<TopComponent> openTopComponents = getDefault().getRegistry().getOpened();
        PrincipalWindowTopComponent ftc = null;
        if (PConfig.isUserAuthenticated()) {
            for (TopComponent stc : openTopComponents) {
                if ("Ventana Principal".equals(stc.getName())) {
                    ftc = (PrincipalWindowTopComponent) stc;
                }
                if (ftc != null) {
                    PCreatingReportDocument ReportDoc = new PCreatingReportDocument(PConfig.getActualClient());
                    TCUtils.AddComponenttoTopCom(ReportDoc);

                } else {
                    ShowDError("Usuario no Autenticado");

                }

            }
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import static beleris.es.finalinformationmanager.MainErrorManager.ShowDError;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8panels.JPCreateOtherDocuments;
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
        id = "ccpd.es.p8actions.CreateDocs"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/guardar.png",
        displayName = "#CTL_CreateDocs"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1500),
    @ActionReference(path = "Toolbars/File", position = 240),
    @ActionReference(path = "Shortcuts", name = "DS-D")
})
@Messages("CTL_CreateDocs=Crear otros  Documentos")
public final class CreateDocs implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        PConfig.BackupHelpconfig();
        PConfig.setHelpConfig("Crear otros documentos", "creardocs", "creardocumentos.html");
        Set<TopComponent> openTopComponents = getDefault().getRegistry().getOpened();
        PrincipalWindowTopComponent ftc = null;
        if (PConfig.isUserAuthenticated()) {
            for (TopComponent stc : openTopComponents) {
                if ("Ventana Principal".equals(stc.getName())) {
                    ftc = (PrincipalWindowTopComponent) stc;
                }
                if (ftc != null) {
                    JPCreateOtherDocuments CAPDOC = new JPCreateOtherDocuments();
                    TCUtils.AddComponenttoTopCom(CAPDOC);

                } else {
                    ShowDError("Usuario no Autenticado");

                }

            }

        }
    }

}

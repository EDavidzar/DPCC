/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import beleris.es.finalinformationmanager.MainErrorManager;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8dialogs.AuthenticationDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(
        category = "File",
        id = "ccpd.es.p8actions.AuthenticateUser"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/autenticacion.png",
        displayName = "#CTL_AuthenticateUser"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1200, separatorBefore = 1150, separatorAfter = 1250),
    @ActionReference(path = "Toolbars/File", position = 100),
    @ActionReference(path = "Shortcuts", name = "DS-A")
})
@Messages("CTL_AuthenticateUser=Autenticar Usuario")
public final class AuthenticateUser implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        

        if (!PConfig.isUserAuthenticated()) {
            Frame f = WindowManager.getDefault().getMainWindow();
            AuthenticationDialog ClientAutenticating = new AuthenticationDialog(f, true);
            ClientAutenticating.setLocationRelativeTo(f);
            ClientAutenticating.setVisible(true);
            PConfig.setUserAuthenticated(ClientAutenticating.isUserAuthenticated());
            if (PConfig.isUserAuthenticated()) {
                PConfig.setActualClient(ClientAutenticating.getActualUser());
            }
        } else {
            MainErrorManager.ShowDWarning("Usuario ya autenticado ...");
        }

    }
}

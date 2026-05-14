/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8dialogs.DListSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import java.awt.Frame;
import org.openide.windows.WindowManager;

@ActionID(
        category = "File",
        id = "ccpd.es.p8actions.ClientsActions"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/client.png",
        displayName = "#CTL_ClientsActions"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 950),
    @ActionReference(path = "Toolbars/File", position = 130),
    @ActionReference(path = "Shortcuts", name = "DS-C")
})
@Messages("CTL_ClientsActions=Seleccionar Clientes")
public final class ClientsActions implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        PConfig.BackupHelpconfig();    
        PConfig.setHelpConfig("Seleccionar un cliente", "seleccion", "selclientes.html");
        Frame f = WindowManager.getDefault().getMainWindow();
        DListSelection DLS = new DListSelection(f, true, DListSelection.getiClientDialogSelection());
        DLS.setLocationRelativeTo(f);
        DLS.setVisible(true);
        
    }
}

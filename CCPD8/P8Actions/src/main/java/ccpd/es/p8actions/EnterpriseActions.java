/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import beleris.es.finalutils.NewHelpPresenter;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8dialogs.DListSelection;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(
        category = "File",
        id = "ccpd.es.p8actions.EnterpriseActions"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/enterprise.png",
        displayName = "#CTL_EnterpriseActions"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1030),
    @ActionReference(path = "Toolbars/File", position = 140),
    @ActionReference(path = "Shortcuts", name = "DS-E")
})
@Messages("CTL_EnterpriseActions=Seleccionar empresas")
public final class EnterpriseActions implements ActionListener {
  

    @Override
    public void actionPerformed(ActionEvent e) {
        PConfig.BackupHelpconfig();    
        PConfig.setHelpConfig("Seleccionar una empresa", "seleccion", "selempresas.html");
        Frame f = WindowManager.getDefault().getMainWindow();
        DListSelection DLS = new DListSelection(f, true, DListSelection.getiEntityDialogSelection());
        DLS.setLocationRelativeTo(f);
        DLS.setVisible(true);
    }
}

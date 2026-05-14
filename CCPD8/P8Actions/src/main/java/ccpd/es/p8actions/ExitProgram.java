/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import static beleris.es.finalinformationmanager.MainErrorManager.AcceptInformation;
import static ccpd.es.p8dialogs.ShowHelpDialog.mconfyes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static org.openide.LifecycleManager.getDefault;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "ccpd.es.p8actions.ExitProgram"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/salida.png",
        displayName = "#CTL_ExitProgram"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1750, separatorBefore = 1725, separatorAfter = 1775),
    @ActionReference(path = "Toolbars/File", position = 290),
    @ActionReference(path = "Shortcuts", name = "DS-X")
})
@Messages("CTL_ExitProgram=Salir del Programa")
public final class ExitProgram implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        int ntf = AcceptInformation("¿Está seguro de que quiere salir del programa?");
        if (ntf == mconfyes) {
            getDefault().exit();
        }
    }

}

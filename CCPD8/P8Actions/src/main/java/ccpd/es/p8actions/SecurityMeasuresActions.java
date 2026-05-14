/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "ccpd.es.p8actions.SecurityMeasuresActions"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/secmed.png",
        displayName = "#CTL_SecurityMeasuresActions"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1110),
    @ActionReference(path = "Toolbars/File", position = 160),
    @ActionReference(path = "Shortcuts", name = "DS-S")
})
@Messages("CTL_SecurityMeasuresActions=Medidas de Seguridad")
public final class SecurityMeasuresActions implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}

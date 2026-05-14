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
        id = "ccpd.es.p8actions.RiskTreatMentActions"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/riesgos.png",
        displayName = "#CTL_RiskTreatMentActions"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1070),
    @ActionReference(path = "Toolbars/File", position = 150),
    @ActionReference(path = "Shortcuts", name = "DS-T")
})
@Messages("CTL_RiskTreatMentActions=Riesgos del Tratamiento")
public final class RiskTreatMentActions implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}

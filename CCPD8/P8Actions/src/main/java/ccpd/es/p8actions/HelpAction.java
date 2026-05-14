/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import beleris.es.finalutils.NewHelpPresenter;
import static ccpd.es.p8config.P8Config.PConfig;
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
        category = "Tools",
        id = "ccpd.es.p8actions.HelpAction"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/ayuda.png",
        displayName = "#CTL_HelpAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Tools", position = 1700),
    @ActionReference(path = "Toolbars/File", position = 220),
    @ActionReference(path = "Shortcuts", name = "F1"),
    @ActionReference(path = "Shortcuts", name = "D-H")
})
@Messages("CTL_HelpAction=Ayuda")
public final class HelpAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Frame f = WindowManager.getDefault().getMainWindow();
        //FHelpPresenter DHelp = new FHelpPresenter("Registro de control de Seguridad", "help/NewGeneralDataIntroPanels-PSRC.html");
        NewHelpPresenter DHelp = new NewHelpPresenter(f, true, "Ayuda del " + PConfig.getHelpTitleModule(), PConfig.getApplicationPath() + "/help/" + PConfig.getHelpModule() + "/" + PConfig.getHelpFileModule());
        DHelp.setLocationRelativeTo(f);
        DHelp.setVisible(true);

    }
}

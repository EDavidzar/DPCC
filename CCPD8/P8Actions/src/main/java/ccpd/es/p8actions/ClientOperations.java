/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import beleris.es.finalprimaryclasses.CLAllObjectList;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8panels.Panel_TableDBManager;
import static ccpd.es.p8windows.AddComponenttoTopCom.TCUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "ccpd.es.p8actions.ClientOperations"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/camara.png",
        displayName = "#CTL_ClientOperations"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 990),
    @ActionReference(path = "Toolbars/File", position = 280),
    @ActionReference(path = "Shortcuts", name = "DS-I")
})

@Messages("CTL_ClientOperations=Operaciones con Clientes")
public final class ClientOperations implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        PConfig.BackupHelpconfig();    
        PConfig.setHelpConfig("Operaciones con clientes", "operaciones", "operclientes.html");
        CLAllObjectList<String> ColumnsNames = new CLAllObjectList<>();
        ColumnsNames.add("Número ID");
        ColumnsNames.add("Nombre");
        ColumnsNames.add("Apellidos");
        ColumnsNames.add("Dirección");
        ColumnsNames.add("NIF");
        ColumnsNames.add("Región");
        ColumnsNames.add("Provincia");
        ColumnsNames.add("País");
        ColumnsNames.add("Localización");
        ColumnsNames.add("Código Postal");
        ColumnsNames.add("Teléfono");
        ColumnsNames.add("Fax");
        ColumnsNames.add("e-mail");
        ColumnsNames.add("Webpage");
        ColumnsNames.add("Su empresa");
        ColumnsNames.add("usuario o apodo");
        Panel_TableDBManager CLOP = new Panel_TableDBManager("ccpd_clients", "dbclients", PConfig.getActualClient().getsIDClient(), PConfig.getActualEnterprise().getsIDEnterprise(), ColumnsNames, "Operaciones con clientes");
        TCUtils.AddComponenttoTopCom(CLOP);        
    }
}

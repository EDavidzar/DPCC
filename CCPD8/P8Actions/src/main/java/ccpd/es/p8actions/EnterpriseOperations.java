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
        id = "ccpd.es.p8actions.EnterpriseOperations"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/enterprise.png",
        displayName = "#CTL_EnterpriseOperations"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1040),
    @ActionReference(path = "Toolbars/File", position = 150),
    @ActionReference(path = "Shortcuts", name = "DS-N")
})
@Messages("CTL_EnterpriseOperations=Operaciones con las Empresas")
public final class EnterpriseOperations implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        PConfig.BackupHelpconfig();
        PConfig.setHelpConfig("Operaciones con empresas", "operaciones", "operempresas.html");
        CLAllObjectList<String> ColumnsNames = new CLAllObjectList<>();
        ColumnsNames.add("Número ID");
        ColumnsNames.add("Nombre del Administrador o Empresa");
        ColumnsNames.add("NIF empresa");
        ColumnsNames.add("Nombre del representante");
        ColumnsNames.add("Apellidos del representante");
        ColumnsNames.add("NIF");
        ColumnsNames.add("Dirección");
        ColumnsNames.add("Región");
        ColumnsNames.add("Provincia");
        ColumnsNames.add("País");
        ColumnsNames.add("Localización");
        ColumnsNames.add("Código Postal");
        ColumnsNames.add("Teléfono");
        ColumnsNames.add("Fax");
        ColumnsNames.add("e-mail");
        ColumnsNames.add("Webpage");
        ColumnsNames.add("cliente");
        ColumnsNames.add("empresa");

        Panel_TableDBManager ENOP = new Panel_TableDBManager("ccpd_enterprises", "generaldata_treatmentmanager", PConfig.getActualClient().getsIDClient(), PConfig.getActualEnterprise().getsIDEnterprise(), ColumnsNames,"Operaciones con empresas");
        TCUtils.AddComponenttoTopCom(ENOP);
    }
}

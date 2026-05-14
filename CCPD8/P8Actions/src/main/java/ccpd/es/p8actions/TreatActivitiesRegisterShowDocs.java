/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package ccpd.es.p8actions;

import static beleris.es.finalinformationmanager.MainErrorManager.ShowDError;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8pdfmanager.P8PdfManager;
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
        id = "ccpd.es.p8actions.TreatActivitiesRegisterShowDocs"
)
@ActionRegistration(
        iconBase = "ccpd/es/p8actions/actregtrat.png",
        displayName = "#CTL_TreatActivitiesRegisterShowDocs"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1280),
    @ActionReference(path = "Toolbars/File", position = 200),
    @ActionReference(path = "Shortcuts", name = "DS-M")
})

@Messages("CTL_TreatActivitiesRegisterShowDocs=Mostrar Documentos de registro de actividad")
public final class TreatActivitiesRegisterShowDocs implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Set<TopComponent> openTopComponents = getDefault().getRegistry().getOpened();
        PrincipalWindowTopComponent ftc = null;
        if (PConfig.isUserAuthenticated()) {
            for (TopComponent stc : openTopComponents) {
                if ("Ventana Principal".equals(stc.getName())) {
                    ftc = (PrincipalWindowTopComponent) stc;
                }
                if (ftc != null) {
                    if (PConfig.isUserAuthenticated() == true && PConfig.isClientActivated() == true && PConfig.isEntityActivated() == true) {
                        P8PdfManager pdfman = new P8PdfManager("Activityregister.pdf");
                        pdfman.GeneratePDFTreatActivitiesRegister("Las medidas de seguridad se encuentran detalladas en un documento aparte pudiendo incluir listas de control de acceso, delegación de autorizaciones,"
                                + "medidas de seguridad alternativas, autorizaciones, encargado del tratamiento de datos,tratamiento externo de datos,"
                                + "descripción de los ficheros, medios digitales y documentos en papel,nombramientos, procedimientos de seguridad y procedimientos especiales de control de acceso.");
                        //TCUtils.AddComponenttoTopCom(pdfman);
                    } else {
                        ShowDError("Debe dar de alta y seleccionar un cliente y una empresa para poder continuar ...");
                    }
                } else {
                    ShowDError("Usuario no Autenticado");

                }

            }
        }
    }

}

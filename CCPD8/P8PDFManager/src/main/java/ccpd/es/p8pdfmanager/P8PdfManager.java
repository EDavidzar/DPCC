/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.p8pdfmanager;

import static beleris.es.finalinformationmanager.MainErrorManager.ShowDError;
import static beleris.es.finalinformationmanager.MainErrorManager.ShowDInfo;
import beleris.es.finalprimaryclasses.CLAllObjectList;
import static ccpd.es.p8config.P8Config.PConfig;
import ccpd.es.p8dbmanager.FDBManExtra;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Stream;

/**
 *
 * @author edavid
 */
public class P8PdfManager {


    FDBManExtra DBManager = null;
    private Document document = null;
    boolean error = false;
    private String Title = "Registro de actividades de tratamiento";

    CLAllObjectList<CLAllObjectList<String>> TACL = new CLAllObjectList<>();
    CLAllObjectList<String> ColumnsName = new CLAllObjectList<>();
 

    public P8PdfManager() {
        LoadDBData();
    }

    public PdfPTable PdFCreateActivityRegisterTable(int icolumns, int rows, String Title, BufferedImage bi, int rowidx,String SecurityM) {

        PdfPTable table = new PdfPTable(icolumns);
        addTableHeader(table, "Información", "Contenido");
        if (bi != null) {
            TablAddImage(table, "logo de la entidad", bi);
        }
        addActivityRegisterRows(table, rowidx,SecurityM);

//        addCustomRows(table);
        return table;
    }

    public PdfPTable PdFCreateSecurityMeasuresTable(CLAllObjectList<CLAllObjectList<String>> LIST, CLAllObjectList<String> Col,int icolumns, int rows, String Title, BufferedImage bi, int rowidx) {

        PdfPTable table = new PdfPTable(icolumns);
        addTableHeader(table, "Información", "Contenido");
        if (bi != null) {
            TablAddImage(table, "logo de la entidad", bi);
        }
        addSecurityMeasuresRows(LIST, Col, table, rowidx);

//        addCustomRows(table);
        return table;
    }

    public void CreatePDFSecurityMeasures(CLAllObjectList<CLAllObjectList<String>> LIST, CLAllObjectList<String> Columns) {

        Title = "Imforme de Medidas de Seguridad";

        getDocument().open();
        getDocument().addTitle(Title);
        getDocument().addSubject("Cumplimiento de la ley de protección de datos");
        getDocument().addKeywords("Protección de datos, Empresa, PDF");
        getDocument().addAuthor("Centro de Control de Protección de datos (c) Emilio David Diaus López");
        getDocument().addCreator("Centro de Control de Protección de datos (c) Emilio David Diaus López");

        Paragraph pg = new Paragraph();
        pg.setSpacingBefore(10);
        try {
            getDocument().add(new Chapter(1));
        } catch (DocumentException ex) {
            error = true;
            ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
        }
        PdfWriteText("Entidades", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK));
        PdfWriteText(Title, FontFactory.getFont(FontFactory.HELVETICA, 16, BaseColor.BLACK));
        try {
            getDocument().add(pg);
        } catch (DocumentException ex) {
            error = true;
            ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
        }
        int itotcolumns = LIST.size();
        int irowidx = LIST.get(0).size();
        for (int row = 0; row < irowidx; row++) {
            PdfPTable table = new PdfPTable(itotcolumns);
            table = PdFCreateSecurityMeasuresTable(LIST, Columns,itotcolumns, 10, Title, PConfig.getEntityLogoPDF(), row);
            try {
                getDocument().add(table);
                getDocument().add(pg);
                getDocument().add(new Chapter(row + 1));
            } catch (DocumentException ex) {
                error = true;
                ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
            }
        }
        getDocument().close();
        if (!error) {
            ShowDInfo("Documento creado correctamente ...");
            OpenPdfDocument("SecurityMeasures.pdf");
        } else {
            ShowDInfo(" Ha habido errores,documento no creado ...");
        }

    }

    public void addActivityRegisterRows(PdfPTable table, int irowidx,String SecurityMeasures) {
        CLAllObjectList<String> RowLeft = new CLAllObjectList<>();
        CLAllObjectList<String> RowRight = new CLAllObjectList<>();

        RowLeft.add("Código ");
        RowRight.add(TACL.get(2).get(irowidx));
        RowLeft.add("Cliente");
        RowRight.add(PConfig.getActualClient().getsNClient());
        RowLeft.add("Datos del responsable del tratamiento");
        RowRight.add(TACL.get(4).get(irowidx));
        RowLeft.add("Datos del corresponsable");
        RowRight.add(TACL.get(5).get(irowidx));
        RowLeft.add("Datos del representante del responsable");
        RowRight.add(TACL.get(6).get(irowidx));
        RowLeft.add("Datos del delegado de protección de datos");
        RowRight.add(TACL.get(7).get(irowidx));
        RowLeft.add("Finalidad del tratamiento");
        RowRight.add(TACL.get(8).get(irowidx));
        RowLeft.add("Categorías de interesados");
        RowRight.add(TACL.get(9).get(irowidx));
        RowLeft.add("Categorías de datos personales");
        RowRight.add(TACL.get(10).get(irowidx));
        RowLeft.add("Categorías de destinatarios");
        RowRight.add(TACL.get(11).get(irowidx));
        RowLeft.add("Transferencia internacionales de datos personales");
        RowRight.add(TACL.get(15).get(irowidx));
        RowLeft.add("Los plazos previstos para la supresión de las diferentes categorías de datos");
        RowRight.add(TACL.get(16).get(irowidx));
        RowLeft.add("Medidas técnicas y organizativas de seguridad");
        RowRight.add(SecurityMeasures);
        RowLeft.add("análisis de riesgos para los derechos y libertades realizados");
        RowRight.add(TACL.get(17).get(irowidx));
        RowLeft.add("Descripción sistemática del tratamiento");
        RowRight.add(TACL.get(18).get(irowidx));
        RowLeft.add("sistemas de información sobre los que se apoya el tratamiento");
        RowRight.add(TACL.get(19).get(irowidx));
        RowLeft.add("garantías previstas para llevar a cabo transferencias internacionales de datos");
        RowRight.add(TACL.get(20).get(irowidx));
        RowLeft.add("información de contacto de las personas o los departamentos de la organización que se encuentran implicados en las operaciones de tratamiento");
        RowRight.add(TACL.get(21).get(irowidx));
        RowLeft.add("base jurídica");
        RowRight.add(TACL.get(24).get(irowidx));
        RowLeft.add("Derechos");
        RowRight.add(TACL.get(23).get(irowidx));
        RowLeft.add("Información adicional");
        RowRight.add(TACL.get(4).get(irowidx));
        RowLeft.add("reclamaciones");
        RowRight.add(TACL.get(22).get(irowidx));
        addRows(table, RowLeft, RowRight);

    }

    public void GeneratePDFTreatActivitiesRegister(String SecurityM) {

        getDocument().open();
        getDocument().addTitle(Title);
        getDocument().addSubject("Cumplimiento de la ley de protección de datos");
        getDocument().addKeywords("Protección de datos, Empresa, PDF");
        getDocument().addAuthor("Centro de Control de Protección de datos (c) Emilio David Diaus López 2024-2026");
        getDocument().addCreator("Centro de Control de Protección de datos (c) Emilio David Diaus López 2024-2026");

        Paragraph pg = new Paragraph();
        pg.setSpacingBefore(10);
        try {
            getDocument().add(new Chapter(1));
        } catch (DocumentException ex) {
            error = true;
            ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
        }
        PdfWriteText("Entidades", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK));
        PdfWriteText(Title, FontFactory.getFont(FontFactory.HELVETICA, 16, BaseColor.BLACK));
        try {
            getDocument().add(pg);
        } catch (DocumentException ex) {
            error = true;
            ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
        }

        int irowidx = TACL.get(0).size();
        for (int row = 0; row < irowidx; row++) {
            PdfPTable table = new PdfPTable(2);
            table = PdFCreateActivityRegisterTable(2, 10, Title, PConfig.getEntityLogoPDF(), row,SecurityM);
            try {
                getDocument().add(table);
                getDocument().add(pg);
                getDocument().add(new Chapter(row + 1));
            } catch (DocumentException ex) {
                error = true;
                ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
            }
        }
        getDocument().close();
        if (!error) {
            ShowDInfo("Documento creado correctamente ...");
            OpenPdfDocument("Activityregister.pdf");
        } else {
            ShowDInfo(" Ha habido errores,documento no creado ...");
        }
    }

    private void LoadDBData() {
        PConfig.setDBName("ccpd_treat_activity_creator");
        DBManager = new FDBManExtra(PConfig.getSQLURL(), PConfig.getAdminDBPassword(), PConfig.getDBName(), PConfig.getAdminDBName(), FDBManExtra.DB_MYSQL_Selected);
        ColumnsName = DBManager.GetColumnsName("treatactivity");
        TACL = DBManager.LoadList_Table(PConfig.getDBName(), "treatactivity", ColumnsName, PConfig.getActualClient().getsIDClient(), PConfig.getActualEnterprise().getsIDEnterprise());      
    }

    public P8PdfManager(String FilePath) {

        PdfWriter writer = null;
        document = new Document();
        LoadDBData();
        try {
            writer = PdfWriter.getInstance(document, new FileOutputStream(FilePath));
        } catch (DocumentException | FileNotFoundException ex) {
            error = true;
            ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
        }
        PageNumeration event = new PageNumeration();
        writer.setPageEvent(event);
    }

    public void PdfWriteText(String sText, com.itextpdf.text.Font tmpfont) {

        Chunk chunk = new Chunk(sText, tmpfont);
        Paragraph pg = new Paragraph(chunk);
        pg.setSpacingBefore(10);
        try {
            getDocument().add(pg);
        } catch (DocumentException ex) {
            error = true;
            ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
        }
    }

    public void PdfWriteImage(BufferedImage tmpbi) {
        try {
            //  path = Paths.get(tmpSelectedFile);
            Image img = Image.getInstance(tmpbi, null);

            getDocument().add(img);

        } catch (DocumentException | IOException ex) {
            error = true;
            ShowDError(P8PdfManager.class
                    .getName() + " " + ex.getLocalizedMessage());
        }

    }

    public void TablAddImage(PdfPTable tab, String text, BufferedImage tmpbi) {
        try {
            //  path = Paths.get(tmpSelectedFile);
            Image img = Image.getInstance(tmpbi, null);

            tab.addCell(img);
            tab.addCell(text);

        } catch (DocumentException | IOException ex) {
            error = true;
            ShowDError(P8PdfManager.class
                    .getName() + " " + ex.getLocalizedMessage());
        }

    }

    public void addTableHeader(PdfPTable table, String ColumnHeader1, String ColumnHeader2) {
        Stream.of(ColumnHeader1, ColumnHeader2).forEach(columnTitle -> {
            PdfPCell header = new PdfPCell();
            header.setBackgroundColor(BaseColor.LIGHT_GRAY);
            header.setBorderWidth(2);
            header.setPhrase(new Phrase(columnTitle));
            table.addCell(header);
        });

    }

    public void addRows(PdfPTable table, CLAllObjectList<String> RowLeft, CLAllObjectList<String> RowRight) {
        int indexleft = RowLeft.size();
        int indexright = RowRight.size();

        if (indexleft != indexright) {
            if (indexleft < indexright) {
                indexleft = indexright;
            } else {
                indexright = indexleft;
            }
        }
        for (int idx = 0; idx < indexleft; idx++) {
            String sLeft = RowLeft.get(idx);
            String sRight = RowRight.get(idx);
            if (sLeft == null) {
                sLeft = sRight;
            }
            if (sRight == null) {
                sRight = sLeft;
            }
            table.addCell(sLeft);
            table.addCell(sRight);
        }

    }

    public void PdFEncryptor(String FileInputPath, String FileOutputPath, String UserPass, String OwnerPass) {
        PdfReader pdfReader;
        try {
            pdfReader = new PdfReader(FileInputPath);
            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(FileOutputPath));
            pdfStamper.setEncryption(UserPass.getBytes(), OwnerPass.getBytes(), 0, PdfWriter.ENCRYPTION_AES_256);
            pdfStamper.close();
        } catch (DocumentException | IOException ex) {
            error = true;
            ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
        }

    }

    private void addSecurityMeasuresRows(CLAllObjectList<CLAllObjectList<String>> LIST, CLAllObjectList<String> Col,PdfPTable table, int rowidx) {
        int ilastcolumns;
        int ilastrows;
        ilastcolumns = LIST.size();
        table.addCell("listas de control de acceso");
        table.addCell("");
        for (int idxcolumns = 0; idxcolumns < ilastcolumns; idxcolumns++) {
            ilastrows = LIST.get(idxcolumns).size();
            String cValue=Col.get(idxcolumns);
            table.addCell(cValue);
            for (int idxrows = 0; idxcolumns < ilastcolumns; idxrows++) {
                String rValue = LIST.get(idxcolumns).get(idxrows);
                table.addCell(rValue);
            }
        }
    }
    /*    
        if (SMLACL.size() > 0) {
            table.addCell("listas de control de acceso");
            table.addCell("");
            for (int idx = 0; idx < SMLACL.size(); idx++) {
                table.addCell(SMLACL.get(idx).toString());

            }
        }

        if (SMLADL.size() > 0) {
            table.addCell("delegación de autorizaciones");
            table.addCell("");
            for (int idx = 0; idx < SMLADL.size(); idx++) {
                table.addCell(SMLADL.get(idx).toString());

            }
        }
        if (SMLASM.size() > 0) {
            table.addCell("medidas de seguridad alternativas");
            table.addCell("");
            for (int idx = 0; idx < SMLASM.size(); idx++) {
                table.addCell(SMLASM.get(idx).toString());

            }
        }

        if (SMLAUTH.size() > 0) {
            table.addCell("autorizaciones");
            table.addCell("");
            for (int idx = 0; idx < SMLAUTH.size(); idx++) {
                table.addCell(SMLAUTH.get(idx).toString());

            }
        }

        if (SMLDTMAN.size() > 0) {     
            table.addCell("encargado del tratamiento de datos");
            table.addCell("");
            for (int idx = 0; idx < SMLDTMAN.size(); idx++) {
                table.addCell(SMLDTMAN.get(idx).toString());

            }
        }

        if (SMLEDTMAN.size() > 0) {         
            table.addCell("tratamiento externo de datos");
            table.addCell("");
            for (int idx = 0; idx < SMLEDTMAN.size(); idx++) {
                table.addCell(SMLEDTMAN.get(idx).toString());

            }
        }

        if (SMLFIDES.size() > 0) {
            table.addCell("descripción de los ficheros");
            table.addCell("");
            for (int idx = 0; idx < SMLFIDES.size(); idx++) {
                table.addCell(SMLFIDES.get(idx).toString());

            }
        }

        if (SMLMEDANDOC.size() > 0) {
            table.addCell("medios digitales y documentos en papel");
            table.addCell("");
            for (int idx = 0; idx < SMLMEDANDOC.size(); idx++) {
                table.addCell(SMLMEDANDOC.get(idx).toString());

            }
        }

        if (SMLNOMI.size() > 0) {
            table.addCell("nombramientos");
            table.addCell("");
            for (int idx = 0; idx < SMLNOMI.size(); idx++) {
                table.addCell(SMLNOMI.get(idx).toString());
            }
        }

        if (SMLSECPROC.size() > 0) {
            table.addCell("procedimientos de seguridad");
            table.addCell("");
            for (int idx = 0; idx < SMLSECPROC.size(); idx++) {
                table.addCell(SMLSECPROC.get(idx).toString());

            }
        }

        if (SMLSCAP.size() > 0) {
            table.addCell("procedimientos especiales de control de acceso");
            table.addCell("");
            for (int idx = 0; idx < SMLSCAP.size(); idx++) {
                table.addCell(SMLSCAP.get(idx).toString());

            }
        }

        if (SMLWFANDOB.size() > 0) {
            table.addCell("funciones y obligaciones de los trabajadores");
            table.addCell("");
            for (int idx = 0; idx < SMLWFANDOB.size(); idx++) {
                table.addCell(SMLWFANDOB.get(idx).toString());

            }
        }*/


class PageNumeration extends PdfPageEventHelper {

    /**
     * The template with the total number of pages.
     */
    PdfTemplate total;

    private Font normal, normalSmall;
//private Company company;

    public PageNumeration() {
        try {
            this.normal = new Font(BaseFont.createFont(FontFactory.HELVETICA_BOLD, BaseFont.CP1250, BaseFont.EMBEDDED), 8);
            this.normalSmall = new Font(BaseFont.createFont(FontFactory.HELVETICA_BOLD, BaseFont.CP1250, BaseFont.EMBEDDED), 6);
        } catch (Exception ex) {
            error = true;
            ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());

        }
    }

    /**
     * Creates the PdfTemplate that will hold the total number of pages.
     *
     * @see com.itextpdf.text.pdf.PdfPageEventHelper#onOpenDocument(
     * com.itextpdf.text.pdf.PdfWriter, com.itextpdf.text.Document)
     */
    public void onOpenDocument(PdfWriter writer, Document document) {
        total = writer.getDirectContent().createTemplate(30, 12);
    }

    /**
     * Adds a header to every page
     *
     * @see com.itextpdf.text.pdf.PdfPageEventHelper#onEndPage(
     * com.itextpdf.text.pdf.PdfWriter, com.itextpdf.text.Document)
     */
    public void onEndPage(PdfWriter writer, Document document) {
        PdfPTable table = new PdfPTable(3);
        try {
            table.setWidths(new int[]{24, 24, 2});
            table.getDefaultCell().setFixedHeight(10);
            table.getDefaultCell().setBorder(Rectangle.TOP);
            PdfPCell cell = new PdfPCell();
            cell.setBorder(0);
            cell.setBorderWidthTop(1);
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell.setPhrase(new Phrase(getTitle(), normalSmall));
            table.addCell(cell);

            cell = new PdfPCell();
            cell.setBorder(0);
            cell.setBorderWidthTop(1);
            cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell.setPhrase(new Phrase(String.format("Página %d de", writer.getPageNumber()), normal));
            table.addCell(cell);

            cell = new PdfPCell(Image.getInstance(total));
            cell.setBorder(0);
            cell.setBorderWidthTop(1);
            table.addCell(cell);
            table.setTotalWidth(document.getPageSize().getWidth()
                    - document.leftMargin() - document.rightMargin());
            table.writeSelectedRows(0, -1, document.leftMargin(),
                    document.bottomMargin() - 15, writer.getDirectContent());
        } catch (DocumentException ex) {
            error = true;
            ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
        }
    }

    /**
     * Fills out the total number of pages before the document is closed.
     *
     * @see com.itextpdf.text.pdf.PdfPageEventHelper#onCloseDocument(
     * com.itextpdf.text.pdf.PdfWriter, com.itextpdf.text.Document)
     */
    public void onCloseDocument(PdfWriter writer, Document document) {
        ColumnText.showTextAligned(total, Element.ALIGN_LEFT,
                new Phrase(String.valueOf(writer.getPageNumber() - 1), normal),
                2, 2, 0);
    }
}

/**
 * @return the document
 */
public Document getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(Document document) {
        this.document = document;
    }

    void OpenPdfDocument(String Path) {
        Runtime rt;
        String OSName = System.getProperty("os.name");
        rt = Runtime.getRuntime();

        if ("windows".equals(OSName)) {
            try {
                String commandwin[] = {"cmd /c start " + Path};
                rt.exec(commandwin);

            } catch (IOException ex) {
                error = true;
                ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
            }
        } else {
            if (Desktop.isDesktopSupported()) {

                File theUMFile = new File(Path);
                try {
                    Desktop.getDesktop().open(theUMFile);
                } catch (IOException ex) {
                    error = true;
                    ShowDError(P8PdfManager.class.getName() + " " + ex.getLocalizedMessage());
                }
            }
        }

    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

}

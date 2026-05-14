/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.enterprises;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Emilio David Diaus López 2023-2025
 */
@Entity
@Table(name = "generaldata_treatmentmanager")
@NamedQueries({
    @NamedQuery(name = "GeneraldataTreatmentmanager.findAll", query = "SELECT g FROM GeneraldataTreatmentmanager g"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByIdGeneraldataTreatmentmanager", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.idGeneraldataTreatmentmanager = :idGeneraldataTreatmentmanager"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseManagerName", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseManagerName = :enterpriseManagerName"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseNif", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseNif = :enterpriseNif"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseRepresentativeName", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseRepresentativeName = :enterpriseRepresentativeName"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseRepresentativeSurname", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseRepresentativeSurname = :enterpriseRepresentativeSurname"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseRepresentativeNif", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseRepresentativeNif = :enterpriseRepresentativeNif"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseAddress", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseAddress = :enterpriseAddress"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseStateorregion", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseStateorregion = :enterpriseStateorregion"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseProvince", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseProvince = :enterpriseProvince"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseCountry", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseCountry = :enterpriseCountry"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseLocation", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseLocation = :enterpriseLocation"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterprisePostalcode", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterprisePostalcode = :enterprisePostalcode"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseTelephone", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseTelephone = :enterpriseTelephone"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseFax", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseFax = :enterpriseFax"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseEmail", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseEmail = :enterpriseEmail"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByEnterpriseWebpage", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.enterpriseWebpage = :enterpriseWebpage"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByIdFile", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.idFile = :idFile"),
    @NamedQuery(name = "GeneraldataTreatmentmanager.findByIdClient", query = "SELECT g FROM GeneraldataTreatmentmanager g WHERE g.idClient = :idClient")})
public class GeneraldataTreatmentmanager implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_generaldata_treatmentmanager")
    private Integer idGeneraldataTreatmentmanager;
    @Basic(optional = false)
    @Column(name = "enterprise_manager_name")
    private String enterpriseManagerName;
    @Basic(optional = false)
    @Column(name = "enterprise_nif")
    private String enterpriseNif;
    @Basic(optional = false)
    @Column(name = "enterprise_representative_name")
    private String enterpriseRepresentativeName;
    @Basic(optional = false)
    @Column(name = "enterprise_representative_surname")
    private String enterpriseRepresentativeSurname;
    @Basic(optional = false)
    @Column(name = "enterprise_representative_nif")
    private String enterpriseRepresentativeNif;
    @Basic(optional = false)
    @Column(name = "enterprise_address")
    private String enterpriseAddress;
    @Basic(optional = false)
    @Column(name = "enterprise_stateorregion")
    private String enterpriseStateorregion;
    @Basic(optional = false)
    @Column(name = "enterprise_province")
    private String enterpriseProvince;
    @Basic(optional = false)
    @Column(name = "enterprise_country")
    private String enterpriseCountry;
    @Basic(optional = false)
    @Column(name = "enterprise_location")
    private String enterpriseLocation;
    @Basic(optional = false)
    @Column(name = "enterprise_postalcode")
    private String enterprisePostalcode;
    @Basic(optional = false)
    @Column(name = "enterprise_telephone")
    private String enterpriseTelephone;
    @Column(name = "enterprise_fax")
    private String enterpriseFax;
    @Column(name = "enterprise_email")
    private String enterpriseEmail;
    @Column(name = "enterprise_webpage")
    private String enterpriseWebpage;
    @Basic(optional = false)
    @Column(name = "id_file")
    private int idFile;
    @Basic(optional = false)
    @Column(name = "id_client")
    private int idClient;

    public GeneraldataTreatmentmanager() {
    }

    public GeneraldataTreatmentmanager(Integer idGeneraldataTreatmentmanager) {
        this.idGeneraldataTreatmentmanager = idGeneraldataTreatmentmanager;
    }

    public GeneraldataTreatmentmanager(Integer idGeneraldataTreatmentmanager, String enterpriseManagerName, String enterpriseNif, String enterpriseRepresentativeName, String enterpriseRepresentativeSurname, String enterpriseRepresentativeNif, String enterpriseAddress, String enterpriseStateorregion, String enterpriseProvince, String enterpriseCountry, String enterpriseLocation, String enterprisePostalcode, String enterpriseTelephone, int idFile, int idClient) {
        this.idGeneraldataTreatmentmanager = idGeneraldataTreatmentmanager;
        this.enterpriseManagerName = enterpriseManagerName;
        this.enterpriseNif = enterpriseNif;
        this.enterpriseRepresentativeName = enterpriseRepresentativeName;
        this.enterpriseRepresentativeSurname = enterpriseRepresentativeSurname;
        this.enterpriseRepresentativeNif = enterpriseRepresentativeNif;
        this.enterpriseAddress = enterpriseAddress;
        this.enterpriseStateorregion = enterpriseStateorregion;
        this.enterpriseProvince = enterpriseProvince;
        this.enterpriseCountry = enterpriseCountry;
        this.enterpriseLocation = enterpriseLocation;
        this.enterprisePostalcode = enterprisePostalcode;
        this.enterpriseTelephone = enterpriseTelephone;
        this.idFile = idFile;
        this.idClient = idClient;
    }

    public Integer getIdGeneraldataTreatmentmanager() {
        return idGeneraldataTreatmentmanager;
    }

    public void setIdGeneraldataTreatmentmanager(Integer idGeneraldataTreatmentmanager) {
        this.idGeneraldataTreatmentmanager = idGeneraldataTreatmentmanager;
    }

    public String getEnterpriseManagerName() {
        return enterpriseManagerName;
    }

    public void setEnterpriseManagerName(String enterpriseManagerName) {
        this.enterpriseManagerName = enterpriseManagerName;
    }

    public String getEnterpriseNif() {
        return enterpriseNif;
    }

    public void setEnterpriseNif(String enterpriseNif) {
        this.enterpriseNif = enterpriseNif;
    }

    public String getEnterpriseRepresentativeName() {
        return enterpriseRepresentativeName;
    }

    public void setEnterpriseRepresentativeName(String enterpriseRepresentativeName) {
        this.enterpriseRepresentativeName = enterpriseRepresentativeName;
    }

    public String getEnterpriseRepresentativeSurname() {
        return enterpriseRepresentativeSurname;
    }

    public void setEnterpriseRepresentativeSurname(String enterpriseRepresentativeSurname) {
        this.enterpriseRepresentativeSurname = enterpriseRepresentativeSurname;
    }

    public String getEnterpriseRepresentativeNif() {
        return enterpriseRepresentativeNif;
    }

    public void setEnterpriseRepresentativeNif(String enterpriseRepresentativeNif) {
        this.enterpriseRepresentativeNif = enterpriseRepresentativeNif;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseStateorregion() {
        return enterpriseStateorregion;
    }

    public void setEnterpriseStateorregion(String enterpriseStateorregion) {
        this.enterpriseStateorregion = enterpriseStateorregion;
    }

    public String getEnterpriseProvince() {
        return enterpriseProvince;
    }

    public void setEnterpriseProvince(String enterpriseProvince) {
        this.enterpriseProvince = enterpriseProvince;
    }

    public String getEnterpriseCountry() {
        return enterpriseCountry;
    }

    public void setEnterpriseCountry(String enterpriseCountry) {
        this.enterpriseCountry = enterpriseCountry;
    }

    public String getEnterpriseLocation() {
        return enterpriseLocation;
    }

    public void setEnterpriseLocation(String enterpriseLocation) {
        this.enterpriseLocation = enterpriseLocation;
    }

    public String getEnterprisePostalcode() {
        return enterprisePostalcode;
    }

    public void setEnterprisePostalcode(String enterprisePostalcode) {
        this.enterprisePostalcode = enterprisePostalcode;
    }

    public String getEnterpriseTelephone() {
        return enterpriseTelephone;
    }

    public void setEnterpriseTelephone(String enterpriseTelephone) {
        this.enterpriseTelephone = enterpriseTelephone;
    }

    public String getEnterpriseFax() {
        return enterpriseFax;
    }

    public void setEnterpriseFax(String enterpriseFax) {
        this.enterpriseFax = enterpriseFax;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getEnterpriseWebpage() {
        return enterpriseWebpage;
    }

    public void setEnterpriseWebpage(String enterpriseWebpage) {
        this.enterpriseWebpage = enterpriseWebpage;
    }

    public int getIdFile() {
        return idFile;
    }

    public void setIdFile(int idFile) {
        this.idFile = idFile;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGeneraldataTreatmentmanager != null ? idGeneraldataTreatmentmanager.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeneraldataTreatmentmanager)) {
            return false;
        }
        GeneraldataTreatmentmanager other = (GeneraldataTreatmentmanager) object;
        if ((this.idGeneraldataTreatmentmanager == null && other.idGeneraldataTreatmentmanager != null) || (this.idGeneraldataTreatmentmanager != null && !this.idGeneraldataTreatmentmanager.equals(other.idGeneraldataTreatmentmanager))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.enterprises.GeneraldataTreatmentmanager[ idGeneraldataTreatmentmanager=" + idGeneraldataTreatmentmanager + " ]";
    }

}

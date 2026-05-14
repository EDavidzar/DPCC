/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdthreatactivity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Emilio David Diaus López 2023-2025
 */
@Entity
@Table(name = "treatactivity")
@NamedQueries({
    @NamedQuery(name = "Treatactivity.findAll", query = "SELECT t FROM Treatactivity t"),
    @NamedQuery(name = "Treatactivity.findByIdtreatactivity", query = "SELECT t FROM Treatactivity t WHERE t.idtreatactivity = :idtreatactivity"),
    @NamedQuery(name = "Treatactivity.findByManagername", query = "SELECT t FROM Treatactivity t WHERE t.managername = :managername"),
    @NamedQuery(name = "Treatactivity.findByManageremail", query = "SELECT t FROM Treatactivity t WHERE t.manageremail = :manageremail"),
    @NamedQuery(name = "Treatactivity.findByStakeholdercategories", query = "SELECT t FROM Treatactivity t WHERE t.stakeholdercategories = :stakeholdercategories"),
    @NamedQuery(name = "Treatactivity.findByPersonaldatacategories", query = "SELECT t FROM Treatactivity t WHERE t.personaldatacategories = :personaldatacategories"),
    @NamedQuery(name = "Treatactivity.findByTypeoftreatment", query = "SELECT t FROM Treatactivity t WHERE t.typeoftreatment = :typeoftreatment"),
    @NamedQuery(name = "Treatactivity.findByRecipentscategories", query = "SELECT t FROM Treatactivity t WHERE t.recipentscategories = :recipentscategories"),
    @NamedQuery(name = "Treatactivity.findByCountriesenterprisestarget", query = "SELECT t FROM Treatactivity t WHERE t.countriesenterprisestarget = :countriesenterprisestarget"),
    @NamedQuery(name = "Treatactivity.findByDataprotectiondelegateemail", query = "SELECT t FROM Treatactivity t WHERE t.dataprotectiondelegateemail = :dataprotectiondelegateemail"),
    @NamedQuery(name = "Treatactivity.findByDeadlinesdeletingdatacategories", query = "SELECT t FROM Treatactivity t WHERE t.deadlinesdeletingdatacategories = :deadlinesdeletingdatacategories"),
    @NamedQuery(name = "Treatactivity.findBySecuritymeasures", query = "SELECT t FROM Treatactivity t WHERE t.securitymeasures = :securitymeasures"),
    @NamedQuery(name = "Treatactivity.findByResponsibleclaims", query = "SELECT t FROM Treatactivity t WHERE t.responsibleclaims = :responsibleclaims")})
public class Treatactivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtreatactivity")
    private Integer idtreatactivity;
    @Basic(optional = false)
    @Column(name = "managername")
    private String managername;
    @Basic(optional = false)
    @Column(name = "manageremail")
    private String manageremail;
    @Basic(optional = false)
    @Lob
    @Column(name = "treatprurposes")
    private String treatprurposes;
    @Basic(optional = false)
    @Column(name = "stakeholdercategories")
    private String stakeholdercategories;
    @Basic(optional = false)
    @Column(name = "personaldatacategories")
    private String personaldatacategories;
    @Basic(optional = false)
    @Column(name = "typeoftreatment")
    private int typeoftreatment;
    @Basic(optional = false)
    @Column(name = "recipentscategories")
    private String recipentscategories;
    @Basic(optional = false)
    @Column(name = "countriesenterprisestarget")
    private String countriesenterprisestarget;
    @Basic(optional = false)
    @Column(name = "dataprotectiondelegateemail")
    private String dataprotectiondelegateemail;
    @Basic(optional = false)
    @Column(name = "deadlinesdeletingdatacategories")
    private String deadlinesdeletingdatacategories;
    @Basic(optional = false)
    @Column(name = "securitymeasures")
    private int securitymeasures;
    @Basic(optional = false)
    @Column(name = "responsibleclaims")
    private String responsibleclaims;
    @Basic(optional = false)
    @Lob
    @Column(name = "legalbasis")
    private String legalbasis;

    public Treatactivity() {
    }

    public Treatactivity(Integer idtreatactivity) {
        this.idtreatactivity = idtreatactivity;
    }

    public Treatactivity(Integer idtreatactivity, String managername, String manageremail, String treatprurposes, String stakeholdercategories, String personaldatacategories, int typeoftreatment, String recipentscategories, String countriesenterprisestarget, String dataprotectiondelegateemail, String deadlinesdeletingdatacategories, int securitymeasures, String responsibleclaims, String legalbasis) {
        this.idtreatactivity = idtreatactivity;
        this.managername = managername;
        this.manageremail = manageremail;
        this.treatprurposes = treatprurposes;
        this.stakeholdercategories = stakeholdercategories;
        this.personaldatacategories = personaldatacategories;
        this.typeoftreatment = typeoftreatment;
        this.recipentscategories = recipentscategories;
        this.countriesenterprisestarget = countriesenterprisestarget;
        this.dataprotectiondelegateemail = dataprotectiondelegateemail;
        this.deadlinesdeletingdatacategories = deadlinesdeletingdatacategories;
        this.securitymeasures = securitymeasures;
        this.responsibleclaims = responsibleclaims;
        this.legalbasis = legalbasis;
    }

    public Integer getIdtreatactivity() {
        return idtreatactivity;
    }

    public void setIdtreatactivity(Integer idtreatactivity) {
        this.idtreatactivity = idtreatactivity;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getManageremail() {
        return manageremail;
    }

    public void setManageremail(String manageremail) {
        this.manageremail = manageremail;
    }

    public String getTreatprurposes() {
        return treatprurposes;
    }

    public void setTreatprurposes(String treatprurposes) {
        this.treatprurposes = treatprurposes;
    }

    public String getStakeholdercategories() {
        return stakeholdercategories;
    }

    public void setStakeholdercategories(String stakeholdercategories) {
        this.stakeholdercategories = stakeholdercategories;
    }

    public String getPersonaldatacategories() {
        return personaldatacategories;
    }

    public void setPersonaldatacategories(String personaldatacategories) {
        this.personaldatacategories = personaldatacategories;
    }

    public int getTypeoftreatment() {
        return typeoftreatment;
    }

    public void setTypeoftreatment(int typeoftreatment) {
        this.typeoftreatment = typeoftreatment;
    }

    public String getRecipentscategories() {
        return recipentscategories;
    }

    public void setRecipentscategories(String recipentscategories) {
        this.recipentscategories = recipentscategories;
    }

    public String getCountriesenterprisestarget() {
        return countriesenterprisestarget;
    }

    public void setCountriesenterprisestarget(String countriesenterprisestarget) {
        this.countriesenterprisestarget = countriesenterprisestarget;
    }

    public String getDataprotectiondelegateemail() {
        return dataprotectiondelegateemail;
    }

    public void setDataprotectiondelegateemail(String dataprotectiondelegateemail) {
        this.dataprotectiondelegateemail = dataprotectiondelegateemail;
    }

    public String getDeadlinesdeletingdatacategories() {
        return deadlinesdeletingdatacategories;
    }

    public void setDeadlinesdeletingdatacategories(String deadlinesdeletingdatacategories) {
        this.deadlinesdeletingdatacategories = deadlinesdeletingdatacategories;
    }

    public int getSecuritymeasures() {
        return securitymeasures;
    }

    public void setSecuritymeasures(int securitymeasures) {
        this.securitymeasures = securitymeasures;
    }

    public String getResponsibleclaims() {
        return responsibleclaims;
    }

    public void setResponsibleclaims(String responsibleclaims) {
        this.responsibleclaims = responsibleclaims;
    }

    public String getLegalbasis() {
        return legalbasis;
    }

    public void setLegalbasis(String legalbasis) {
        this.legalbasis = legalbasis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtreatactivity != null ? idtreatactivity.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Treatactivity)) {
            return false;
        }
        Treatactivity other = (Treatactivity) object;
        if ((this.idtreatactivity == null && other.idtreatactivity != null) || (this.idtreatactivity != null && !this.idtreatactivity.equals(other.idtreatactivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdthreatactivity.Treatactivity[ idtreatactivity=" + idtreatactivity + " ]";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.persistence.clients;

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
@Table(name = "dbclients")
@NamedQueries({
    @NamedQuery(name = "Dbclients.findAll", query = "SELECT d FROM Dbclients d"),
    @NamedQuery(name = "Dbclients.findByIdDbclients", query = "SELECT d FROM Dbclients d WHERE d.idDbclients = :idDbclients"),
    @NamedQuery(name = "Dbclients.findByClientName", query = "SELECT d FROM Dbclients d WHERE d.clientName = :clientName"),
    @NamedQuery(name = "Dbclients.findByClientSurname", query = "SELECT d FROM Dbclients d WHERE d.clientSurname = :clientSurname"),
    @NamedQuery(name = "Dbclients.findByClientAddress", query = "SELECT d FROM Dbclients d WHERE d.clientAddress = :clientAddress"),
    @NamedQuery(name = "Dbclients.findByClientNif", query = "SELECT d FROM Dbclients d WHERE d.clientNif = :clientNif"),
    @NamedQuery(name = "Dbclients.findByClientStgateorregion", query = "SELECT d FROM Dbclients d WHERE d.clientStgateorregion = :clientStgateorregion"),
    @NamedQuery(name = "Dbclients.findByClientProvince", query = "SELECT d FROM Dbclients d WHERE d.clientProvince = :clientProvince"),
    @NamedQuery(name = "Dbclients.findByClientCountry", query = "SELECT d FROM Dbclients d WHERE d.clientCountry = :clientCountry"),
    @NamedQuery(name = "Dbclients.findByClientLocation", query = "SELECT d FROM Dbclients d WHERE d.clientLocation = :clientLocation"),
    @NamedQuery(name = "Dbclients.findByClientPostalcode", query = "SELECT d FROM Dbclients d WHERE d.clientPostalcode = :clientPostalcode"),
    @NamedQuery(name = "Dbclients.findByClientTelephone", query = "SELECT d FROM Dbclients d WHERE d.clientTelephone = :clientTelephone"),
    @NamedQuery(name = "Dbclients.findByClientFax", query = "SELECT d FROM Dbclients d WHERE d.clientFax = :clientFax"),
    @NamedQuery(name = "Dbclients.findByClientEmail", query = "SELECT d FROM Dbclients d WHERE d.clientEmail = :clientEmail"),
    @NamedQuery(name = "Dbclients.findByClientWebpage", query = "SELECT d FROM Dbclients d WHERE d.clientWebpage = :clientWebpage"),
    @NamedQuery(name = "Dbclients.findByIdTrmanager", query = "SELECT d FROM Dbclients d WHERE d.idTrmanager = :idTrmanager")})
public class Dbclients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_dbclients")
    private Integer idDbclients;
    @Basic(optional = false)
    @Column(name = "client_name")
    private String clientName;
    @Basic(optional = false)
    @Column(name = "client_surname")
    private String clientSurname;
    @Basic(optional = false)
    @Column(name = "client_address")
    private String clientAddress;
    @Basic(optional = false)
    @Column(name = "client_nif")
    private String clientNif;
    @Basic(optional = false)
    @Column(name = "client_stgateorregion")
    private String clientStgateorregion;
    @Basic(optional = false)
    @Column(name = "client_province")
    private String clientProvince;
    @Basic(optional = false)
    @Column(name = "client_country")
    private String clientCountry;
    @Basic(optional = false)
    @Column(name = "client_location")
    private String clientLocation;
    @Basic(optional = false)
    @Column(name = "client_postalcode")
    private String clientPostalcode;
    @Basic(optional = false)
    @Column(name = "client_telephone")
    private String clientTelephone;
    @Column(name = "client_fax")
    private String clientFax;
    @Column(name = "client_email")
    private String clientEmail;
    @Column(name = "client_webpage")
    private String clientWebpage;
    @Basic(optional = false)
    @Column(name = "id_trmanager")
    private int idTrmanager;

    public Dbclients() {
    }

    public Dbclients(Integer idDbclients) {
        this.idDbclients = idDbclients;
    }

    public Dbclients(Integer idDbclients, String clientName, String clientSurname, String clientAddress, String clientNif, String clientStgateorregion, String clientProvince, String clientCountry, String clientLocation, String clientPostalcode, String clientTelephone, int idTrmanager) {
        this.idDbclients = idDbclients;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientAddress = clientAddress;
        this.clientNif = clientNif;
        this.clientStgateorregion = clientStgateorregion;
        this.clientProvince = clientProvince;
        this.clientCountry = clientCountry;
        this.clientLocation = clientLocation;
        this.clientPostalcode = clientPostalcode;
        this.clientTelephone = clientTelephone;
        this.idTrmanager = idTrmanager;
    }

    public Integer getIdDbclients() {
        return idDbclients;
    }

    public void setIdDbclients(Integer idDbclients) {
        this.idDbclients = idDbclients;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientNif() {
        return clientNif;
    }

    public void setClientNif(String clientNif) {
        this.clientNif = clientNif;
    }

    public String getClientStgateorregion() {
        return clientStgateorregion;
    }

    public void setClientStgateorregion(String clientStgateorregion) {
        this.clientStgateorregion = clientStgateorregion;
    }

    public String getClientProvince() {
        return clientProvince;
    }

    public void setClientProvince(String clientProvince) {
        this.clientProvince = clientProvince;
    }

    public String getClientCountry() {
        return clientCountry;
    }

    public void setClientCountry(String clientCountry) {
        this.clientCountry = clientCountry;
    }

    public String getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    public String getClientPostalcode() {
        return clientPostalcode;
    }

    public void setClientPostalcode(String clientPostalcode) {
        this.clientPostalcode = clientPostalcode;
    }

    public String getClientTelephone() {
        return clientTelephone;
    }

    public void setClientTelephone(String clientTelephone) {
        this.clientTelephone = clientTelephone;
    }

    public String getClientFax() {
        return clientFax;
    }

    public void setClientFax(String clientFax) {
        this.clientFax = clientFax;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientWebpage() {
        return clientWebpage;
    }

    public void setClientWebpage(String clientWebpage) {
        this.clientWebpage = clientWebpage;
    }

    public int getIdTrmanager() {
        return idTrmanager;
    }

    public void setIdTrmanager(int idTrmanager) {
        this.idTrmanager = idTrmanager;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDbclients != null ? idDbclients.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dbclients)) {
            return false;
        }
        Dbclients other = (Dbclients) object;
        if ((this.idDbclients == null && other.idDbclients != null) || (this.idDbclients != null && !this.idDbclients.equals(other.idDbclients))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.persistence.clients.Dbclients[ idDbclients=" + idDbclients + " ]";
    }

}

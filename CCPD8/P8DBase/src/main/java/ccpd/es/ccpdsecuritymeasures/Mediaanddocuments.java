/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdsecuritymeasures;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Emilio David Diaus López 2023-2025
 */
@Entity
@Table(name = "mediaanddocuments")
@NamedQueries({
    @NamedQuery(name = "Mediaanddocuments.findAll", query = "SELECT m FROM Mediaanddocuments m"),
    @NamedQuery(name = "Mediaanddocuments.findByIdmediaanddocuments", query = "SELECT m FROM Mediaanddocuments m WHERE m.idmediaanddocuments = :idmediaanddocuments"),
    @NamedQuery(name = "Mediaanddocuments.findByIdmedia", query = "SELECT m FROM Mediaanddocuments m WHERE m.idmedia = :idmedia"),
    @NamedQuery(name = "Mediaanddocuments.findByIdclient", query = "SELECT m FROM Mediaanddocuments m WHERE m.idclient = :idclient"),
    @NamedQuery(name = "Mediaanddocuments.findByIdenterprise", query = "SELECT m FROM Mediaanddocuments m WHERE m.identerprise = :identerprise"),
    @NamedQuery(name = "Mediaanddocuments.findByDateandtime", query = "SELECT m FROM Mediaanddocuments m WHERE m.dateandtime = :dateandtime"),
    @NamedQuery(name = "Mediaanddocuments.findByMediarecipient", query = "SELECT m FROM Mediaanddocuments m WHERE m.mediarecipient = :mediarecipient"),
    @NamedQuery(name = "Mediaanddocuments.findByMedianumberorcode", query = "SELECT m FROM Mediaanddocuments m WHERE m.medianumberorcode = :medianumberorcode"),
    @NamedQuery(name = "Mediaanddocuments.findByInformationtype", query = "SELECT m FROM Mediaanddocuments m WHERE m.informationtype = :informationtype"),
    @NamedQuery(name = "Mediaanddocuments.findByShippingmethod", query = "SELECT m FROM Mediaanddocuments m WHERE m.shippingmethod = :shippingmethod"),
    @NamedQuery(name = "Mediaanddocuments.findByIdautorized", query = "SELECT m FROM Mediaanddocuments m WHERE m.idautorized = :idautorized"),
    @NamedQuery(name = "Mediaanddocuments.findByDeliveryorreception", query = "SELECT m FROM Mediaanddocuments m WHERE m.deliveryorreception = :deliveryorreception")})
public class Mediaanddocuments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idmediaanddocuments")
    private Integer idmediaanddocuments;
    @Basic(optional = false)
    @Column(name = "idmedia")
    private int idmedia;
    @Basic(optional = false)
    @Column(name = "idclient")
    private int idclient;
    @Basic(optional = false)
    @Column(name = "identerprise")
    private int identerprise;
    @Basic(optional = false)
    @Column(name = "dateandtime")
    @Temporal(TemporalType.DATE)
    private Date dateandtime;
    @Basic(optional = false)
    @Column(name = "mediarecipient")
    private String mediarecipient;
    @Basic(optional = false)
    @Column(name = "medianumberorcode")
    private String medianumberorcode;
    @Basic(optional = false)
    @Column(name = "informationtype")
    private String informationtype;
    @Basic(optional = false)
    @Column(name = "shippingmethod")
    private String shippingmethod;
    @Basic(optional = false)
    @Column(name = "idautorized")
    private int idautorized;
    @Basic(optional = false)
    @Column(name = "deliveryorreception")
    private int deliveryorreception;

    public Mediaanddocuments() {
    }

    public Mediaanddocuments(Integer idmediaanddocuments) {
        this.idmediaanddocuments = idmediaanddocuments;
    }

    public Mediaanddocuments(Integer idmediaanddocuments, int idmedia, int idclient, int identerprise, Date dateandtime, String mediarecipient, String medianumberorcode, String informationtype, String shippingmethod, int idautorized, int deliveryorreception) {
        this.idmediaanddocuments = idmediaanddocuments;
        this.idmedia = idmedia;
        this.idclient = idclient;
        this.identerprise = identerprise;
        this.dateandtime = dateandtime;
        this.mediarecipient = mediarecipient;
        this.medianumberorcode = medianumberorcode;
        this.informationtype = informationtype;
        this.shippingmethod = shippingmethod;
        this.idautorized = idautorized;
        this.deliveryorreception = deliveryorreception;
    }

    public Integer getIdmediaanddocuments() {
        return idmediaanddocuments;
    }

    public void setIdmediaanddocuments(Integer idmediaanddocuments) {
        this.idmediaanddocuments = idmediaanddocuments;
    }

    public int getIdmedia() {
        return idmedia;
    }

    public void setIdmedia(int idmedia) {
        this.idmedia = idmedia;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public int getIdenterprise() {
        return identerprise;
    }

    public void setIdenterprise(int identerprise) {
        this.identerprise = identerprise;
    }

    public Date getDateandtime() {
        return dateandtime;
    }

    public void setDateandtime(Date dateandtime) {
        this.dateandtime = dateandtime;
    }

    public String getMediarecipient() {
        return mediarecipient;
    }

    public void setMediarecipient(String mediarecipient) {
        this.mediarecipient = mediarecipient;
    }

    public String getMedianumberorcode() {
        return medianumberorcode;
    }

    public void setMedianumberorcode(String medianumberorcode) {
        this.medianumberorcode = medianumberorcode;
    }

    public String getInformationtype() {
        return informationtype;
    }

    public void setInformationtype(String informationtype) {
        this.informationtype = informationtype;
    }

    public String getShippingmethod() {
        return shippingmethod;
    }

    public void setShippingmethod(String shippingmethod) {
        this.shippingmethod = shippingmethod;
    }

    public int getIdautorized() {
        return idautorized;
    }

    public void setIdautorized(int idautorized) {
        this.idautorized = idautorized;
    }

    public int getDeliveryorreception() {
        return deliveryorreception;
    }

    public void setDeliveryorreception(int deliveryorreception) {
        this.deliveryorreception = deliveryorreception;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmediaanddocuments != null ? idmediaanddocuments.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mediaanddocuments)) {
            return false;
        }
        Mediaanddocuments other = (Mediaanddocuments) object;
        if ((this.idmediaanddocuments == null && other.idmediaanddocuments != null) || (this.idmediaanddocuments != null && !this.idmediaanddocuments.equals(other.idmediaanddocuments))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdsecurity.Mediaanddocuments[ idmediaanddocuments=" + idmediaanddocuments + " ]";
    }

}

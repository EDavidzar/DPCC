/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdthreatrisks;

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
@Table(name = "riskmanagementlist")
@NamedQueries({
    @NamedQuery(name = "Riskmanagementlist.findAll", query = "SELECT r FROM Riskmanagementlist r"),
    @NamedQuery(name = "Riskmanagementlist.findByIdriskmanagementlist", query = "SELECT r FROM Riskmanagementlist r WHERE r.idriskmanagementlist = :idriskmanagementlist"),
    @NamedQuery(name = "Riskmanagementlist.findByRisk", query = "SELECT r FROM Riskmanagementlist r WHERE r.risk = :risk"),
    @NamedQuery(name = "Riskmanagementlist.findByIdenterprise", query = "SELECT r FROM Riskmanagementlist r WHERE r.identerprise = :identerprise"),
    @NamedQuery(name = "Riskmanagementlist.findByIdclient", query = "SELECT r FROM Riskmanagementlist r WHERE r.idclient = :idclient")})
public class Riskmanagementlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idriskmanagementlist")
    private Integer idriskmanagementlist;
    @Basic(optional = false)
    @Column(name = "risk")
    private String risk;
    @Lob
    @Column(name = "notes")
    private String notes;
    @Basic(optional = false)
    @Column(name = "identerprise")
    private int identerprise;
    @Column(name = "idclient")
    private String idclient;

    public Riskmanagementlist() {
    }

    public Riskmanagementlist(Integer idriskmanagementlist) {
        this.idriskmanagementlist = idriskmanagementlist;
    }

    public Riskmanagementlist(Integer idriskmanagementlist, String risk, int identerprise) {
        this.idriskmanagementlist = idriskmanagementlist;
        this.risk = risk;
        this.identerprise = identerprise;
    }

    public Integer getIdriskmanagementlist() {
        return idriskmanagementlist;
    }

    public void setIdriskmanagementlist(Integer idriskmanagementlist) {
        this.idriskmanagementlist = idriskmanagementlist;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getIdenterprise() {
        return identerprise;
    }

    public void setIdenterprise(int identerprise) {
        this.identerprise = identerprise;
    }

    public String getIdclient() {
        return idclient;
    }

    public void setIdclient(String idclient) {
        this.idclient = idclient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idriskmanagementlist != null ? idriskmanagementlist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Riskmanagementlist)) {
            return false;
        }
        Riskmanagementlist other = (Riskmanagementlist) object;
        if ((this.idriskmanagementlist == null && other.idriskmanagementlist != null) || (this.idriskmanagementlist != null && !this.idriskmanagementlist.equals(other.idriskmanagementlist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdthreatrisks.Riskmanagementlist[ idriskmanagementlist=" + idriskmanagementlist + " ]";
    }

}

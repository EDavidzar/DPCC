/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdregisters;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "sanctions_register")
@NamedQueries({
    @NamedQuery(name = "SanctionsRegister.findAll", query = "SELECT s FROM SanctionsRegister s"),
    @NamedQuery(name = "SanctionsRegister.findByIdsanctionsRegister", query = "SELECT s FROM SanctionsRegister s WHERE s.idsanctionsRegister = :idsanctionsRegister"),
    @NamedQuery(name = "SanctionsRegister.findByIdclient", query = "SELECT s FROM SanctionsRegister s WHERE s.idclient = :idclient"),
    @NamedQuery(name = "SanctionsRegister.findByIdenterprise", query = "SELECT s FROM SanctionsRegister s WHERE s.identerprise = :identerprise"),
    @NamedQuery(name = "SanctionsRegister.findBySanction", query = "SELECT s FROM SanctionsRegister s WHERE s.sanction = :sanction"),
    @NamedQuery(name = "SanctionsRegister.findBySanctionedsubject", query = "SELECT s FROM SanctionsRegister s WHERE s.sanctionedsubject = :sanctionedsubject"),
    @NamedQuery(name = "SanctionsRegister.findByDate", query = "SELECT s FROM SanctionsRegister s WHERE s.date = :date")})
public class SanctionsRegister implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idsanctions_register")
    private Integer idsanctionsRegister;
    @Basic(optional = false)
    @Column(name = "idclient")
    private int idclient;
    @Basic(optional = false)
    @Column(name = "identerprise")
    private int identerprise;
    @Basic(optional = false)
    @Lob
    @Column(name = "punishableact")
    private String punishableact;
    @Column(name = "sanction")
    private String sanction;
    @Column(name = "sanctionedsubject")
    private String sanctionedsubject;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public SanctionsRegister() {
    }

    public SanctionsRegister(Integer idsanctionsRegister) {
        this.idsanctionsRegister = idsanctionsRegister;
    }

    public SanctionsRegister(Integer idsanctionsRegister, int idclient, int identerprise, String punishableact) {
        this.idsanctionsRegister = idsanctionsRegister;
        this.idclient = idclient;
        this.identerprise = identerprise;
        this.punishableact = punishableact;
    }

    public Integer getIdsanctionsRegister() {
        return idsanctionsRegister;
    }

    public void setIdsanctionsRegister(Integer idsanctionsRegister) {
        this.idsanctionsRegister = idsanctionsRegister;
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

    public String getPunishableact() {
        return punishableact;
    }

    public void setPunishableact(String punishableact) {
        this.punishableact = punishableact;
    }

    public String getSanction() {
        return sanction;
    }

    public void setSanction(String sanction) {
        this.sanction = sanction;
    }

    public String getSanctionedsubject() {
        return sanctionedsubject;
    }

    public void setSanctionedsubject(String sanctionedsubject) {
        this.sanctionedsubject = sanctionedsubject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsanctionsRegister != null ? idsanctionsRegister.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SanctionsRegister)) {
            return false;
        }
        SanctionsRegister other = (SanctionsRegister) object;
        if ((this.idsanctionsRegister == null && other.idsanctionsRegister != null) || (this.idsanctionsRegister != null && !this.idsanctionsRegister.equals(other.idsanctionsRegister))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdregisters.SanctionsRegister[ idsanctionsRegister=" + idsanctionsRegister + " ]";
    }

}

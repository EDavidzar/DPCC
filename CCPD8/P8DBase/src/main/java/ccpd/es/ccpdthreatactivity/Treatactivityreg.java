/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdthreatactivity;

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
@Table(name = "treatactivityreg")
@NamedQueries({
    @NamedQuery(name = "Treatactivityreg.findAll", query = "SELECT t FROM Treatactivityreg t"),
    @NamedQuery(name = "Treatactivityreg.findByIdtreatactivityreg", query = "SELECT t FROM Treatactivityreg t WHERE t.idtreatactivityreg = :idtreatactivityreg"),
    @NamedQuery(name = "Treatactivityreg.findByIdactivity", query = "SELECT t FROM Treatactivityreg t WHERE t.idactivity = :idactivity"),
    @NamedQuery(name = "Treatactivityreg.findByDate", query = "SELECT t FROM Treatactivityreg t WHERE t.date = :date"),
    @NamedQuery(name = "Treatactivityreg.findByIdenterprise", query = "SELECT t FROM Treatactivityreg t WHERE t.identerprise = :identerprise"),
    @NamedQuery(name = "Treatactivityreg.findByIdclient", query = "SELECT t FROM Treatactivityreg t WHERE t.idclient = :idclient")})
public class Treatactivityreg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtreatactivityreg")
    private Integer idtreatactivityreg;
    @Basic(optional = false)
    @Column(name = "idactivity")
    private int idactivity;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Lob
    @Column(name = "notes")
    private String notes;
    @Column(name = "identerprise")
    private Integer identerprise;
    @Column(name = "idclient")
    private Integer idclient;

    public Treatactivityreg() {
    }

    public Treatactivityreg(Integer idtreatactivityreg) {
        this.idtreatactivityreg = idtreatactivityreg;
    }

    public Treatactivityreg(Integer idtreatactivityreg, int idactivity) {
        this.idtreatactivityreg = idtreatactivityreg;
        this.idactivity = idactivity;
    }

    public Integer getIdtreatactivityreg() {
        return idtreatactivityreg;
    }

    public void setIdtreatactivityreg(Integer idtreatactivityreg) {
        this.idtreatactivityreg = idtreatactivityreg;
    }

    public int getIdactivity() {
        return idactivity;
    }

    public void setIdactivity(int idactivity) {
        this.idactivity = idactivity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getIdenterprise() {
        return identerprise;
    }

    public void setIdenterprise(Integer identerprise) {
        this.identerprise = identerprise;
    }

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtreatactivityreg != null ? idtreatactivityreg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Treatactivityreg)) {
            return false;
        }
        Treatactivityreg other = (Treatactivityreg) object;
        if ((this.idtreatactivityreg == null && other.idtreatactivityreg != null) || (this.idtreatactivityreg != null && !this.idtreatactivityreg.equals(other.idtreatactivityreg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdthreatactivity.Treatactivityreg[ idtreatactivityreg=" + idtreatactivityreg + " ]";
    }

}

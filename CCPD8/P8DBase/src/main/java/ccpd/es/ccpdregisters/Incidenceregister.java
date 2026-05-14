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
@Table(name = "incidenceregister")
@NamedQueries({
    @NamedQuery(name = "Incidenceregister.findAll", query = "SELECT i FROM Incidenceregister i"),
    @NamedQuery(name = "Incidenceregister.findByIdincidenceregister", query = "SELECT i FROM Incidenceregister i WHERE i.idincidenceregister = :idincidenceregister"),
    @NamedQuery(name = "Incidenceregister.findByIdclient", query = "SELECT i FROM Incidenceregister i WHERE i.idclient = :idclient"),
    @NamedQuery(name = "Incidenceregister.findByIdenterprise", query = "SELECT i FROM Incidenceregister i WHERE i.identerprise = :identerprise"),
    @NamedQuery(name = "Incidenceregister.findByIncidencetype", query = "SELECT i FROM Incidenceregister i WHERE i.incidencetype = :incidencetype"),
    @NamedQuery(name = "Incidenceregister.findByIncidencereporter", query = "SELECT i FROM Incidenceregister i WHERE i.incidencereporter = :incidencereporter"),
    @NamedQuery(name = "Incidenceregister.findByIncidencereportedperson", query = "SELECT i FROM Incidenceregister i WHERE i.incidencereportedperson = :incidencereportedperson"),
    @NamedQuery(name = "Incidenceregister.findByDatarestored", query = "SELECT i FROM Incidenceregister i WHERE i.datarestored = :datarestored"),
    @NamedQuery(name = "Incidenceregister.findByDatarecorded", query = "SELECT i FROM Incidenceregister i WHERE i.datarecorded = :datarecorded"),
    @NamedQuery(name = "Incidenceregister.findByDate", query = "SELECT i FROM Incidenceregister i WHERE i.date = :date"),
    @NamedQuery(name = "Incidenceregister.findBySeclevel", query = "SELECT i FROM Incidenceregister i WHERE i.seclevel = :seclevel")})
public class Incidenceregister implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idincidenceregister")
    private Integer idincidenceregister;
    @Basic(optional = false)
    @Column(name = "idclient")
    private int idclient;
    @Basic(optional = false)
    @Column(name = "identerprise")
    private int identerprise;
    @Basic(optional = false)
    @Column(name = "incidencetype")
    private String incidencetype;
    @Basic(optional = false)
    @Column(name = "incidencereporter")
    private String incidencereporter;
    @Basic(optional = false)
    @Column(name = "incidencereportedperson")
    private String incidencereportedperson;
    @Basic(optional = false)
    @Lob
    @Column(name = "incidenceefeccts")
    private String incidenceefeccts;
    @Basic(optional = false)
    @Lob
    @Column(name = "actionstaken")
    private String actionstaken;
    @Basic(optional = false)
    @Lob
    @Column(name = "recoveryprocedure")
    private String recoveryprocedure;
    @Basic(optional = false)
    @Column(name = "datarestored")
    private String datarestored;
    @Basic(optional = false)
    @Column(name = "datarecorded")
    private String datarecorded;
    @Basic(optional = false)
    @Lob
    @Column(name = "notes")
    private String notes;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @Column(name = "seclevel")
    private int seclevel;

    public Incidenceregister() {
    }

    public Incidenceregister(Integer idincidenceregister) {
        this.idincidenceregister = idincidenceregister;
    }

    public Incidenceregister(Integer idincidenceregister, int idclient, int identerprise, String incidencetype, String incidencereporter, String incidencereportedperson, String incidenceefeccts, String actionstaken, String recoveryprocedure, String datarestored, String datarecorded, String notes, Date date, int seclevel) {
        this.idincidenceregister = idincidenceregister;
        this.idclient = idclient;
        this.identerprise = identerprise;
        this.incidencetype = incidencetype;
        this.incidencereporter = incidencereporter;
        this.incidencereportedperson = incidencereportedperson;
        this.incidenceefeccts = incidenceefeccts;
        this.actionstaken = actionstaken;
        this.recoveryprocedure = recoveryprocedure;
        this.datarestored = datarestored;
        this.datarecorded = datarecorded;
        this.notes = notes;
        this.date = date;
        this.seclevel = seclevel;
    }

    public Integer getIdincidenceregister() {
        return idincidenceregister;
    }

    public void setIdincidenceregister(Integer idincidenceregister) {
        this.idincidenceregister = idincidenceregister;
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

    public String getIncidencetype() {
        return incidencetype;
    }

    public void setIncidencetype(String incidencetype) {
        this.incidencetype = incidencetype;
    }

    public String getIncidencereporter() {
        return incidencereporter;
    }

    public void setIncidencereporter(String incidencereporter) {
        this.incidencereporter = incidencereporter;
    }

    public String getIncidencereportedperson() {
        return incidencereportedperson;
    }

    public void setIncidencereportedperson(String incidencereportedperson) {
        this.incidencereportedperson = incidencereportedperson;
    }

    public String getIncidenceefeccts() {
        return incidenceefeccts;
    }

    public void setIncidenceefeccts(String incidenceefeccts) {
        this.incidenceefeccts = incidenceefeccts;
    }

    public String getActionstaken() {
        return actionstaken;
    }

    public void setActionstaken(String actionstaken) {
        this.actionstaken = actionstaken;
    }

    public String getRecoveryprocedure() {
        return recoveryprocedure;
    }

    public void setRecoveryprocedure(String recoveryprocedure) {
        this.recoveryprocedure = recoveryprocedure;
    }

    public String getDatarestored() {
        return datarestored;
    }

    public void setDatarestored(String datarestored) {
        this.datarestored = datarestored;
    }

    public String getDatarecorded() {
        return datarecorded;
    }

    public void setDatarecorded(String datarecorded) {
        this.datarecorded = datarecorded;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSeclevel() {
        return seclevel;
    }

    public void setSeclevel(int seclevel) {
        this.seclevel = seclevel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idincidenceregister != null ? idincidenceregister.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Incidenceregister)) {
            return false;
        }
        Incidenceregister other = (Incidenceregister) object;
        if ((this.idincidenceregister == null && other.idincidenceregister != null) || (this.idincidenceregister != null && !this.idincidenceregister.equals(other.idincidenceregister))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdregisters.Incidenceregister[ idincidenceregister=" + idincidenceregister + " ]";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdsecuritymeasures;

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
@Table(name = "autorizations")
@NamedQueries({
    @NamedQuery(name = "Autorizations.findAll", query = "SELECT a FROM Autorizations a"),
    @NamedQuery(name = "Autorizations.findByIdautorizations", query = "SELECT a FROM Autorizations a WHERE a.idautorizations = :idautorizations"),
    @NamedQuery(name = "Autorizations.findByIdcclient", query = "SELECT a FROM Autorizations a WHERE a.idcclient = :idcclient"),
    @NamedQuery(name = "Autorizations.findByIdenterprise", query = "SELECT a FROM Autorizations a WHERE a.identerprise = :identerprise"),
    @NamedQuery(name = "Autorizations.findByName", query = "SELECT a FROM Autorizations a WHERE a.name = :name"),
    @NamedQuery(name = "Autorizations.findByPosition", query = "SELECT a FROM Autorizations a WHERE a.position = :position"),
    @NamedQuery(name = "Autorizations.findByResources", query = "SELECT a FROM Autorizations a WHERE a.resources = :resources")})
public class Autorizations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idautorizations")
    private Integer idautorizations;
    @Column(name = "idcclient")
    private Integer idcclient;
    @Column(name = "identerprise")
    private Integer identerprise;
    @Column(name = "name")
    private String name;
    @Column(name = "position")
    private String position;
    @Column(name = "resources")
    private String resources;

    public Autorizations() {
    }

    public Autorizations(Integer idautorizations) {
        this.idautorizations = idautorizations;
    }

    public Integer getIdautorizations() {
        return idautorizations;
    }

    public void setIdautorizations(Integer idautorizations) {
        this.idautorizations = idautorizations;
    }

    public Integer getIdcclient() {
        return idcclient;
    }

    public void setIdcclient(Integer idcclient) {
        this.idcclient = idcclient;
    }

    public Integer getIdenterprise() {
        return identerprise;
    }

    public void setIdenterprise(Integer identerprise) {
        this.identerprise = identerprise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idautorizations != null ? idautorizations.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autorizations)) {
            return false;
        }
        Autorizations other = (Autorizations) object;
        if ((this.idautorizations == null && other.idautorizations != null) || (this.idautorizations != null && !this.idautorizations.equals(other.idautorizations))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdsecurity.Autorizations[ idautorizations=" + idautorizations + " ]";
    }

}

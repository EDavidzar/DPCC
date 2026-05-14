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
@Table(name = "nominations")
@NamedQueries({
    @NamedQuery(name = "Nominations.findAll", query = "SELECT n FROM Nominations n"),
    @NamedQuery(name = "Nominations.findByIdnominations", query = "SELECT n FROM Nominations n WHERE n.idnominations = :idnominations"),
    @NamedQuery(name = "Nominations.findByIdclient", query = "SELECT n FROM Nominations n WHERE n.idclient = :idclient"),
    @NamedQuery(name = "Nominations.findByIdenterprise", query = "SELECT n FROM Nominations n WHERE n.identerprise = :identerprise"),
    @NamedQuery(name = "Nominations.findByName", query = "SELECT n FROM Nominations n WHERE n.name = :name"),
    @NamedQuery(name = "Nominations.findByPosition", query = "SELECT n FROM Nominations n WHERE n.position = :position"),
    @NamedQuery(name = "Nominations.findByPermissions", query = "SELECT n FROM Nominations n WHERE n.permissions = :permissions")})
public class Nominations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idnominations")
    private Integer idnominations;
    @Column(name = "idclient")
    private Integer idclient;
    @Column(name = "identerprise")
    private Integer identerprise;
    @Column(name = "name")
    private String name;
    @Column(name = "position")
    private String position;
    @Column(name = "permissions")
    private String permissions;

    public Nominations() {
    }

    public Nominations(Integer idnominations) {
        this.idnominations = idnominations;
    }

    public Integer getIdnominations() {
        return idnominations;
    }

    public void setIdnominations(Integer idnominations) {
        this.idnominations = idnominations;
    }

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
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

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnominations != null ? idnominations.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nominations)) {
            return false;
        }
        Nominations other = (Nominations) object;
        if ((this.idnominations == null && other.idnominations != null) || (this.idnominations != null && !this.idnominations.equals(other.idnominations))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdsecurity.Nominations[ idnominations=" + idnominations + " ]";
    }

}

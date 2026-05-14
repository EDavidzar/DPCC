/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdlists;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Emilio David Diaus López 2023-2025
 */
@Entity
@Table(name = "list_seclevel")
@NamedQueries({
    @NamedQuery(name = "ListSeclevel.findAll", query = "SELECT l FROM ListSeclevel l"),
    @NamedQuery(name = "ListSeclevel.findByIdseclevel", query = "SELECT l FROM ListSeclevel l WHERE l.idseclevel = :idseclevel"),
    @NamedQuery(name = "ListSeclevel.findBySecurityLevel", query = "SELECT l FROM ListSeclevel l WHERE l.securityLevel = :securityLevel")})
public class ListSeclevel implements Serializable {

    private static final long serialVersionUID = -1781649713578981519L;

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idseclevel")
    private Integer idseclevel;
    @Basic(optional = false)
    @Column(name = "security_level")
    private String securityLevel;

    public ListSeclevel() {
    }

    public ListSeclevel(Integer idseclevel) {
        this.idseclevel = idseclevel;
    }

    public ListSeclevel(Integer idseclevel, String securityLevel) {
        this.idseclevel = idseclevel;
        this.securityLevel = securityLevel;
    }

    public Integer getIdseclevel() {
        return idseclevel;
    }

    public void setIdseclevel(Integer idseclevel) {
        this.idseclevel = idseclevel;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idseclevel != null ? idseclevel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListSeclevel)) {
            return false;
        }
        ListSeclevel other = (ListSeclevel) object;
        if ((this.idseclevel == null && other.idseclevel != null) || (this.idseclevel != null && !this.idseclevel.equals(other.idseclevel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListSeclevel[ idseclevel=" + idseclevel + " ]";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdlists;

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
@Table(name = "list_tprovinces")
@NamedQueries({
    @NamedQuery(name = "ListTprovinces.findAll", query = "SELECT l FROM ListTprovinces l"),
    @NamedQuery(name = "ListTprovinces.findByIdprovinces", query = "SELECT l FROM ListTprovinces l WHERE l.idprovinces = :idprovinces"),
    @NamedQuery(name = "ListTprovinces.findByProvincia", query = "SELECT l FROM ListTprovinces l WHERE l.provincia = :provincia")})
public class ListTprovinces implements Serializable {

    private static final long serialVersionUID = 8670078040477951253L;

    
    @Id
    @Basic(optional = false)
    @Column(name = "idprovinces")
    private Integer idprovinces;
    @Basic(optional = false)
    @Column(name = "provincia")
    private String provincia;

    public ListTprovinces() {
    }

    public ListTprovinces(Integer idprovinces) {
        this.idprovinces = idprovinces;
    }

    public ListTprovinces(Integer idprovinces, String provincia) {
        this.idprovinces = idprovinces;
        this.provincia = provincia;
    }

    public Integer getIdprovinces() {
        return idprovinces;
    }

    public void setIdprovinces(Integer idprovinces) {
        this.idprovinces = idprovinces;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprovinces != null ? idprovinces.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListTprovinces)) {
            return false;
        }
        ListTprovinces other = (ListTprovinces) object;
        if ((this.idprovinces == null && other.idprovinces != null) || (this.idprovinces != null && !this.idprovinces.equals(other.idprovinces))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListTprovinces[ idprovinces=" + idprovinces + " ]";
    }

}

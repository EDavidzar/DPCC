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
@Table(name = "list_cat_desttransint")
@NamedQueries({
    @NamedQuery(name = "ListCatDesttransint.findAll", query = "SELECT l FROM ListCatDesttransint l"),
    @NamedQuery(name = "ListCatDesttransint.findByIdcode", query = "SELECT l FROM ListCatDesttransint l WHERE l.idcode = :idcode"),
    @NamedQuery(name = "ListCatDesttransint.findByTargetinternattrans", query = "SELECT l FROM ListCatDesttransint l WHERE l.targetinternattrans = :targetinternattrans")})
public class ListCatDesttransint implements Serializable {

    private static final long serialVersionUID = -1615489509067081354L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcode")
    private Integer idcode;
    @Column(name = "targetinternattrans")
    private String targetinternattrans;

    public ListCatDesttransint() {
    }

    public ListCatDesttransint(Integer idcode) {
        this.idcode = idcode;
    }

    public Integer getIdcode() {
        return idcode;
    }

    public void setIdcode(Integer idcode) {
        this.idcode = idcode;
    }

    public String getTargetinternattrans() {
        return targetinternattrans;
    }

    public void setTargetinternattrans(String targetinternattrans) {
        this.targetinternattrans = targetinternattrans;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcode != null ? idcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListCatDesttransint)) {
            return false;
        }
        ListCatDesttransint other = (ListCatDesttransint) object;
        if ((this.idcode == null && other.idcode != null) || (this.idcode != null && !this.idcode.equals(other.idcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListCatDesttransint[ idcode=" + idcode + " ]";
    }

}

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
@Table(name = "list_treatypes")
@NamedQueries({
    @NamedQuery(name = "ListTreatypes.findAll", query = "SELECT l FROM ListTreatypes l"),
    @NamedQuery(name = "ListTreatypes.findByIdlistTreatypes", query = "SELECT l FROM ListTreatypes l WHERE l.idlistTreatypes = :idlistTreatypes"),
    @NamedQuery(name = "ListTreatypes.findByNTreatypes", query = "SELECT l FROM ListTreatypes l WHERE l.nTreatypes = :nTreatypes")})
public class ListTreatypes implements Serializable {

    private static final long serialVersionUID = 2915883294298792817L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlist_treatypes")
    private Integer idlistTreatypes;
    @Column(name = "n_treatypes")
    private String nTreatypes;

    public ListTreatypes() {
    }

    public ListTreatypes(Integer idlistTreatypes) {
        this.idlistTreatypes = idlistTreatypes;
    }

    public Integer getIdlistTreatypes() {
        return idlistTreatypes;
    }

    public void setIdlistTreatypes(Integer idlistTreatypes) {
        this.idlistTreatypes = idlistTreatypes;
    }

    public String getNTreatypes() {
        return nTreatypes;
    }

    public void setNTreatypes(String nTreatypes) {
        this.nTreatypes = nTreatypes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlistTreatypes != null ? idlistTreatypes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListTreatypes)) {
            return false;
        }
        ListTreatypes other = (ListTreatypes) object;
        if ((this.idlistTreatypes == null && other.idlistTreatypes != null) || (this.idlistTreatypes != null && !this.idlistTreatypes.equals(other.idlistTreatypes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListTreatypes[ idlistTreatypes=" + idlistTreatypes + " ]";
    }

}

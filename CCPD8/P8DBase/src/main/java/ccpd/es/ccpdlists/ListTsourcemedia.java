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
@Table(name = "list_tsourcemedia")
@NamedQueries({
    @NamedQuery(name = "ListTsourcemedia.findAll", query = "SELECT l FROM ListTsourcemedia l"),
    @NamedQuery(name = "ListTsourcemedia.findByTsourcemedia", query = "SELECT l FROM ListTsourcemedia l WHERE l.tsourcemedia = :tsourcemedia"),
    @NamedQuery(name = "ListTsourcemedia.findBySourcemediaName", query = "SELECT l FROM ListTsourcemedia l WHERE l.sourcemediaName = :sourcemediaName")})
public class ListTsourcemedia implements Serializable {

    private static final long serialVersionUID = 445367988172289511L;

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tsourcemedia")
    private Integer tsourcemedia;
    @Basic(optional = false)
    @Column(name = "sourcemedia_name")
    private String sourcemediaName;

    public ListTsourcemedia() {
    }

    public ListTsourcemedia(Integer tsourcemedia) {
        this.tsourcemedia = tsourcemedia;
    }

    public ListTsourcemedia(Integer tsourcemedia, String sourcemediaName) {
        this.tsourcemedia = tsourcemedia;
        this.sourcemediaName = sourcemediaName;
    }

    public Integer getTsourcemedia() {
        return tsourcemedia;
    }

    public void setTsourcemedia(Integer tsourcemedia) {
        this.tsourcemedia = tsourcemedia;
    }

    public String getSourcemediaName() {
        return sourcemediaName;
    }

    public void setSourcemediaName(String sourcemediaName) {
        this.sourcemediaName = sourcemediaName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tsourcemedia != null ? tsourcemedia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListTsourcemedia)) {
            return false;
        }
        ListTsourcemedia other = (ListTsourcemedia) object;
        if ((this.tsourcemedia == null && other.tsourcemedia != null) || (this.tsourcemedia != null && !this.tsourcemedia.equals(other.tsourcemedia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListTsourcemedia[ tsourcemedia=" + tsourcemedia + " ]";
    }

}

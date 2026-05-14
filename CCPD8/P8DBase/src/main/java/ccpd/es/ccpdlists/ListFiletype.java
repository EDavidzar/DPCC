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
@Table(name = "list_filetype")
@NamedQueries({
    @NamedQuery(name = "ListFiletype.findAll", query = "SELECT l FROM ListFiletype l"),
    @NamedQuery(name = "ListFiletype.findByIdfiletype", query = "SELECT l FROM ListFiletype l WHERE l.idfiletype = :idfiletype"),
    @NamedQuery(name = "ListFiletype.findByFileTypeName", query = "SELECT l FROM ListFiletype l WHERE l.fileTypeName = :fileTypeName")})
public class ListFiletype implements Serializable {

    private static final long serialVersionUID = -7836322961281604291L;

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfiletype")
    private Integer idfiletype;
    @Column(name = "file_type_name")
    private String fileTypeName;

    public ListFiletype() {
    }

    public ListFiletype(Integer idfiletype) {
        this.idfiletype = idfiletype;
    }

    public Integer getIdfiletype() {
        return idfiletype;
    }

    public void setIdfiletype(Integer idfiletype) {
        this.idfiletype = idfiletype;
    }

    public String getFileTypeName() {
        return fileTypeName;
    }

    public void setFileTypeName(String fileTypeName) {
        this.fileTypeName = fileTypeName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfiletype != null ? idfiletype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListFiletype)) {
            return false;
        }
        ListFiletype other = (ListFiletype) object;
        if ((this.idfiletype == null && other.idfiletype != null) || (this.idfiletype != null && !this.idfiletype.equals(other.idfiletype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListFiletype[ idfiletype=" + idfiletype + " ]";
    }

}

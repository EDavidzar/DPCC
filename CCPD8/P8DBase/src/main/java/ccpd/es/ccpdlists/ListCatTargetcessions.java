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
@Table(name = "list_cat_targetcessions")
@NamedQueries({
    @NamedQuery(name = "ListCatTargetcessions.findAll", query = "SELECT l FROM ListCatTargetcessions l"),
    @NamedQuery(name = "ListCatTargetcessions.findByIdFeCatTargetcessions", query = "SELECT l FROM ListCatTargetcessions l WHERE l.idFeCatTargetcessions = :idFeCatTargetcessions"),
    @NamedQuery(name = "ListCatTargetcessions.findByIdcode", query = "SELECT l FROM ListCatTargetcessions l WHERE l.idcode = :idcode"),
    @NamedQuery(name = "ListCatTargetcessions.findByCessionstargetcategories", query = "SELECT l FROM ListCatTargetcessions l WHERE l.cessionstargetcategories = :cessionstargetcategories")})
public class ListCatTargetcessions implements Serializable {

    private static final long serialVersionUID = 4429556337950891323L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fe_cat_targetcessions")
    private Integer idFeCatTargetcessions;
    @Basic(optional = false)
    @Column(name = "idcode")
    private int idcode;
    @Column(name = "cessionstargetcategories")
    private String cessionstargetcategories;

    public ListCatTargetcessions() {
    }

    public ListCatTargetcessions(Integer idFeCatTargetcessions) {
        this.idFeCatTargetcessions = idFeCatTargetcessions;
    }

    public ListCatTargetcessions(Integer idFeCatTargetcessions, int idcode) {
        this.idFeCatTargetcessions = idFeCatTargetcessions;
        this.idcode = idcode;
    }

    public Integer getIdFeCatTargetcessions() {
        return idFeCatTargetcessions;
    }

    public void setIdFeCatTargetcessions(Integer idFeCatTargetcessions) {
        this.idFeCatTargetcessions = idFeCatTargetcessions;
    }

    public int getIdcode() {
        return idcode;
    }

    public void setIdcode(int idcode) {
        this.idcode = idcode;
    }

    public String getCessionstargetcategories() {
        return cessionstargetcategories;
    }

    public void setCessionstargetcategories(String cessionstargetcategories) {
        this.cessionstargetcategories = cessionstargetcategories;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFeCatTargetcessions != null ? idFeCatTargetcessions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListCatTargetcessions)) {
            return false;
        }
        ListCatTargetcessions other = (ListCatTargetcessions) object;
        if ((this.idFeCatTargetcessions == null && other.idFeCatTargetcessions != null) || (this.idFeCatTargetcessions != null && !this.idFeCatTargetcessions.equals(other.idFeCatTargetcessions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListCatTargetcessions[ idFeCatTargetcessions=" + idFeCatTargetcessions + " ]";
    }

}

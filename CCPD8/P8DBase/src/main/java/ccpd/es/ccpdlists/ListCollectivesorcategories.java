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
@Table(name = "list_collectivesorcategories")
@NamedQueries({
    @NamedQuery(name = "ListCollectivesorcategories.findAll", query = "SELECT l FROM ListCollectivesorcategories l"),
    @NamedQuery(name = "ListCollectivesorcategories.findByIdcollectivesorcategories", query = "SELECT l FROM ListCollectivesorcategories l WHERE l.idcollectivesorcategories = :idcollectivesorcategories"),
    @NamedQuery(name = "ListCollectivesorcategories.findByDescription", query = "SELECT l FROM ListCollectivesorcategories l WHERE l.description = :description")})
public class ListCollectivesorcategories implements Serializable {

    private static final long serialVersionUID = -8858763896325404709L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcollectivesorcategories")
    private Integer idcollectivesorcategories;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public ListCollectivesorcategories() {
    }

    public ListCollectivesorcategories(Integer idcollectivesorcategories) {
        this.idcollectivesorcategories = idcollectivesorcategories;
    }

    public ListCollectivesorcategories(Integer idcollectivesorcategories, String description) {
        this.idcollectivesorcategories = idcollectivesorcategories;
        this.description = description;
    }

    public Integer getIdcollectivesorcategories() {
        return idcollectivesorcategories;
    }

    public void setIdcollectivesorcategories(Integer idcollectivesorcategories) {
        this.idcollectivesorcategories = idcollectivesorcategories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcollectivesorcategories != null ? idcollectivesorcategories.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListCollectivesorcategories)) {
            return false;
        }
        ListCollectivesorcategories other = (ListCollectivesorcategories) object;
        if ((this.idcollectivesorcategories == null && other.idcollectivesorcategories != null) || (this.idcollectivesorcategories != null && !this.idcollectivesorcategories.equals(other.idcollectivesorcategories))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListCollectivesorcategories[ idcollectivesorcategories=" + idcollectivesorcategories + " ]";
    }

}

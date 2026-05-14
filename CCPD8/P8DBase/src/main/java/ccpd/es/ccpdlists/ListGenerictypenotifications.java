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
@Table(name = "list_generictypenotifications")
@NamedQueries({
    @NamedQuery(name = "ListGenerictypenotifications.findAll", query = "SELECT l FROM ListGenerictypenotifications l"),
    @NamedQuery(name = "ListGenerictypenotifications.findByIdlistGenerictypenotifications", query = "SELECT l FROM ListGenerictypenotifications l WHERE l.idlistGenerictypenotifications = :idlistGenerictypenotifications"),
    @NamedQuery(name = "ListGenerictypenotifications.findByNotificationname", query = "SELECT l FROM ListGenerictypenotifications l WHERE l.notificationname = :notificationname")})
public class ListGenerictypenotifications implements Serializable {

    private static final long serialVersionUID = -5965060343122605738L;

   
    @Id
    @Basic(optional = false)
    @Column(name = "idlist_generictypenotifications")
    private Integer idlistGenerictypenotifications;
    @Basic(optional = false)
    @Column(name = "notificationname")
    private String notificationname;

    public ListGenerictypenotifications() {
    }

    public ListGenerictypenotifications(Integer idlistGenerictypenotifications) {
        this.idlistGenerictypenotifications = idlistGenerictypenotifications;
    }

    public ListGenerictypenotifications(Integer idlistGenerictypenotifications, String notificationname) {
        this.idlistGenerictypenotifications = idlistGenerictypenotifications;
        this.notificationname = notificationname;
    }

    public Integer getIdlistGenerictypenotifications() {
        return idlistGenerictypenotifications;
    }

    public void setIdlistGenerictypenotifications(Integer idlistGenerictypenotifications) {
        this.idlistGenerictypenotifications = idlistGenerictypenotifications;
    }

    public String getNotificationname() {
        return notificationname;
    }

    public void setNotificationname(String notificationname) {
        this.notificationname = notificationname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlistGenerictypenotifications != null ? idlistGenerictypenotifications.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListGenerictypenotifications)) {
            return false;
        }
        ListGenerictypenotifications other = (ListGenerictypenotifications) object;
        if ((this.idlistGenerictypenotifications == null && other.idlistGenerictypenotifications != null) || (this.idlistGenerictypenotifications != null && !this.idlistGenerictypenotifications.equals(other.idlistGenerictypenotifications))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListGenerictypenotifications[ idlistGenerictypenotifications=" + idlistGenerictypenotifications + " ]";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdregisters;

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
@Table(name = "securitycontrols_register")
@NamedQueries({
    @NamedQuery(name = "SecuritycontrolsRegister.findAll", query = "SELECT s FROM SecuritycontrolsRegister s"),
    @NamedQuery(name = "SecuritycontrolsRegister.findByIdsecuritycontrolsRegister", query = "SELECT s FROM SecuritycontrolsRegister s WHERE s.idsecuritycontrolsRegister = :idsecuritycontrolsRegister"),
    @NamedQuery(name = "SecuritycontrolsRegister.findByControlmanager", query = "SELECT s FROM SecuritycontrolsRegister s WHERE s.controlmanager = :controlmanager"),
    @NamedQuery(name = "SecuritycontrolsRegister.findBySecuritycontrolProcedure", query = "SELECT s FROM SecuritycontrolsRegister s WHERE s.securitycontrolProcedure = :securitycontrolProcedure"),
    @NamedQuery(name = "SecuritycontrolsRegister.findBySecuritycontrolresult", query = "SELECT s FROM SecuritycontrolsRegister s WHERE s.securitycontrolresult = :securitycontrolresult"),
    @NamedQuery(name = "SecuritycontrolsRegister.findBySecuritycontrolactiontocomplete", query = "SELECT s FROM SecuritycontrolsRegister s WHERE s.securitycontrolactiontocomplete = :securitycontrolactiontocomplete")})
public class SecuritycontrolsRegister implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idsecuritycontrols_register")
    private Integer idsecuritycontrolsRegister;
    @Column(name = "controlmanager")
    private Integer controlmanager;
    @Column(name = "securitycontrol procedure")
    private String securitycontrolProcedure;
    @Column(name = "securitycontrolresult")
    private String securitycontrolresult;
    @Column(name = "securitycontrolactiontocomplete")
    private String securitycontrolactiontocomplete;

    public SecuritycontrolsRegister() {
    }

    public SecuritycontrolsRegister(Integer idsecuritycontrolsRegister) {
        this.idsecuritycontrolsRegister = idsecuritycontrolsRegister;
    }

    public Integer getIdsecuritycontrolsRegister() {
        return idsecuritycontrolsRegister;
    }

    public void setIdsecuritycontrolsRegister(Integer idsecuritycontrolsRegister) {
        this.idsecuritycontrolsRegister = idsecuritycontrolsRegister;
    }

    public Integer getControlmanager() {
        return controlmanager;
    }

    public void setControlmanager(Integer controlmanager) {
        this.controlmanager = controlmanager;
    }

    public String getSecuritycontrolProcedure() {
        return securitycontrolProcedure;
    }

    public void setSecuritycontrolProcedure(String securitycontrolProcedure) {
        this.securitycontrolProcedure = securitycontrolProcedure;
    }

    public String getSecuritycontrolresult() {
        return securitycontrolresult;
    }

    public void setSecuritycontrolresult(String securitycontrolresult) {
        this.securitycontrolresult = securitycontrolresult;
    }

    public String getSecuritycontrolactiontocomplete() {
        return securitycontrolactiontocomplete;
    }

    public void setSecuritycontrolactiontocomplete(String securitycontrolactiontocomplete) {
        this.securitycontrolactiontocomplete = securitycontrolactiontocomplete;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsecuritycontrolsRegister != null ? idsecuritycontrolsRegister.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecuritycontrolsRegister)) {
            return false;
        }
        SecuritycontrolsRegister other = (SecuritycontrolsRegister) object;
        if ((this.idsecuritycontrolsRegister == null && other.idsecuritycontrolsRegister != null) || (this.idsecuritycontrolsRegister != null && !this.idsecuritycontrolsRegister.equals(other.idsecuritycontrolsRegister))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdregisters.SecuritycontrolsRegister[ idsecuritycontrolsRegister=" + idsecuritycontrolsRegister + " ]";
    }

}

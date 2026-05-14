/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdsecuritymeasures;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Emilio David Diaus López 2023-2025
 */
@Entity
@Table(name = "acesscontrollist")
@NamedQueries({
    @NamedQuery(name = "Acesscontrollist.findAll", query = "SELECT a FROM Acesscontrollist a"),
    @NamedQuery(name = "Acesscontrollist.findByIdacesscontrollist", query = "SELECT a FROM Acesscontrollist a WHERE a.idacesscontrollist = :idacesscontrollist"),
    @NamedQuery(name = "Acesscontrollist.findByIdclient", query = "SELECT a FROM Acesscontrollist a WHERE a.idclient = :idclient"),
    @NamedQuery(name = "Acesscontrollist.findByIdenterprise", query = "SELECT a FROM Acesscontrollist a WHERE a.identerprise = :identerprise"),
    @NamedQuery(name = "Acesscontrollist.findByIdautorized", query = "SELECT a FROM Acesscontrollist a WHERE a.idautorized = :idautorized")})
public class Acesscontrollist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idacesscontrollist")
    private Integer idacesscontrollist;
    @Basic(optional = false)
    @Column(name = "idclient")
    private int idclient;
    @Basic(optional = false)
    @Column(name = "identerprise")
    private int identerprise;
    @Basic(optional = false)
    @Column(name = "idautorized")
    private int idautorized;
    @Basic(optional = false)
    @Lob
    @Column(name = "autorizedresources")
    private String autorizedresources;

    public Acesscontrollist() {
    }

    public Acesscontrollist(Integer idacesscontrollist) {
        this.idacesscontrollist = idacesscontrollist;
    }

    public Acesscontrollist(Integer idacesscontrollist, int idclient, int identerprise, int idautorized, String autorizedresources) {
        this.idacesscontrollist = idacesscontrollist;
        this.idclient = idclient;
        this.identerprise = identerprise;
        this.idautorized = idautorized;
        this.autorizedresources = autorizedresources;
    }

    public Integer getIdacesscontrollist() {
        return idacesscontrollist;
    }

    public void setIdacesscontrollist(Integer idacesscontrollist) {
        this.idacesscontrollist = idacesscontrollist;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public int getIdenterprise() {
        return identerprise;
    }

    public void setIdenterprise(int identerprise) {
        this.identerprise = identerprise;
    }

    public int getIdautorized() {
        return idautorized;
    }

    public void setIdautorized(int idautorized) {
        this.idautorized = idautorized;
    }

    public String getAutorizedresources() {
        return autorizedresources;
    }

    public void setAutorizedresources(String autorizedresources) {
        this.autorizedresources = autorizedresources;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idacesscontrollist != null ? idacesscontrollist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acesscontrollist)) {
            return false;
        }
        Acesscontrollist other = (Acesscontrollist) object;
        if ((this.idacesscontrollist == null && other.idacesscontrollist != null) || (this.idacesscontrollist != null && !this.idacesscontrollist.equals(other.idacesscontrollist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdsecurity.Acesscontrollist[ idacesscontrollist=" + idacesscontrollist + " ]";
    }

}

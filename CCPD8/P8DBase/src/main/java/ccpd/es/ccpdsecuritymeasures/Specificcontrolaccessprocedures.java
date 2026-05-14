/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdsecuritymeasures;

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
@Table(name = "specificcontrolaccessprocedures")
@NamedQueries({
    @NamedQuery(name = "Specificcontrolaccessprocedures.findAll", query = "SELECT s FROM Specificcontrolaccessprocedures s"),
    @NamedQuery(name = "Specificcontrolaccessprocedures.findByIdspecificcontrolaccessprocedures", query = "SELECT s FROM Specificcontrolaccessprocedures s WHERE s.idspecificcontrolaccessprocedures = :idspecificcontrolaccessprocedures"),
    @NamedQuery(name = "Specificcontrolaccessprocedures.findByIdclient", query = "SELECT s FROM Specificcontrolaccessprocedures s WHERE s.idclient = :idclient"),
    @NamedQuery(name = "Specificcontrolaccessprocedures.findByIdenterprise", query = "SELECT s FROM Specificcontrolaccessprocedures s WHERE s.identerprise = :identerprise"),
    @NamedQuery(name = "Specificcontrolaccessprocedures.findBySpecificaccessprocedure", query = "SELECT s FROM Specificcontrolaccessprocedures s WHERE s.specificaccessprocedure = :specificaccessprocedure"),
    @NamedQuery(name = "Specificcontrolaccessprocedures.findBySpecificcontrolprocedure", query = "SELECT s FROM Specificcontrolaccessprocedures s WHERE s.specificcontrolprocedure = :specificcontrolprocedure")})
public class Specificcontrolaccessprocedures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idspecificcontrolaccessprocedures")
    private Integer idspecificcontrolaccessprocedures;
    @Basic(optional = false)
    @Column(name = "idclient")
    private int idclient;
    @Basic(optional = false)
    @Column(name = "identerprise")
    private int identerprise;
    @Basic(optional = false)
    @Column(name = "specificaccessprocedure")
    private String specificaccessprocedure;
    @Basic(optional = false)
    @Column(name = "specificcontrolprocedure")
    private String specificcontrolprocedure;

    public Specificcontrolaccessprocedures() {
    }

    public Specificcontrolaccessprocedures(Integer idspecificcontrolaccessprocedures) {
        this.idspecificcontrolaccessprocedures = idspecificcontrolaccessprocedures;
    }

    public Specificcontrolaccessprocedures(Integer idspecificcontrolaccessprocedures, int idclient, int identerprise, String specificaccessprocedure, String specificcontrolprocedure) {
        this.idspecificcontrolaccessprocedures = idspecificcontrolaccessprocedures;
        this.idclient = idclient;
        this.identerprise = identerprise;
        this.specificaccessprocedure = specificaccessprocedure;
        this.specificcontrolprocedure = specificcontrolprocedure;
    }

    public Integer getIdspecificcontrolaccessprocedures() {
        return idspecificcontrolaccessprocedures;
    }

    public void setIdspecificcontrolaccessprocedures(Integer idspecificcontrolaccessprocedures) {
        this.idspecificcontrolaccessprocedures = idspecificcontrolaccessprocedures;
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

    public String getSpecificaccessprocedure() {
        return specificaccessprocedure;
    }

    public void setSpecificaccessprocedure(String specificaccessprocedure) {
        this.specificaccessprocedure = specificaccessprocedure;
    }

    public String getSpecificcontrolprocedure() {
        return specificcontrolprocedure;
    }

    public void setSpecificcontrolprocedure(String specificcontrolprocedure) {
        this.specificcontrolprocedure = specificcontrolprocedure;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idspecificcontrolaccessprocedures != null ? idspecificcontrolaccessprocedures.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specificcontrolaccessprocedures)) {
            return false;
        }
        Specificcontrolaccessprocedures other = (Specificcontrolaccessprocedures) object;
        if ((this.idspecificcontrolaccessprocedures == null && other.idspecificcontrolaccessprocedures != null) || (this.idspecificcontrolaccessprocedures != null && !this.idspecificcontrolaccessprocedures.equals(other.idspecificcontrolaccessprocedures))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdsecurity.Specificcontrolaccessprocedures[ idspecificcontrolaccessprocedures=" + idspecificcontrolaccessprocedures + " ]";
    }

}

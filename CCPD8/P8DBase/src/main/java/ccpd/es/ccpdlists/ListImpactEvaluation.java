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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Emilio David Diaus López 2023-2025
 */
@Entity
@Table(name = "list_impact_evaluation")
@NamedQueries({
    @NamedQuery(name = "ListImpactEvaluation.findAll", query = "SELECT l FROM ListImpactEvaluation l"),
    @NamedQuery(name = "ListImpactEvaluation.findByIdlistImpactEvaluation", query = "SELECT l FROM ListImpactEvaluation l WHERE l.idlistImpactEvaluation = :idlistImpactEvaluation"),
    @NamedQuery(name = "ListImpactEvaluation.findByIdenterprise", query = "SELECT l FROM ListImpactEvaluation l WHERE l.identerprise = :identerprise"),
    @NamedQuery(name = "ListImpactEvaluation.findByIdclient", query = "SELECT l FROM ListImpactEvaluation l WHERE l.idclient = :idclient")})
public class ListImpactEvaluation implements Serializable {

    private static final long serialVersionUID = 7058929201639381510L;

    
    @Id
    @Basic(optional = false)
    @Column(name = "idlist_impact_evaluation")
    private Integer idlistImpactEvaluation;
    @Lob
    @Column(name = "impact_description")
    private String impactDescription;
    @Lob
    @Column(name = "impact_evaluation")
    private String impactEvaluation;
    @Column(name = "identerprise")
    private Integer identerprise;
    @Column(name = "idclient")
    private Integer idclient;

    public ListImpactEvaluation() {
    }

    public ListImpactEvaluation(Integer idlistImpactEvaluation) {
        this.idlistImpactEvaluation = idlistImpactEvaluation;
    }

    public Integer getIdlistImpactEvaluation() {
        return idlistImpactEvaluation;
    }

    public void setIdlistImpactEvaluation(Integer idlistImpactEvaluation) {
        this.idlistImpactEvaluation = idlistImpactEvaluation;
    }

    public String getImpactDescription() {
        return impactDescription;
    }

    public void setImpactDescription(String impactDescription) {
        this.impactDescription = impactDescription;
    }

    public String getImpactEvaluation() {
        return impactEvaluation;
    }

    public void setImpactEvaluation(String impactEvaluation) {
        this.impactEvaluation = impactEvaluation;
    }

    public Integer getIdenterprise() {
        return identerprise;
    }

    public void setIdenterprise(Integer identerprise) {
        this.identerprise = identerprise;
    }

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlistImpactEvaluation != null ? idlistImpactEvaluation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListImpactEvaluation)) {
            return false;
        }
        ListImpactEvaluation other = (ListImpactEvaluation) object;
        if ((this.idlistImpactEvaluation == null && other.idlistImpactEvaluation != null) || (this.idlistImpactEvaluation != null && !this.idlistImpactEvaluation.equals(other.idlistImpactEvaluation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListImpactEvaluation[ idlistImpactEvaluation=" + idlistImpactEvaluation + " ]";
    }

}

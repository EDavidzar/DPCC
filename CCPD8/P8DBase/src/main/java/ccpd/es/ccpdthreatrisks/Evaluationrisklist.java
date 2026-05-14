/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdthreatrisks;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "evaluationrisklist")
@NamedQueries({
    @NamedQuery(name = "Evaluationrisklist.findAll", query = "SELECT e FROM Evaluationrisklist e"),
    @NamedQuery(name = "Evaluationrisklist.findByIdevaluationrisklist", query = "SELECT e FROM Evaluationrisklist e WHERE e.idevaluationrisklist = :idevaluationrisklist"),
    @NamedQuery(name = "Evaluationrisklist.findByIdrisk", query = "SELECT e FROM Evaluationrisklist e WHERE e.idrisk = :idrisk"),
    @NamedQuery(name = "Evaluationrisklist.findByIdenterprise", query = "SELECT e FROM Evaluationrisklist e WHERE e.identerprise = :identerprise"),
    @NamedQuery(name = "Evaluationrisklist.findByIdclient", query = "SELECT e FROM Evaluationrisklist e WHERE e.idclient = :idclient")})
public class Evaluationrisklist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idevaluationrisklist")
    private Integer idevaluationrisklist;
    @Column(name = "idrisk")
    private Integer idrisk;
    @Lob
    @Column(name = "evaluation")
    private String evaluation;
    @Basic(optional = false)
    @Column(name = "identerprise")
    private int identerprise;
    @Basic(optional = false)
    @Column(name = "idclient")
    private int idclient;

    public Evaluationrisklist() {
    }

    public Evaluationrisklist(Integer idevaluationrisklist) {
        this.idevaluationrisklist = idevaluationrisklist;
    }

    public Evaluationrisklist(Integer idevaluationrisklist, int identerprise, int idclient) {
        this.idevaluationrisklist = idevaluationrisklist;
        this.identerprise = identerprise;
        this.idclient = idclient;
    }

    public Integer getIdevaluationrisklist() {
        return idevaluationrisklist;
    }

    public void setIdevaluationrisklist(Integer idevaluationrisklist) {
        this.idevaluationrisklist = idevaluationrisklist;
    }

    public Integer getIdrisk() {
        return idrisk;
    }

    public void setIdrisk(Integer idrisk) {
        this.idrisk = idrisk;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public int getIdenterprise() {
        return identerprise;
    }

    public void setIdenterprise(int identerprise) {
        this.identerprise = identerprise;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idevaluationrisklist != null ? idevaluationrisklist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluationrisklist)) {
            return false;
        }
        Evaluationrisklist other = (Evaluationrisklist) object;
        if ((this.idevaluationrisklist == null && other.idevaluationrisklist != null) || (this.idevaluationrisklist != null && !this.idevaluationrisklist.equals(other.idevaluationrisklist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdthreatrisks.Evaluationrisklist[ idevaluationrisklist=" + idevaluationrisklist + " ]";
    }

}

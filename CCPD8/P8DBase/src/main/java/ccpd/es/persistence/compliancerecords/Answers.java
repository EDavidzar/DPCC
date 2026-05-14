/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.persistence.compliancerecords;

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
@Table(name = "answers")
@NamedQueries({
    @NamedQuery(name = "Answers.findAll", query = "SELECT a FROM Answers a"),
    @NamedQuery(name = "Answers.findByIdAnswers", query = "SELECT a FROM Answers a WHERE a.idAnswers = :idAnswers"),
    @NamedQuery(name = "Answers.findByExcluded", query = "SELECT a FROM Answers a WHERE a.excluded = :excluded"),
    @NamedQuery(name = "Answers.findByIdClient", query = "SELECT a FROM Answers a WHERE a.idClient = :idClient"),
    @NamedQuery(name = "Answers.findByIdQuestion", query = "SELECT a FROM Answers a WHERE a.idQuestion = :idQuestion"),
    @NamedQuery(name = "Answers.findByTheanswer", query = "SELECT a FROM Answers a WHERE a.theanswer = :theanswer")})
public class Answers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_answers")
    private Integer idAnswers;
    @Column(name = "excluded")
    private Integer excluded;
    @Basic(optional = false)
    @Column(name = "id_client")
    private int idClient;
    @Column(name = "id_question")
    private Integer idQuestion;
    @Column(name = "theanswer")
    private String theanswer;

    public Answers() {
    }

    public Answers(Integer idAnswers) {
        this.idAnswers = idAnswers;
    }

    public Answers(Integer idAnswers, int idClient) {
        this.idAnswers = idAnswers;
        this.idClient = idClient;
    }

    public Integer getIdAnswers() {
        return idAnswers;
    }

    public void setIdAnswers(Integer idAnswers) {
        this.idAnswers = idAnswers;
    }

    public Integer getExcluded() {
        return excluded;
    }

    public void setExcluded(Integer excluded) {
        this.excluded = excluded;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Integer getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Integer idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getTheanswer() {
        return theanswer;
    }

    public void setTheanswer(String theanswer) {
        this.theanswer = theanswer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnswers != null ? idAnswers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Answers)) {
            return false;
        }
        Answers other = (Answers) object;
        if ((this.idAnswers == null && other.idAnswers != null) || (this.idAnswers != null && !this.idAnswers.equals(other.idAnswers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.persistence.compliancerecords.Answers[ idAnswers=" + idAnswers + " ]";
    }

}

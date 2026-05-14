/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.persistence.compliancerecords;

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
@Table(name = "questions")
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q"),
    @NamedQuery(name = "Questions.findByIdQuestions", query = "SELECT q FROM Questions q WHERE q.idQuestions = :idQuestions"),
    @NamedQuery(name = "Questions.findByAnswername", query = "SELECT q FROM Questions q WHERE q.answername = :answername"),
    @NamedQuery(name = "Questions.findByIdAnswerstype", query = "SELECT q FROM Questions q WHERE q.idAnswerstype = :idAnswerstype")})
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_questions")
    private Integer idQuestions;
    @Basic(optional = false)
    @Column(name = "answername")
    private String answername;
    @Basic(optional = false)
    @Lob
    @Column(name = "answer_recomendation")
    private String answerRecomendation;
    @Basic(optional = false)
    @Column(name = "id_answerstype")
    private int idAnswerstype;

    public Questions() {
    }

    public Questions(Integer idQuestions) {
        this.idQuestions = idQuestions;
    }

    public Questions(Integer idQuestions, String answername, String answerRecomendation, int idAnswerstype) {
        this.idQuestions = idQuestions;
        this.answername = answername;
        this.answerRecomendation = answerRecomendation;
        this.idAnswerstype = idAnswerstype;
    }

    public Integer getIdQuestions() {
        return idQuestions;
    }

    public void setIdQuestions(Integer idQuestions) {
        this.idQuestions = idQuestions;
    }

    public String getAnswername() {
        return answername;
    }

    public void setAnswername(String answername) {
        this.answername = answername;
    }

    public String getAnswerRecomendation() {
        return answerRecomendation;
    }

    public void setAnswerRecomendation(String answerRecomendation) {
        this.answerRecomendation = answerRecomendation;
    }

    public int getIdAnswerstype() {
        return idAnswerstype;
    }

    public void setIdAnswerstype(int idAnswerstype) {
        this.idAnswerstype = idAnswerstype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idQuestions != null ? idQuestions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.idQuestions == null && other.idQuestions != null) || (this.idQuestions != null && !this.idQuestions.equals(other.idQuestions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.persistence.compliancerecords.Questions[ idQuestions=" + idQuestions + " ]";
    }

}

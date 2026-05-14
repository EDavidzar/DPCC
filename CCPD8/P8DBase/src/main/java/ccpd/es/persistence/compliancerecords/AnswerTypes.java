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
@Table(name = "answer_types")
@NamedQueries({
    @NamedQuery(name = "AnswerTypes.findAll", query = "SELECT a FROM AnswerTypes a"),
    @NamedQuery(name = "AnswerTypes.findByIdAnswerTypes", query = "SELECT a FROM AnswerTypes a WHERE a.idAnswerTypes = :idAnswerTypes"),
    @NamedQuery(name = "AnswerTypes.findByAnswerTypesName", query = "SELECT a FROM AnswerTypes a WHERE a.answerTypesName = :answerTypesName")})
public class AnswerTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_answer_types")
    private Integer idAnswerTypes;
    @Basic(optional = false)
    @Column(name = "answer_types_name")
    private String answerTypesName;

    public AnswerTypes() {
    }

    public AnswerTypes(Integer idAnswerTypes) {
        this.idAnswerTypes = idAnswerTypes;
    }

    public AnswerTypes(Integer idAnswerTypes, String answerTypesName) {
        this.idAnswerTypes = idAnswerTypes;
        this.answerTypesName = answerTypesName;
    }

    public Integer getIdAnswerTypes() {
        return idAnswerTypes;
    }

    public void setIdAnswerTypes(Integer idAnswerTypes) {
        this.idAnswerTypes = idAnswerTypes;
    }

    public String getAnswerTypesName() {
        return answerTypesName;
    }

    public void setAnswerTypesName(String answerTypesName) {
        this.answerTypesName = answerTypesName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnswerTypes != null ? idAnswerTypes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnswerTypes)) {
            return false;
        }
        AnswerTypes other = (AnswerTypes) object;
        if ((this.idAnswerTypes == null && other.idAnswerTypes != null) || (this.idAnswerTypes != null && !this.idAnswerTypes.equals(other.idAnswerTypes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.persistence.compliancerecords.AnswerTypes[ idAnswerTypes=" + idAnswerTypes + " ]";
    }

}

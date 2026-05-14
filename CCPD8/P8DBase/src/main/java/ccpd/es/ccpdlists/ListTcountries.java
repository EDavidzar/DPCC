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
@Table(name = "list_tcountries")
@NamedQueries({
    @NamedQuery(name = "ListTcountries.findAll", query = "SELECT l FROM ListTcountries l"),
    @NamedQuery(name = "ListTcountries.findByPaiPk", query = "SELECT l FROM ListTcountries l WHERE l.paiPk = :paiPk"),
    @NamedQuery(name = "ListTcountries.findByPaiIsonum", query = "SELECT l FROM ListTcountries l WHERE l.paiIsonum = :paiIsonum"),
    @NamedQuery(name = "ListTcountries.findByPaiIso2", query = "SELECT l FROM ListTcountries l WHERE l.paiIso2 = :paiIso2"),
    @NamedQuery(name = "ListTcountries.findByPaiIso3", query = "SELECT l FROM ListTcountries l WHERE l.paiIso3 = :paiIso3"),
    @NamedQuery(name = "ListTcountries.findByPaiName", query = "SELECT l FROM ListTcountries l WHERE l.paiName = :paiName")})
public class ListTcountries implements Serializable {

    private static final long serialVersionUID = 4666097151690839840L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PAI_PK")
    private Integer paiPk;
    @Column(name = "PAI_ISONUM")
    private Short paiIsonum;
    @Column(name = "PAI_ISO2")
    private String paiIso2;
    @Column(name = "PAI_ISO3")
    private String paiIso3;
    @Column(name = "PAI_NAME")
    private String paiName;

    public ListTcountries() {
    }

    public ListTcountries(Integer paiPk) {
        this.paiPk = paiPk;
    }

    public Integer getPaiPk() {
        return paiPk;
    }

    public void setPaiPk(Integer paiPk) {
        this.paiPk = paiPk;
    }

    public Short getPaiIsonum() {
        return paiIsonum;
    }

    public void setPaiIsonum(Short paiIsonum) {
        this.paiIsonum = paiIsonum;
    }

    public String getPaiIso2() {
        return paiIso2;
    }

    public void setPaiIso2(String paiIso2) {
        this.paiIso2 = paiIso2;
    }

    public String getPaiIso3() {
        return paiIso3;
    }

    public void setPaiIso3(String paiIso3) {
        this.paiIso3 = paiIso3;
    }

    public String getPaiName() {
        return paiName;
    }

    public void setPaiName(String paiName) {
        this.paiName = paiName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paiPk != null ? paiPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListTcountries)) {
            return false;
        }
        ListTcountries other = (ListTcountries) object;
        if ((this.paiPk == null && other.paiPk != null) || (this.paiPk != null && !this.paiPk.equals(other.paiPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdlists.ListTcountries[ paiPk=" + paiPk + " ]";
    }

}

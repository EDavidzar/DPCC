/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.persistence.authentiicate;

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
@Table(name = "autenticate_table")
@NamedQueries({
    @NamedQuery(name = "AutenticateTable.findAll", query = "SELECT a FROM AutenticateTable a"),
    @NamedQuery(name = "AutenticateTable.findByIdAutenticateTableClient", query = "SELECT a FROM AutenticateTable a WHERE a.idAutenticateTableClient = :idAutenticateTableClient"),
    @NamedQuery(name = "AutenticateTable.findByClientname", query = "SELECT a FROM AutenticateTable a WHERE a.clientname = :clientname"),
    @NamedQuery(name = "AutenticateTable.findByClientpassword", query = "SELECT a FROM AutenticateTable a WHERE a.clientpassword = :clientpassword"),
    @NamedQuery(name = "AutenticateTable.findByPriority", query = "SELECT a FROM AutenticateTable a WHERE a.priority = :priority")})
public class AutenticateTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_autenticate_table_client")
    private Integer idAutenticateTableClient;
    @Basic(optional = false)
    @Column(name = "clientname")
    private String clientname;
    @Basic(optional = false)
    @Column(name = "clientpassword")
    private String clientpassword;
    @Column(name = "priority")
    private Integer priority;

    public AutenticateTable() {
    }

    public AutenticateTable(Integer idAutenticateTableClient) {
        this.idAutenticateTableClient = idAutenticateTableClient;
    }

    public AutenticateTable(Integer idAutenticateTableClient, String clientname, String clientpassword) {
        this.idAutenticateTableClient = idAutenticateTableClient;
        this.clientname = clientname;
        this.clientpassword = clientpassword;
    }

    public Integer getIdAutenticateTableClient() {
        return idAutenticateTableClient;
    }

    public void setIdAutenticateTableClient(Integer idAutenticateTableClient) {
        this.idAutenticateTableClient = idAutenticateTableClient;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClientpassword() {
        return clientpassword;
    }

    public void setClientpassword(String clientpassword) {
        this.clientpassword = clientpassword;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutenticateTableClient != null ? idAutenticateTableClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutenticateTable)) {
            return false;
        }
        AutenticateTable other = (AutenticateTable) object;
        if ((this.idAutenticateTableClient == null && other.idAutenticateTableClient != null) || (this.idAutenticateTableClient != null && !this.idAutenticateTableClient.equals(other.idAutenticateTableClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.persistence.authentiicate.AutenticateTable[ idAutenticateTableClient=" + idAutenticateTableClient + " ]";
    }

}

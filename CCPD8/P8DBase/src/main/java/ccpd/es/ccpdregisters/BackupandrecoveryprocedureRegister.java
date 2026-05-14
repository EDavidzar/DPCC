/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.ccpdregisters;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Emilio David Diaus López 2023-2025
 */
@Entity
@Table(name = "backupandrecoveryprocedure_register")
@NamedQueries({
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findAll", query = "SELECT b FROM BackupandrecoveryprocedureRegister b"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByIdbackupandrecoveryprocedureregister", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.idbackupandrecoveryprocedureregister = :idbackupandrecoveryprocedureregister"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByIdclient", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.idclient = :idclient"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByIdenterprise", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.identerprise = :identerprise"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByIdmediadata", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.idmediadata = :idmediadata"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByCopyorrecovery", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.copyorrecovery = :copyorrecovery"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByBackupmanager", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.backupmanager = :backupmanager"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByMediatobackupres", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.mediatobackupres = :mediatobackupres"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByPeriodicitycopy", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.periodicitycopy = :periodicitycopy"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByMethodologycopy", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.methodologycopy = :methodologycopy"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByDatamediaused", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.datamediaused = :datamediaused"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByStoragetime", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.storagetime = :storagetime"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByStoragelocation", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.storagelocation = :storagelocation"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByDate", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.date = :date"),
    @NamedQuery(name = "BackupandrecoveryprocedureRegister.findByPeriodicitytransfer", query = "SELECT b FROM BackupandrecoveryprocedureRegister b WHERE b.periodicitytransfer = :periodicitytransfer")})
public class BackupandrecoveryprocedureRegister implements Serializable {

    private static final long serialVersionUID = -6872015758152035482L;

    
    @Id
    @Basic(optional = false)
    @Column(name = "idbackupandrecoveryprocedureregister")
    private Integer idbackupandrecoveryprocedureregister;
    @Basic(optional = false)
    @Column(name = "idclient")
    private int idclient;
    @Basic(optional = false)
    @Column(name = "identerprise")
    private int identerprise;
    @Basic(optional = false)
    @Column(name = "idmediadata")
    private int idmediadata;
    @Basic(optional = false)
    @Column(name = "copyorrecovery")
    private int copyorrecovery;
    @Basic(optional = false)
    @Column(name = "backupmanager")
    private int backupmanager;
    @Column(name = "mediatobackupres")
    private String mediatobackupres;
    @Column(name = "periodicitycopy")
    private String periodicitycopy;
    @Column(name = "methodologycopy")
    private String methodologycopy;
    @Column(name = "datamediaused")
    private String datamediaused;
    @Column(name = "storagetime")
    private String storagetime;
    @Column(name = "storagelocation")
    private String storagelocation;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "periodicitytransfer")
    private String periodicitytransfer;

    public BackupandrecoveryprocedureRegister() {
    }

    public BackupandrecoveryprocedureRegister(Integer idbackupandrecoveryprocedureregister) {
        this.idbackupandrecoveryprocedureregister = idbackupandrecoveryprocedureregister;
    }

    public BackupandrecoveryprocedureRegister(Integer idbackupandrecoveryprocedureregister, int idclient, int identerprise, int idmediadata, int copyorrecovery, int backupmanager) {
        this.idbackupandrecoveryprocedureregister = idbackupandrecoveryprocedureregister;
        this.idclient = idclient;
        this.identerprise = identerprise;
        this.idmediadata = idmediadata;
        this.copyorrecovery = copyorrecovery;
        this.backupmanager = backupmanager;
    }

    public Integer getIdbackupandrecoveryprocedureregister() {
        return idbackupandrecoveryprocedureregister;
    }

    public void setIdbackupandrecoveryprocedureregister(Integer idbackupandrecoveryprocedureregister) {
        this.idbackupandrecoveryprocedureregister = idbackupandrecoveryprocedureregister;
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

    public int getIdmediadata() {
        return idmediadata;
    }

    public void setIdmediadata(int idmediadata) {
        this.idmediadata = idmediadata;
    }

    public int getCopyorrecovery() {
        return copyorrecovery;
    }

    public void setCopyorrecovery(int copyorrecovery) {
        this.copyorrecovery = copyorrecovery;
    }

    public int getBackupmanager() {
        return backupmanager;
    }

    public void setBackupmanager(int backupmanager) {
        this.backupmanager = backupmanager;
    }

    public String getMediatobackupres() {
        return mediatobackupres;
    }

    public void setMediatobackupres(String mediatobackupres) {
        this.mediatobackupres = mediatobackupres;
    }

    public String getPeriodicitycopy() {
        return periodicitycopy;
    }

    public void setPeriodicitycopy(String periodicitycopy) {
        this.periodicitycopy = periodicitycopy;
    }

    public String getMethodologycopy() {
        return methodologycopy;
    }

    public void setMethodologycopy(String methodologycopy) {
        this.methodologycopy = methodologycopy;
    }

    public String getDatamediaused() {
        return datamediaused;
    }

    public void setDatamediaused(String datamediaused) {
        this.datamediaused = datamediaused;
    }

    public String getStoragetime() {
        return storagetime;
    }

    public void setStoragetime(String storagetime) {
        this.storagetime = storagetime;
    }

    public String getStoragelocation() {
        return storagelocation;
    }

    public void setStoragelocation(String storagelocation) {
        this.storagelocation = storagelocation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPeriodicitytransfer() {
        return periodicitytransfer;
    }

    public void setPeriodicitytransfer(String periodicitytransfer) {
        this.periodicitytransfer = periodicitytransfer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbackupandrecoveryprocedureregister != null ? idbackupandrecoveryprocedureregister.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BackupandrecoveryprocedureRegister)) {
            return false;
        }
        BackupandrecoveryprocedureRegister other = (BackupandrecoveryprocedureRegister) object;
        if ((this.idbackupandrecoveryprocedureregister == null && other.idbackupandrecoveryprocedureregister != null) || (this.idbackupandrecoveryprocedureregister != null && !this.idbackupandrecoveryprocedureregister.equals(other.idbackupandrecoveryprocedureregister))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccpd.es.ccpdregisters.BackupandrecoveryprocedureRegister[ idbackupandrecoveryprocedureregister=" + idbackupandrecoveryprocedureregister + " ]";
    }

}

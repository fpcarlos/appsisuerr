/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appsisuerr.modelo;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "tb_locais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locais.findAll", query = "SELECT l FROM Locais l")
    , @NamedQuery(name = "Locais.findByIdLocal", query = "SELECT l FROM Locais l WHERE l.idLocal = :idLocal")
    , @NamedQuery(name = "Locais.findByIdCertame", query = "SELECT l FROM Locais l WHERE l.idCertame = :idCertame")
    , @NamedQuery(name = "Locais.findByEspecial", query = "SELECT l FROM Locais l WHERE l.especial = :especial")
    , @NamedQuery(name = "Locais.findByNomeLocal", query = "SELECT l FROM Locais l WHERE l.nomeLocal = :nomeLocal")
    , @NamedQuery(name = "Locais.findByIdMunicipio", query = "SELECT l FROM Locais l WHERE l.idMunicipio = :idMunicipio")
    , @NamedQuery(name = "Locais.findBySiglaLocal", query = "SELECT l FROM Locais l WHERE l.siglaLocal = :siglaLocal")
    , @NamedQuery(name = "Locais.findByRespLocal", query = "SELECT l FROM Locais l WHERE l.respLocal = :respLocal")
    , @NamedQuery(name = "Locais.findByFoneLocal", query = "SELECT l FROM Locais l WHERE l.foneLocal = :foneLocal")
    , @NamedQuery(name = "Locais.findByEndLocal", query = "SELECT l FROM Locais l WHERE l.endLocal = :endLocal")
    , @NamedQuery(name = "Locais.findByNsalaLocal", query = "SELECT l FROM Locais l WHERE l.nsalaLocal = :nsalaLocal")
    , @NamedQuery(name = "Locais.findByQtdalusalaLocal", query = "SELECT l FROM Locais l WHERE l.qtdalusalaLocal = :qtdalusalaLocal")
    , @NamedQuery(name = "Locais.findByQtdaluLocal", query = "SELECT l FROM Locais l WHERE l.qtdaluLocal = :qtdaluLocal")
    , @NamedQuery(name = "Locais.findByStatus", query = "SELECT l FROM Locais l WHERE l.status = :status")
    , @NamedQuery(name = "Locais.findByStatus2", query = "SELECT l FROM Locais l WHERE l.status2 = :status2")})
public class Locais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_local")
    private Integer idLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Basic(optional = false)
    @NotNull
    @Column(name = "especial")
    private int especial;
    @Size(max = 150)
    @Column(name = "nome_local")
    private String nomeLocal;
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    @Size(max = 20)
    @Column(name = "sigla_local")
    private String siglaLocal;
    @Size(max = 50)
    @Column(name = "resp_local")
    private String respLocal;
    @Size(max = 20)
    @Column(name = "fone_local")
    private String foneLocal;
    @Size(max = 100)
    @Column(name = "end_local")
    private String endLocal;
    @Column(name = "nsala_local")
    private Integer nsalaLocal;
    @Column(name = "qtdalusala_local")
    private Integer qtdalusalaLocal;
    @Column(name = "qtdalu_local")
    private Integer qtdaluLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Column(name = "status2")
    private Integer status2;

    public Locais() {
    }

    public Locais(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Locais(Integer idLocal, int idCertame, int especial, int status) {
        this.idLocal = idLocal;
        this.idCertame = idCertame;
        this.especial = especial;
        this.status = status;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getSiglaLocal() {
        return siglaLocal;
    }

    public void setSiglaLocal(String siglaLocal) {
        this.siglaLocal = siglaLocal;
    }

    public String getRespLocal() {
        return respLocal;
    }

    public void setRespLocal(String respLocal) {
        this.respLocal = respLocal;
    }

    public String getFoneLocal() {
        return foneLocal;
    }

    public void setFoneLocal(String foneLocal) {
        this.foneLocal = foneLocal;
    }

    public String getEndLocal() {
        return endLocal;
    }

    public void setEndLocal(String endLocal) {
        this.endLocal = endLocal;
    }

    public Integer getNsalaLocal() {
        return nsalaLocal;
    }

    public void setNsalaLocal(Integer nsalaLocal) {
        this.nsalaLocal = nsalaLocal;
    }

    public Integer getQtdalusalaLocal() {
        return qtdalusalaLocal;
    }

    public void setQtdalusalaLocal(Integer qtdalusalaLocal) {
        this.qtdalusalaLocal = qtdalusalaLocal;
    }

    public Integer getQtdaluLocal() {
        return qtdaluLocal;
    }

    public void setQtdaluLocal(Integer qtdaluLocal) {
        this.qtdaluLocal = qtdaluLocal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Integer getStatus2() {
        return status2;
    }

    public void setStatus2(Integer status2) {
        this.status2 = status2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLocal != null ? idLocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locais)) {
            return false;
        }
        Locais other = (Locais) object;
        if ((this.idLocal == null && other.idLocal != null) || (this.idLocal != null && !this.idLocal.equals(other.idLocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Locais[ idLocal=" + idLocal + " ]";
    }
    
}

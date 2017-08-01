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
import javax.persistence.Lob;
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
@Table(name = "tb_tipo_isencao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoIsencao.findAll", query = "SELECT t FROM TipoIsencao t")
    , @NamedQuery(name = "TipoIsencao.findByIdTipoIsencao", query = "SELECT t FROM TipoIsencao t WHERE t.idTipoIsencao = :idTipoIsencao")
    , @NamedQuery(name = "TipoIsencao.findByIdCertame", query = "SELECT t FROM TipoIsencao t WHERE t.idCertame = :idCertame")
    , @NamedQuery(name = "TipoIsencao.findByNomeTipoIsencao", query = "SELECT t FROM TipoIsencao t WHERE t.nomeTipoIsencao = :nomeTipoIsencao")})
public class TipoIsencao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_isencao")
    private Integer idTipoIsencao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nome_tipo_isencao")
    private String nomeTipoIsencao;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "desc_tipo_isencao")
    private String descTipoIsencao;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "obs_tipo_isencao")
    private String obsTipoIsencao;
    @Lob
    @Size(max = 16777215)
    @Column(name = "texto_isencao")
    private String textoIsencao;

    public TipoIsencao() {
    }

    public TipoIsencao(Integer idTipoIsencao) {
        this.idTipoIsencao = idTipoIsencao;
    }

    public TipoIsencao(Integer idTipoIsencao, int idCertame, String nomeTipoIsencao, String descTipoIsencao, String obsTipoIsencao) {
        this.idTipoIsencao = idTipoIsencao;
        this.idCertame = idCertame;
        this.nomeTipoIsencao = nomeTipoIsencao;
        this.descTipoIsencao = descTipoIsencao;
        this.obsTipoIsencao = obsTipoIsencao;
    }

    public Integer getIdTipoIsencao() {
        return idTipoIsencao;
    }

    public void setIdTipoIsencao(Integer idTipoIsencao) {
        this.idTipoIsencao = idTipoIsencao;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public String getNomeTipoIsencao() {
        return nomeTipoIsencao;
    }

    public void setNomeTipoIsencao(String nomeTipoIsencao) {
        this.nomeTipoIsencao = nomeTipoIsencao;
    }

    public String getDescTipoIsencao() {
        return descTipoIsencao;
    }

    public void setDescTipoIsencao(String descTipoIsencao) {
        this.descTipoIsencao = descTipoIsencao;
    }

    public String getObsTipoIsencao() {
        return obsTipoIsencao;
    }

    public void setObsTipoIsencao(String obsTipoIsencao) {
        this.obsTipoIsencao = obsTipoIsencao;
    }

    public String getTextoIsencao() {
        return textoIsencao;
    }

    public void setTextoIsencao(String textoIsencao) {
        this.textoIsencao = textoIsencao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoIsencao != null ? idTipoIsencao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoIsencao)) {
            return false;
        }
        TipoIsencao other = (TipoIsencao) object;
        if ((this.idTipoIsencao == null && other.idTipoIsencao != null) || (this.idTipoIsencao != null && !this.idTipoIsencao.equals(other.idTipoIsencao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.TipoIsencao[ idTipoIsencao=" + idTipoIsencao + " ]";
    }
    
}

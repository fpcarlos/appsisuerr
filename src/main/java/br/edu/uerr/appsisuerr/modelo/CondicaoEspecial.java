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
@Table(name = "tb_condicao_especial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CondicaoEspecial.findAll", query = "SELECT c FROM CondicaoEspecial c")
    , @NamedQuery(name = "CondicaoEspecial.findByIdCondicao", query = "SELECT c FROM CondicaoEspecial c WHERE c.idCondicao = :idCondicao")
    , @NamedQuery(name = "CondicaoEspecial.findByNomeCondicao", query = "SELECT c FROM CondicaoEspecial c WHERE c.nomeCondicao = :nomeCondicao")
    , @NamedQuery(name = "CondicaoEspecial.findByBloqueado", query = "SELECT c FROM CondicaoEspecial c WHERE c.bloqueado = :bloqueado")})
public class CondicaoEspecial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_condicao")
    private Integer idCondicao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nome_condicao")
    private String nomeCondicao;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "desc_condicao")
    private String descCondicao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bloqueado")
    private int bloqueado;

    public CondicaoEspecial() {
    }

    public CondicaoEspecial(Integer idCondicao) {
        this.idCondicao = idCondicao;
    }

    public CondicaoEspecial(Integer idCondicao, String nomeCondicao, int bloqueado) {
        this.idCondicao = idCondicao;
        this.nomeCondicao = nomeCondicao;
        this.bloqueado = bloqueado;
    }

    public Integer getIdCondicao() {
        return idCondicao;
    }

    public void setIdCondicao(Integer idCondicao) {
        this.idCondicao = idCondicao;
    }

    public String getNomeCondicao() {
        return nomeCondicao;
    }

    public void setNomeCondicao(String nomeCondicao) {
        this.nomeCondicao = nomeCondicao;
    }

    public String getDescCondicao() {
        return descCondicao;
    }

    public void setDescCondicao(String descCondicao) {
        this.descCondicao = descCondicao;
    }

    public int getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(int bloqueado) {
        this.bloqueado = bloqueado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCondicao != null ? idCondicao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CondicaoEspecial)) {
            return false;
        }
        CondicaoEspecial other = (CondicaoEspecial) object;
        if ((this.idCondicao == null && other.idCondicao != null) || (this.idCondicao != null && !this.idCondicao.equals(other.idCondicao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.CondicaoEspecial[ idCondicao=" + idCondicao + " ]";
    }
    
}

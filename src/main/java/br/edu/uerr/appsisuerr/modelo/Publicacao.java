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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "tb_publicacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publicacao.findAll", query = "SELECT p FROM Publicacao p")
    , @NamedQuery(name = "Publicacao.findByIdCertame", query = "SELECT p FROM Publicacao p WHERE p.idCertame = :idCertame")
    , @NamedQuery(name = "Publicacao.findByPubLocalProva", query = "SELECT p FROM Publicacao p WHERE p.pubLocalProva = :pubLocalProva")
    , @NamedQuery(name = "Publicacao.findByPubResPreliminar", query = "SELECT p FROM Publicacao p WHERE p.pubResPreliminar = :pubResPreliminar")
    , @NamedQuery(name = "Publicacao.findByPubResFinal", query = "SELECT p FROM Publicacao p WHERE p.pubResFinal = :pubResFinal")
    , @NamedQuery(name = "Publicacao.findByPubNoticias", query = "SELECT p FROM Publicacao p WHERE p.pubNoticias = :pubNoticias")
    , @NamedQuery(name = "Publicacao.findByPubListaIsentos", query = "SELECT p FROM Publicacao p WHERE p.pubListaIsentos = :pubListaIsentos")
    , @NamedQuery(name = "Publicacao.findByPubListaIsencao", query = "SELECT p FROM Publicacao p WHERE p.pubListaIsencao = :pubListaIsencao")
    , @NamedQuery(name = "Publicacao.findByPubCertame", query = "SELECT p FROM Publicacao p WHERE p.pubCertame = :pubCertame")})
public class Publicacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private Integer idCertame;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pub_local_prova")
    private int pubLocalProva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pub_res_preliminar")
    private int pubResPreliminar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pub_res_final")
    private int pubResFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pub_noticias")
    private int pubNoticias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pub_lista_isentos")
    private int pubListaIsentos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pub_lista_isencao")
    private int pubListaIsencao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pub_certame")
    private int pubCertame;

    public Publicacao() {
    }

    public Publicacao(Integer idCertame) {
        this.idCertame = idCertame;
    }

    public Publicacao(Integer idCertame, int pubLocalProva, int pubResPreliminar, int pubResFinal, int pubNoticias, int pubListaIsentos, int pubListaIsencao, int pubCertame) {
        this.idCertame = idCertame;
        this.pubLocalProva = pubLocalProva;
        this.pubResPreliminar = pubResPreliminar;
        this.pubResFinal = pubResFinal;
        this.pubNoticias = pubNoticias;
        this.pubListaIsentos = pubListaIsentos;
        this.pubListaIsencao = pubListaIsencao;
        this.pubCertame = pubCertame;
    }

    public Integer getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(Integer idCertame) {
        this.idCertame = idCertame;
    }

    public int getPubLocalProva() {
        return pubLocalProva;
    }

    public void setPubLocalProva(int pubLocalProva) {
        this.pubLocalProva = pubLocalProva;
    }

    public int getPubResPreliminar() {
        return pubResPreliminar;
    }

    public void setPubResPreliminar(int pubResPreliminar) {
        this.pubResPreliminar = pubResPreliminar;
    }

    public int getPubResFinal() {
        return pubResFinal;
    }

    public void setPubResFinal(int pubResFinal) {
        this.pubResFinal = pubResFinal;
    }

    public int getPubNoticias() {
        return pubNoticias;
    }

    public void setPubNoticias(int pubNoticias) {
        this.pubNoticias = pubNoticias;
    }

    public int getPubListaIsentos() {
        return pubListaIsentos;
    }

    public void setPubListaIsentos(int pubListaIsentos) {
        this.pubListaIsentos = pubListaIsentos;
    }

    public int getPubListaIsencao() {
        return pubListaIsencao;
    }

    public void setPubListaIsencao(int pubListaIsencao) {
        this.pubListaIsencao = pubListaIsencao;
    }

    public int getPubCertame() {
        return pubCertame;
    }

    public void setPubCertame(int pubCertame) {
        this.pubCertame = pubCertame;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCertame != null ? idCertame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicacao)) {
            return false;
        }
        Publicacao other = (Publicacao) object;
        if ((this.idCertame == null && other.idCertame != null) || (this.idCertame != null && !this.idCertame.equals(other.idCertame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Publicacao[ idCertame=" + idCertame + " ]";
    }
    
}

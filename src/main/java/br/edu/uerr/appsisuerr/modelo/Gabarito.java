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
@Table(name = "tb_gabarito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gabarito.findAll", query = "SELECT g FROM Gabarito g")
    , @NamedQuery(name = "Gabarito.findByIdCertame", query = "SELECT g FROM Gabarito g WHERE g.idCertame = :idCertame")
    , @NamedQuery(name = "Gabarito.findByIdResp", query = "SELECT g FROM Gabarito g WHERE g.idResp = :idResp")
    , @NamedQuery(name = "Gabarito.findByIdArea", query = "SELECT g FROM Gabarito g WHERE g.idArea = :idArea")
    , @NamedQuery(name = "Gabarito.findByIdCargo", query = "SELECT g FROM Gabarito g WHERE g.idCargo = :idCargo")
    , @NamedQuery(name = "Gabarito.findByResposta", query = "SELECT g FROM Gabarito g WHERE g.resposta = :resposta")
    , @NamedQuery(name = "Gabarito.findByNquestoes", query = "SELECT g FROM Gabarito g WHERE g.nquestoes = :nquestoes")
    , @NamedQuery(name = "Gabarito.findByAtivo", query = "SELECT g FROM Gabarito g WHERE g.ativo = :ativo")
    , @NamedQuery(name = "Gabarito.findByIdlingua", query = "SELECT g FROM Gabarito g WHERE g.idlingua = :idlingua")})
public class Gabarito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_resp")
    private Short idResp;
    @Column(name = "id_area")
    private Integer idArea;
    @Column(name = "id_cargo")
    private Integer idCargo;
    @Size(max = 100)
    @Column(name = "resposta")
    private String resposta;
    @Column(name = "nquestoes")
    private Integer nquestoes;
    @Column(name = "ativo")
    private Integer ativo;
    @Column(name = "idlingua")
    private Integer idlingua;

    public Gabarito() {
    }

    public Gabarito(Short idResp) {
        this.idResp = idResp;
    }

    public Gabarito(Short idResp, int idCertame) {
        this.idResp = idResp;
        this.idCertame = idCertame;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public Short getIdResp() {
        return idResp;
    }

    public void setIdResp(Short idResp) {
        this.idResp = idResp;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Integer getNquestoes() {
        return nquestoes;
    }

    public void setNquestoes(Integer nquestoes) {
        this.nquestoes = nquestoes;
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    public Integer getIdlingua() {
        return idlingua;
    }

    public void setIdlingua(Integer idlingua) {
        this.idlingua = idlingua;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResp != null ? idResp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gabarito)) {
            return false;
        }
        Gabarito other = (Gabarito) object;
        if ((this.idResp == null && other.idResp != null) || (this.idResp != null && !this.idResp.equals(other.idResp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Gabarito[ idResp=" + idResp + " ]";
    }
    
}

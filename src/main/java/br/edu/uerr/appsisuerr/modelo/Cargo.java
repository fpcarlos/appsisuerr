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
@Table(name = "tb_cargo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cargo.findAll", query = "SELECT c FROM Cargo c")
    , @NamedQuery(name = "Cargo.findByIdCargo", query = "SELECT c FROM Cargo c WHERE c.idCargo = :idCargo")
    , @NamedQuery(name = "Cargo.findByIdCertame", query = "SELECT c FROM Cargo c WHERE c.idCertame = :idCertame")
    , @NamedQuery(name = "Cargo.findByNomeCargo", query = "SELECT c FROM Cargo c WHERE c.nomeCargo = :nomeCargo")
    , @NamedQuery(name = "Cargo.findByNomeLocal", query = "SELECT c FROM Cargo c WHERE c.nomeLocal = :nomeLocal")
    , @NamedQuery(name = "Cargo.findByAbrevCargo", query = "SELECT c FROM Cargo c WHERE c.abrevCargo = :abrevCargo")
    , @NamedQuery(name = "Cargo.findByLocalprova", query = "SELECT c FROM Cargo c WHERE c.localprova = :localprova")
    , @NamedQuery(name = "Cargo.findByVagadeficiente", query = "SELECT c FROM Cargo c WHERE c.vagadeficiente = :vagadeficiente")
    , @NamedQuery(name = "Cargo.findByQtVagadeficiente", query = "SELECT c FROM Cargo c WHERE c.qtVagadeficiente = :qtVagadeficiente")
    , @NamedQuery(name = "Cargo.findByGrupo", query = "SELECT c FROM Cargo c WHERE c.grupo = :grupo")
    , @NamedQuery(name = "Cargo.findByTipocargo", query = "SELECT c FROM Cargo c WHERE c.tipocargo = :tipocargo")
    , @NamedQuery(name = "Cargo.findByQtVagas", query = "SELECT c FROM Cargo c WHERE c.qtVagas = :qtVagas")})
public class Cargo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cargo")
    private Integer idCargo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Size(max = 150)
    @Column(name = "nome_cargo")
    private String nomeCargo;
    @Size(max = 150)
    @Column(name = "nome_local")
    private String nomeLocal;
    @Size(max = 150)
    @Column(name = "abrev_cargo")
    private String abrevCargo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "localprova")
    private String localprova;
    @Column(name = "vagadeficiente")
    private Integer vagadeficiente;
    @Column(name = "qt_vagadeficiente")
    private Integer qtVagadeficiente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grupo")
    private int grupo;
    @Size(max = 50)
    @Column(name = "tipocargo")
    private String tipocargo;
    @Column(name = "qt_vagas")
    private Integer qtVagas;

    public Cargo() {
    }

    public Cargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Cargo(Integer idCargo, int idCertame, String localprova, int grupo) {
        this.idCargo = idCargo;
        this.idCertame = idCertame;
        this.localprova = localprova;
        this.grupo = grupo;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getAbrevCargo() {
        return abrevCargo;
    }

    public void setAbrevCargo(String abrevCargo) {
        this.abrevCargo = abrevCargo;
    }

    public String getLocalprova() {
        return localprova;
    }

    public void setLocalprova(String localprova) {
        this.localprova = localprova;
    }

    public Integer getVagadeficiente() {
        return vagadeficiente;
    }

    public void setVagadeficiente(Integer vagadeficiente) {
        this.vagadeficiente = vagadeficiente;
    }

    public Integer getQtVagadeficiente() {
        return qtVagadeficiente;
    }

    public void setQtVagadeficiente(Integer qtVagadeficiente) {
        this.qtVagadeficiente = qtVagadeficiente;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getTipocargo() {
        return tipocargo;
    }

    public void setTipocargo(String tipocargo) {
        this.tipocargo = tipocargo;
    }

    public Integer getQtVagas() {
        return qtVagas;
    }

    public void setQtVagas(Integer qtVagas) {
        this.qtVagas = qtVagas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargo != null ? idCargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        if ((this.idCargo == null && other.idCargo != null) || (this.idCargo != null && !this.idCargo.equals(other.idCargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Cargo[ idCargo=" + idCargo + " ]";
    }
    
}

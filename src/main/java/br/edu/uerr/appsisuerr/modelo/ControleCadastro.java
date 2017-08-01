/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appsisuerr.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "tb_controle_cadastro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ControleCadastro.findAll", query = "SELECT c FROM ControleCadastro c")
    , @NamedQuery(name = "ControleCadastro.findById", query = "SELECT c FROM ControleCadastro c WHERE c.id = :id")
    , @NamedQuery(name = "ControleCadastro.findByIdCertame", query = "SELECT c FROM ControleCadastro c WHERE c.idCertame = :idCertame")
    , @NamedQuery(name = "ControleCadastro.findByIdCargo", query = "SELECT c FROM ControleCadastro c WHERE c.idCargo = :idCargo")
    , @NamedQuery(name = "ControleCadastro.findByIdCargoOp2", query = "SELECT c FROM ControleCadastro c WHERE c.idCargoOp2 = :idCargoOp2")
    , @NamedQuery(name = "ControleCadastro.findByIdCandidato", query = "SELECT c FROM ControleCadastro c WHERE c.idCandidato = :idCandidato")
    , @NamedQuery(name = "ControleCadastro.findByIdCadastro", query = "SELECT c FROM ControleCadastro c WHERE c.idCadastro = :idCadastro")
    , @NamedQuery(name = "ControleCadastro.findByNboleto", query = "SELECT c FROM ControleCadastro c WHERE c.nboleto = :nboleto")
    , @NamedQuery(name = "ControleCadastro.findByNumero", query = "SELECT c FROM ControleCadastro c WHERE c.numero = :numero")
    , @NamedQuery(name = "ControleCadastro.findByNboletoNovo", query = "SELECT c FROM ControleCadastro c WHERE c.nboletoNovo = :nboletoNovo")
    , @NamedQuery(name = "ControleCadastro.findByDataCadBoleto", query = "SELECT c FROM ControleCadastro c WHERE c.dataCadBoleto = :dataCadBoleto")})
public class ControleCadastro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "id_certame")
    private Integer idCertame;
    @Column(name = "id_cargo")
    private Integer idCargo;
    @Column(name = "id_cargo_op2")
    private Integer idCargoOp2;
    @Column(name = "id_candidato")
    private Integer idCandidato;
    @Column(name = "id_cadastro")
    private Integer idCadastro;
    @Size(max = 50)
    @Column(name = "nboleto")
    private String nboleto;
    @Size(max = 5)
    @Column(name = "numero")
    private String numero;
    @Size(max = 50)
    @Column(name = "nboleto_novo")
    private String nboletoNovo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_cad_boleto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadBoleto;

    public ControleCadastro() {
    }

    public ControleCadastro(Integer id) {
        this.id = id;
    }

    public ControleCadastro(Integer id, Date dataCadBoleto) {
        this.id = id;
        this.dataCadBoleto = dataCadBoleto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(Integer idCertame) {
        this.idCertame = idCertame;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getIdCargoOp2() {
        return idCargoOp2;
    }

    public void setIdCargoOp2(Integer idCargoOp2) {
        this.idCargoOp2 = idCargoOp2;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

    public Integer getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(Integer idCadastro) {
        this.idCadastro = idCadastro;
    }

    public String getNboleto() {
        return nboleto;
    }

    public void setNboleto(String nboleto) {
        this.nboleto = nboleto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNboletoNovo() {
        return nboletoNovo;
    }

    public void setNboletoNovo(String nboletoNovo) {
        this.nboletoNovo = nboletoNovo;
    }

    public Date getDataCadBoleto() {
        return dataCadBoleto;
    }

    public void setDataCadBoleto(Date dataCadBoleto) {
        this.dataCadBoleto = dataCadBoleto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControleCadastro)) {
            return false;
        }
        ControleCadastro other = (ControleCadastro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.ControleCadastro[ id=" + id + " ]";
    }
    
}

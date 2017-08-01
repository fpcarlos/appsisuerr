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
@Table(name = "tb_cargo_tb_certame_tb_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CargoCertameArea.findAll", query = "SELECT c FROM CargoCertameArea c")
    , @NamedQuery(name = "CargoCertameArea.findById", query = "SELECT c FROM CargoCertameArea c WHERE c.id = :id")
    , @NamedQuery(name = "CargoCertameArea.findByIdCargo", query = "SELECT c FROM CargoCertameArea c WHERE c.idCargo = :idCargo")
    , @NamedQuery(name = "CargoCertameArea.findByIdCertame", query = "SELECT c FROM CargoCertameArea c WHERE c.idCertame = :idCertame")
    , @NamedQuery(name = "CargoCertameArea.findByIdArea", query = "SELECT c FROM CargoCertameArea c WHERE c.idArea = :idArea")
    , @NamedQuery(name = "CargoCertameArea.findByIdTurno", query = "SELECT c FROM CargoCertameArea c WHERE c.idTurno = :idTurno")
    , @NamedQuery(name = "CargoCertameArea.findByNvagas", query = "SELECT c FROM CargoCertameArea c WHERE c.nvagas = :nvagas")
    , @NamedQuery(name = "CargoCertameArea.findByValor", query = "SELECT c FROM CargoCertameArea c WHERE c.valor = :valor")
    , @NamedQuery(name = "CargoCertameArea.findByAtivoConcurso", query = "SELECT c FROM CargoCertameArea c WHERE c.ativoConcurso = :ativoConcurso")
    , @NamedQuery(name = "CargoCertameArea.findByDataprova", query = "SELECT c FROM CargoCertameArea c WHERE c.dataprova = :dataprova")
    , @NamedQuery(name = "CargoCertameArea.findByDatavencepg", query = "SELECT c FROM CargoCertameArea c WHERE c.datavencepg = :datavencepg")
    , @NamedQuery(name = "CargoCertameArea.findByIdModalidade", query = "SELECT c FROM CargoCertameArea c WHERE c.idModalidade = :idModalidade")})
public class CargoCertameArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cargo")
    private int idCargo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_area")
    private int idArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_turno")
    private int idTurno;
    @Column(name = "nvagas")
    private Integer nvagas;
    @Size(max = 10)
    @Column(name = "valor")
    private String valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ativo_concurso")
    private int ativoConcurso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataprova")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataprova;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datavencepg")
    @Temporal(TemporalType.DATE)
    private Date datavencepg;
    @Column(name = "id_modalidade")
    private Integer idModalidade;

    public CargoCertameArea() {
    }

    public CargoCertameArea(Integer id) {
        this.id = id;
    }

    public CargoCertameArea(Integer id, int idCargo, int idCertame, int idArea, int idTurno, int ativoConcurso, Date dataprova, Date datavencepg) {
        this.id = id;
        this.idCargo = idCargo;
        this.idCertame = idCertame;
        this.idArea = idArea;
        this.idTurno = idTurno;
        this.ativoConcurso = ativoConcurso;
        this.dataprova = dataprova;
        this.datavencepg = datavencepg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getNvagas() {
        return nvagas;
    }

    public void setNvagas(Integer nvagas) {
        this.nvagas = nvagas;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getAtivoConcurso() {
        return ativoConcurso;
    }

    public void setAtivoConcurso(int ativoConcurso) {
        this.ativoConcurso = ativoConcurso;
    }

    public Date getDataprova() {
        return dataprova;
    }

    public void setDataprova(Date dataprova) {
        this.dataprova = dataprova;
    }

    public Date getDatavencepg() {
        return datavencepg;
    }

    public void setDatavencepg(Date datavencepg) {
        this.datavencepg = datavencepg;
    }

    public Integer getIdModalidade() {
        return idModalidade;
    }

    public void setIdModalidade(Integer idModalidade) {
        this.idModalidade = idModalidade;
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
        if (!(object instanceof CargoCertameArea)) {
            return false;
        }
        CargoCertameArea other = (CargoCertameArea) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.CargoCertameArea[ id=" + id + " ]";
    }
    
}

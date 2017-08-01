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
@Table(name = "tb_cadastro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastro.findAll", query = "SELECT c FROM Cadastro c")
    , @NamedQuery(name = "Cadastro.findByIdCadastro", query = "SELECT c FROM Cadastro c WHERE c.idCadastro = :idCadastro")
    , @NamedQuery(name = "Cadastro.findByIdCertame", query = "SELECT c FROM Cadastro c WHERE c.idCertame = :idCertame")
    , @NamedQuery(name = "Cadastro.findByIdArea", query = "SELECT c FROM Cadastro c WHERE c.idArea = :idArea")
    , @NamedQuery(name = "Cadastro.findByIdCargo1", query = "SELECT c FROM Cadastro c WHERE c.idCargo1 = :idCargo1")
    , @NamedQuery(name = "Cadastro.findByIdCargo2", query = "SELECT c FROM Cadastro c WHERE c.idCargo2 = :idCargo2")
    , @NamedQuery(name = "Cadastro.findByIdCargo3", query = "SELECT c FROM Cadastro c WHERE c.idCargo3 = :idCargo3")
    , @NamedQuery(name = "Cadastro.findByIdTurno", query = "SELECT c FROM Cadastro c WHERE c.idTurno = :idTurno")
    , @NamedQuery(name = "Cadastro.findByIdCandidato", query = "SELECT c FROM Cadastro c WHERE c.idCandidato = :idCandidato")
    , @NamedQuery(name = "Cadastro.findByNboleto", query = "SELECT c FROM Cadastro c WHERE c.nboleto = :nboleto")
    , @NamedQuery(name = "Cadastro.findByIdentificacao", query = "SELECT c FROM Cadastro c WHERE c.identificacao = :identificacao")
    , @NamedQuery(name = "Cadastro.findByIdIdioma", query = "SELECT c FROM Cadastro c WHERE c.idIdioma = :idIdioma")
    , @NamedQuery(name = "Cadastro.findByDataCadastro", query = "SELECT c FROM Cadastro c WHERE c.dataCadastro = :dataCadastro")
    , @NamedQuery(name = "Cadastro.findByIsento", query = "SELECT c FROM Cadastro c WHERE c.isento = :isento")
    , @NamedQuery(name = "Cadastro.findByIsentoTipo", query = "SELECT c FROM Cadastro c WHERE c.isentoTipo = :isentoTipo")
    , @NamedQuery(name = "Cadastro.findByPg", query = "SELECT c FROM Cadastro c WHERE c.pg = :pg")
    , @NamedQuery(name = "Cadastro.findByHomologada", query = "SELECT c FROM Cadastro c WHERE c.homologada = :homologada")
    , @NamedQuery(name = "Cadastro.findByIdLocal", query = "SELECT c FROM Cadastro c WHERE c.idLocal = :idLocal")
    , @NamedQuery(name = "Cadastro.findBySalaprova", query = "SELECT c FROM Cadastro c WHERE c.salaprova = :salaprova")
    , @NamedQuery(name = "Cadastro.findByIdLocalPublic", query = "SELECT c FROM Cadastro c WHERE c.idLocalPublic = :idLocalPublic")
    , @NamedQuery(name = "Cadastro.findByAtivo", query = "SELECT c FROM Cadastro c WHERE c.ativo = :ativo")
    , @NamedQuery(name = "Cadastro.findByEspecial1", query = "SELECT c FROM Cadastro c WHERE c.especial1 = :especial1")
    , @NamedQuery(name = "Cadastro.findByEspecial2", query = "SELECT c FROM Cadastro c WHERE c.especial2 = :especial2")
    , @NamedQuery(name = "Cadastro.findByEspecial3", query = "SELECT c FROM Cadastro c WHERE c.especial3 = :especial3")
    , @NamedQuery(name = "Cadastro.findByEspecial4", query = "SELECT c FROM Cadastro c WHERE c.especial4 = :especial4")
    , @NamedQuery(name = "Cadastro.findByVagaespecial", query = "SELECT c FROM Cadastro c WHERE c.vagaespecial = :vagaespecial")
    , @NamedQuery(name = "Cadastro.findByLaudoMedico", query = "SELECT c FROM Cadastro c WHERE c.laudoMedico = :laudoMedico")
    , @NamedQuery(name = "Cadastro.findByImpComp1", query = "SELECT c FROM Cadastro c WHERE c.impComp1 = :impComp1")
    , @NamedQuery(name = "Cadastro.findByImpComp2", query = "SELECT c FROM Cadastro c WHERE c.impComp2 = :impComp2")
    , @NamedQuery(name = "Cadastro.findByIdModalidade", query = "SELECT c FROM Cadastro c WHERE c.idModalidade = :idModalidade")
    , @NamedQuery(name = "Cadastro.findBySalaprova2", query = "SELECT c FROM Cadastro c WHERE c.salaprova2 = :salaprova2")
    , @NamedQuery(name = "Cadastro.findByIdLocalProva", query = "SELECT c FROM Cadastro c WHERE c.idLocalProva = :idLocalProva")
    , @NamedQuery(name = "Cadastro.findByTempIdLocal", query = "SELECT c FROM Cadastro c WHERE c.tempIdLocal = :tempIdLocal")
    , @NamedQuery(name = "Cadastro.findByTempSalaprova", query = "SELECT c FROM Cadastro c WHERE c.tempSalaprova = :tempSalaprova")})
public class Cadastro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cadastro")
    private Integer idCadastro;
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
    @Column(name = "id_cargo1")
    private int idCargo1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cargo2")
    private int idCargo2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cargo3")
    private int idCargo3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_turno")
    private int idTurno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_candidato")
    private int idCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nboleto")
    private String nboleto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "identificacao")
    private String identificacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_idioma")
    private int idIdioma;
    @Column(name = "data_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    @Column(name = "isento")
    private Integer isento;
    @Column(name = "isento_tipo")
    private Integer isentoTipo;
    @Column(name = "pg")
    private Integer pg;
    @Column(name = "homologada")
    private Integer homologada;
    @Column(name = "id_local")
    private Integer idLocal;
    @Column(name = "salaprova")
    private Integer salaprova;
    @Column(name = "id_local_public")
    private Integer idLocalPublic;
    @Column(name = "ativo")
    private Integer ativo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "especial1")
    private int especial1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "especial2")
    private int especial2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "especial3")
    private String especial3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "especial4")
    private String especial4;
    @Column(name = "vagaespecial")
    private Integer vagaespecial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "laudo_medico")
    private int laudoMedico;
    @Size(max = 30)
    @Column(name = "imp_comp1")
    private String impComp1;
    @Size(max = 30)
    @Column(name = "imp_comp2")
    private String impComp2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_modalidade")
    private int idModalidade;
    @Column(name = "salaprova2")
    private Integer salaprova2;
    @Column(name = "id_local_prova")
    private Integer idLocalProva;
    @Column(name = "temp_id_local")
    private Integer tempIdLocal;
    @Column(name = "temp_salaprova")
    private Integer tempSalaprova;

    public Cadastro() {
    }

    public Cadastro(Integer idCadastro) {
        this.idCadastro = idCadastro;
    }

    public Cadastro(Integer idCadastro, int idCertame, int idArea, int idCargo1, int idCargo2, int idCargo3, int idTurno, int idCandidato, String nboleto, String identificacao, int idIdioma, int especial1, int especial2, String especial3, String especial4, int laudoMedico, int idModalidade) {
        this.idCadastro = idCadastro;
        this.idCertame = idCertame;
        this.idArea = idArea;
        this.idCargo1 = idCargo1;
        this.idCargo2 = idCargo2;
        this.idCargo3 = idCargo3;
        this.idTurno = idTurno;
        this.idCandidato = idCandidato;
        this.nboleto = nboleto;
        this.identificacao = identificacao;
        this.idIdioma = idIdioma;
        this.especial1 = especial1;
        this.especial2 = especial2;
        this.especial3 = especial3;
        this.especial4 = especial4;
        this.laudoMedico = laudoMedico;
        this.idModalidade = idModalidade;
    }

    public Integer getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(Integer idCadastro) {
        this.idCadastro = idCadastro;
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

    public int getIdCargo1() {
        return idCargo1;
    }

    public void setIdCargo1(int idCargo1) {
        this.idCargo1 = idCargo1;
    }

    public int getIdCargo2() {
        return idCargo2;
    }

    public void setIdCargo2(int idCargo2) {
        this.idCargo2 = idCargo2;
    }

    public int getIdCargo3() {
        return idCargo3;
    }

    public void setIdCargo3(int idCargo3) {
        this.idCargo3 = idCargo3;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNboleto() {
        return nboleto;
    }

    public void setNboleto(String nboleto) {
        this.nboleto = nboleto;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Integer getIsento() {
        return isento;
    }

    public void setIsento(Integer isento) {
        this.isento = isento;
    }

    public Integer getIsentoTipo() {
        return isentoTipo;
    }

    public void setIsentoTipo(Integer isentoTipo) {
        this.isentoTipo = isentoTipo;
    }

    public Integer getPg() {
        return pg;
    }

    public void setPg(Integer pg) {
        this.pg = pg;
    }

    public Integer getHomologada() {
        return homologada;
    }

    public void setHomologada(Integer homologada) {
        this.homologada = homologada;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getSalaprova() {
        return salaprova;
    }

    public void setSalaprova(Integer salaprova) {
        this.salaprova = salaprova;
    }

    public Integer getIdLocalPublic() {
        return idLocalPublic;
    }

    public void setIdLocalPublic(Integer idLocalPublic) {
        this.idLocalPublic = idLocalPublic;
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    public int getEspecial1() {
        return especial1;
    }

    public void setEspecial1(int especial1) {
        this.especial1 = especial1;
    }

    public int getEspecial2() {
        return especial2;
    }

    public void setEspecial2(int especial2) {
        this.especial2 = especial2;
    }

    public String getEspecial3() {
        return especial3;
    }

    public void setEspecial3(String especial3) {
        this.especial3 = especial3;
    }

    public String getEspecial4() {
        return especial4;
    }

    public void setEspecial4(String especial4) {
        this.especial4 = especial4;
    }

    public Integer getVagaespecial() {
        return vagaespecial;
    }

    public void setVagaespecial(Integer vagaespecial) {
        this.vagaespecial = vagaespecial;
    }

    public int getLaudoMedico() {
        return laudoMedico;
    }

    public void setLaudoMedico(int laudoMedico) {
        this.laudoMedico = laudoMedico;
    }

    public String getImpComp1() {
        return impComp1;
    }

    public void setImpComp1(String impComp1) {
        this.impComp1 = impComp1;
    }

    public String getImpComp2() {
        return impComp2;
    }

    public void setImpComp2(String impComp2) {
        this.impComp2 = impComp2;
    }

    public int getIdModalidade() {
        return idModalidade;
    }

    public void setIdModalidade(int idModalidade) {
        this.idModalidade = idModalidade;
    }

    public Integer getSalaprova2() {
        return salaprova2;
    }

    public void setSalaprova2(Integer salaprova2) {
        this.salaprova2 = salaprova2;
    }

    public Integer getIdLocalProva() {
        return idLocalProva;
    }

    public void setIdLocalProva(Integer idLocalProva) {
        this.idLocalProva = idLocalProva;
    }

    public Integer getTempIdLocal() {
        return tempIdLocal;
    }

    public void setTempIdLocal(Integer tempIdLocal) {
        this.tempIdLocal = tempIdLocal;
    }

    public Integer getTempSalaprova() {
        return tempSalaprova;
    }

    public void setTempSalaprova(Integer tempSalaprova) {
        this.tempSalaprova = tempSalaprova;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadastro != null ? idCadastro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastro)) {
            return false;
        }
        Cadastro other = (Cadastro) object;
        if ((this.idCadastro == null && other.idCadastro != null) || (this.idCadastro != null && !this.idCadastro.equals(other.idCadastro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Cadastro[ idCadastro=" + idCadastro + " ]";
    }
    
}

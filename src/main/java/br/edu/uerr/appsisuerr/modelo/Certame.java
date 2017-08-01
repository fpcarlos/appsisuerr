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
import javax.persistence.Lob;
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
@Table(name = "tb_certame")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Certame.findAll", query = "SELECT c FROM Certame c")
    , @NamedQuery(name = "Certame.findByIdCertame", query = "SELECT c FROM Certame c WHERE c.idCertame = :idCertame")
    , @NamedQuery(name = "Certame.findByNomeCertame", query = "SELECT c FROM Certame c WHERE c.nomeCertame = :nomeCertame")
    , @NamedQuery(name = "Certame.findByTipoCertame", query = "SELECT c FROM Certame c WHERE c.tipoCertame = :tipoCertame")
    , @NamedQuery(name = "Certame.findByEditalNome", query = "SELECT c FROM Certame c WHERE c.editalNome = :editalNome")
    , @NamedQuery(name = "Certame.findByIdEdital", query = "SELECT c FROM Certame c WHERE c.idEdital = :idEdital")
    , @NamedQuery(name = "Certame.findByEscolaridade", query = "SELECT c FROM Certame c WHERE c.escolaridade = :escolaridade")
    , @NamedQuery(name = "Certame.findByEntidadeNome", query = "SELECT c FROM Certame c WHERE c.entidadeNome = :entidadeNome")
    , @NamedQuery(name = "Certame.findByEntidadeSigla", query = "SELECT c FROM Certame c WHERE c.entidadeSigla = :entidadeSigla")
    , @NamedQuery(name = "Certame.findByDataCadastro", query = "SELECT c FROM Certame c WHERE c.dataCadastro = :dataCadastro")
    , @NamedQuery(name = "Certame.findByDataInicio", query = "SELECT c FROM Certame c WHERE c.dataInicio = :dataInicio")
    , @NamedQuery(name = "Certame.findByDataFim", query = "SELECT c FROM Certame c WHERE c.dataFim = :dataFim")
    , @NamedQuery(name = "Certame.findByHoraInicio", query = "SELECT c FROM Certame c WHERE c.horaInicio = :horaInicio")
    , @NamedQuery(name = "Certame.findByHoraFim", query = "SELECT c FROM Certame c WHERE c.horaFim = :horaFim")
    , @NamedQuery(name = "Certame.findByDataInicioIsencao", query = "SELECT c FROM Certame c WHERE c.dataInicioIsencao = :dataInicioIsencao")
    , @NamedQuery(name = "Certame.findByDataFimIsencao", query = "SELECT c FROM Certame c WHERE c.dataFimIsencao = :dataFimIsencao")
    , @NamedQuery(name = "Certame.findByPublicado", query = "SELECT c FROM Certame c WHERE c.publicado = :publicado")
    , @NamedQuery(name = "Certame.findByInscricao", query = "SELECT c FROM Certame c WHERE c.inscricao = :inscricao")
    , @NamedQuery(name = "Certame.findByInscricaoValor", query = "SELECT c FROM Certame c WHERE c.inscricaoValor = :inscricaoValor")
    , @NamedQuery(name = "Certame.findByVagas", query = "SELECT c FROM Certame c WHERE c.vagas = :vagas")
    , @NamedQuery(name = "Certame.findByVagasLocal", query = "SELECT c FROM Certame c WHERE c.vagasLocal = :vagasLocal")
    , @NamedQuery(name = "Certame.findByConcursoPublico", query = "SELECT c FROM Certame c WHERE c.concursoPublico = :concursoPublico")})
public class Certame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_certame")
    private Integer idCertame;
    @Size(max = 100)
    @Column(name = "nome_certame")
    private String nomeCertame;
    @Column(name = "tipo_certame")
    private Integer tipoCertame;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "edital")
    private String edital;
    @Size(max = 40)
    @Column(name = "edital_nome")
    private String editalNome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_edital")
    private int idEdital;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "escolaridade")
    private String escolaridade;
    @Size(max = 100)
    @Column(name = "entidade_nome")
    private String entidadeNome;
    @Size(max = 100)
    @Column(name = "entidade_sigla")
    private String entidadeSigla;
    @Column(name = "data_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_fim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_inicio")
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_fim")
    @Temporal(TemporalType.TIME)
    private Date horaFim;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_inicio_isencao")
    @Temporal(TemporalType.DATE)
    private Date dataInicioIsencao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_fim_isencao")
    @Temporal(TemporalType.DATE)
    private Date dataFimIsencao;
    @Column(name = "publicado")
    private Integer publicado;
    @Column(name = "inscricao")
    private Integer inscricao;
    @Size(max = 120)
    @Column(name = "inscricao_valor")
    private String inscricaoValor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vagas")
    private int vagas;
    @Size(max = 120)
    @Column(name = "vagas_local")
    private String vagasLocal;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "desc_certame")
    private String descCertame;
    @Size(max = 3)
    @Column(name = "concurso_publico")
    private String concursoPublico;

    public Certame() {
    }

    public Certame(Integer idCertame) {
        this.idCertame = idCertame;
    }

    public Certame(Integer idCertame, String edital, int idEdital, String escolaridade, Date dataInicio, Date dataFim, Date horaInicio, Date horaFim, Date dataInicioIsencao, Date dataFimIsencao, int vagas) {
        this.idCertame = idCertame;
        this.edital = edital;
        this.idEdital = idEdital;
        this.escolaridade = escolaridade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.dataInicioIsencao = dataInicioIsencao;
        this.dataFimIsencao = dataFimIsencao;
        this.vagas = vagas;
    }

    public Integer getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(Integer idCertame) {
        this.idCertame = idCertame;
    }

    public String getNomeCertame() {
        return nomeCertame;
    }

    public void setNomeCertame(String nomeCertame) {
        this.nomeCertame = nomeCertame;
    }

    public Integer getTipoCertame() {
        return tipoCertame;
    }

    public void setTipoCertame(Integer tipoCertame) {
        this.tipoCertame = tipoCertame;
    }

    public String getEdital() {
        return edital;
    }

    public void setEdital(String edital) {
        this.edital = edital;
    }

    public String getEditalNome() {
        return editalNome;
    }

    public void setEditalNome(String editalNome) {
        this.editalNome = editalNome;
    }

    public int getIdEdital() {
        return idEdital;
    }

    public void setIdEdital(int idEdital) {
        this.idEdital = idEdital;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEntidadeNome() {
        return entidadeNome;
    }

    public void setEntidadeNome(String entidadeNome) {
        this.entidadeNome = entidadeNome;
    }

    public String getEntidadeSigla() {
        return entidadeSigla;
    }

    public void setEntidadeSigla(String entidadeSigla) {
        this.entidadeSigla = entidadeSigla;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Date horaFim) {
        this.horaFim = horaFim;
    }

    public Date getDataInicioIsencao() {
        return dataInicioIsencao;
    }

    public void setDataInicioIsencao(Date dataInicioIsencao) {
        this.dataInicioIsencao = dataInicioIsencao;
    }

    public Date getDataFimIsencao() {
        return dataFimIsencao;
    }

    public void setDataFimIsencao(Date dataFimIsencao) {
        this.dataFimIsencao = dataFimIsencao;
    }

    public Integer getPublicado() {
        return publicado;
    }

    public void setPublicado(Integer publicado) {
        this.publicado = publicado;
    }

    public Integer getInscricao() {
        return inscricao;
    }

    public void setInscricao(Integer inscricao) {
        this.inscricao = inscricao;
    }

    public String getInscricaoValor() {
        return inscricaoValor;
    }

    public void setInscricaoValor(String inscricaoValor) {
        this.inscricaoValor = inscricaoValor;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public String getVagasLocal() {
        return vagasLocal;
    }

    public void setVagasLocal(String vagasLocal) {
        this.vagasLocal = vagasLocal;
    }

    public String getDescCertame() {
        return descCertame;
    }

    public void setDescCertame(String descCertame) {
        this.descCertame = descCertame;
    }

    public String getConcursoPublico() {
        return concursoPublico;
    }

    public void setConcursoPublico(String concursoPublico) {
        this.concursoPublico = concursoPublico;
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
        if (!(object instanceof Certame)) {
            return false;
        }
        Certame other = (Certame) object;
        if ((this.idCertame == null && other.idCertame != null) || (this.idCertame != null && !this.idCertame.equals(other.idCertame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Certame[ idCertame=" + idCertame + " ]";
    }
    
}

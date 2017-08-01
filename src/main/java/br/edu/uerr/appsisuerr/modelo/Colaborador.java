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
@Table(name = "tb_colaborador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colaborador.findAll", query = "SELECT c FROM Colaborador c")
    , @NamedQuery(name = "Colaborador.findById", query = "SELECT c FROM Colaborador c WHERE c.id = :id")
    , @NamedQuery(name = "Colaborador.findByIdCertame", query = "SELECT c FROM Colaborador c WHERE c.idCertame = :idCertame")
    , @NamedQuery(name = "Colaborador.findByNome", query = "SELECT c FROM Colaborador c WHERE c.nome = :nome")
    , @NamedQuery(name = "Colaborador.findByCpf", query = "SELECT c FROM Colaborador c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "Colaborador.findByRg", query = "SELECT c FROM Colaborador c WHERE c.rg = :rg")
    , @NamedQuery(name = "Colaborador.findByRguf", query = "SELECT c FROM Colaborador c WHERE c.rguf = :rguf")
    , @NamedQuery(name = "Colaborador.findByRgemissor", query = "SELECT c FROM Colaborador c WHERE c.rgemissor = :rgemissor")
    , @NamedQuery(name = "Colaborador.findByPispasep", query = "SELECT c FROM Colaborador c WHERE c.pispasep = :pispasep")
    , @NamedQuery(name = "Colaborador.findByEndereco", query = "SELECT c FROM Colaborador c WHERE c.endereco = :endereco")
    , @NamedQuery(name = "Colaborador.findByEndlogra", query = "SELECT c FROM Colaborador c WHERE c.endlogra = :endlogra")
    , @NamedQuery(name = "Colaborador.findByEndcep", query = "SELECT c FROM Colaborador c WHERE c.endcep = :endcep")
    , @NamedQuery(name = "Colaborador.findByBairro", query = "SELECT c FROM Colaborador c WHERE c.bairro = :bairro")
    , @NamedQuery(name = "Colaborador.findByCidade", query = "SELECT c FROM Colaborador c WHERE c.cidade = :cidade")
    , @NamedQuery(name = "Colaborador.findByUf", query = "SELECT c FROM Colaborador c WHERE c.uf = :uf")
    , @NamedQuery(name = "Colaborador.findByTelefone", query = "SELECT c FROM Colaborador c WHERE c.telefone = :telefone")
    , @NamedQuery(name = "Colaborador.findByCelular", query = "SELECT c FROM Colaborador c WHERE c.celular = :celular")
    , @NamedQuery(name = "Colaborador.findByIdFunc", query = "SELECT c FROM Colaborador c WHERE c.idFunc = :idFunc")
    , @NamedQuery(name = "Colaborador.findByCoeffunc", query = "SELECT c FROM Colaborador c WHERE c.coeffunc = :coeffunc")
    , @NamedQuery(name = "Colaborador.findByContabanco", query = "SELECT c FROM Colaborador c WHERE c.contabanco = :contabanco")
    , @NamedQuery(name = "Colaborador.findByAgenciabanco", query = "SELECT c FROM Colaborador c WHERE c.agenciabanco = :agenciabanco")
    , @NamedQuery(name = "Colaborador.findByBanco", query = "SELECT c FROM Colaborador c WHERE c.banco = :banco")
    , @NamedQuery(name = "Colaborador.findByIdLocal", query = "SELECT c FROM Colaborador c WHERE c.idLocal = :idLocal")
    , @NamedQuery(name = "Colaborador.findBySala", query = "SELECT c FROM Colaborador c WHERE c.sala = :sala")
    , @NamedQuery(name = "Colaborador.findByServidor", query = "SELECT c FROM Colaborador c WHERE c.servidor = :servidor")
    , @NamedQuery(name = "Colaborador.findByPresente", query = "SELECT c FROM Colaborador c WHERE c.presente = :presente")
    , @NamedQuery(name = "Colaborador.findByListagem", query = "SELECT c FROM Colaborador c WHERE c.listagem = :listagem")
    , @NamedQuery(name = "Colaborador.findByDatnas", query = "SELECT c FROM Colaborador c WHERE c.datnas = :datnas")
    , @NamedQuery(name = "Colaborador.findByEmail", query = "SELECT c FROM Colaborador c WHERE c.email = :email")
    , @NamedQuery(name = "Colaborador.findByLocalidade", query = "SELECT c FROM Colaborador c WHERE c.localidade = :localidade")
    , @NamedQuery(name = "Colaborador.findByExperiencia", query = "SELECT c FROM Colaborador c WHERE c.experiencia = :experiencia")
    , @NamedQuery(name = "Colaborador.findByProfissao", query = "SELECT c FROM Colaborador c WHERE c.profissao = :profissao")
    , @NamedQuery(name = "Colaborador.findByCadPor", query = "SELECT c FROM Colaborador c WHERE c.cadPor = :cadPor")
    , @NamedQuery(name = "Colaborador.findByEquivExam", query = "SELECT c FROM Colaborador c WHERE c.equivExam = :equivExam")
    , @NamedQuery(name = "Colaborador.findByTipoConta", query = "SELECT c FROM Colaborador c WHERE c.tipoConta = :tipoConta")})
public class Colaborador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;
    @Size(max = 14)
    @Column(name = "cpf")
    private String cpf;
    @Size(max = 30)
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "rguf")
    private String rguf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rgemissor")
    private int rgemissor;
    @Size(max = 50)
    @Column(name = "pispasep")
    private String pispasep;
    @Size(max = 200)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "endlogra")
    private String endlogra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "endcep")
    private String endcep;
    @Size(max = 30)
    @Column(name = "bairro")
    private String bairro;
    @Size(max = 30)
    @Column(name = "cidade")
    private String cidade;
    @Size(max = 4)
    @Column(name = "uf")
    private String uf;
    @Size(max = 30)
    @Column(name = "telefone")
    private String telefone;
    @Size(max = 30)
    @Column(name = "celular")
    private String celular;
    @Column(name = "id_func")
    private Integer idFunc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coeffunc")
    private int coeffunc;
    @Size(max = 30)
    @Column(name = "contabanco")
    private String contabanco;
    @Size(max = 30)
    @Column(name = "agenciabanco")
    private String agenciabanco;
    @Size(max = 30)
    @Column(name = "banco")
    private String banco;
    @Column(name = "id_local")
    private Integer idLocal;
    @Column(name = "sala")
    private Integer sala;
    @Basic(optional = false)
    @NotNull
    @Column(name = "servidor")
    private int servidor;
    @Column(name = "presente")
    private Integer presente;
    @Column(name = "listagem")
    private Integer listagem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "datnas")
    private String datnas;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 200)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "localidade")
    private String localidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "experiencia")
    private String experiencia;
    @Size(max = 255)
    @Column(name = "profissao")
    private String profissao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cad_por")
    private int cadPor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "equiv_exam")
    private int equivExam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_conta")
    private int tipoConta;
    @Lob
    @Size(max = 65535)
    @Column(name = "observacao")
    private String observacao;

    public Colaborador() {
    }

    public Colaborador(Integer id) {
        this.id = id;
    }

    public Colaborador(Integer id, int idCertame, String nome, String rguf, int rgemissor, String endlogra, String endcep, int coeffunc, int servidor, String datnas, String localidade, String experiencia, int cadPor, int equivExam, int tipoConta) {
        this.id = id;
        this.idCertame = idCertame;
        this.nome = nome;
        this.rguf = rguf;
        this.rgemissor = rgemissor;
        this.endlogra = endlogra;
        this.endcep = endcep;
        this.coeffunc = coeffunc;
        this.servidor = servidor;
        this.datnas = datnas;
        this.localidade = localidade;
        this.experiencia = experiencia;
        this.cadPor = cadPor;
        this.equivExam = equivExam;
        this.tipoConta = tipoConta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRguf() {
        return rguf;
    }

    public void setRguf(String rguf) {
        this.rguf = rguf;
    }

    public int getRgemissor() {
        return rgemissor;
    }

    public void setRgemissor(int rgemissor) {
        this.rgemissor = rgemissor;
    }

    public String getPispasep() {
        return pispasep;
    }

    public void setPispasep(String pispasep) {
        this.pispasep = pispasep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndlogra() {
        return endlogra;
    }

    public void setEndlogra(String endlogra) {
        this.endlogra = endlogra;
    }

    public String getEndcep() {
        return endcep;
    }

    public void setEndcep(String endcep) {
        this.endcep = endcep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Integer getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(Integer idFunc) {
        this.idFunc = idFunc;
    }

    public int getCoeffunc() {
        return coeffunc;
    }

    public void setCoeffunc(int coeffunc) {
        this.coeffunc = coeffunc;
    }

    public String getContabanco() {
        return contabanco;
    }

    public void setContabanco(String contabanco) {
        this.contabanco = contabanco;
    }

    public String getAgenciabanco() {
        return agenciabanco;
    }

    public void setAgenciabanco(String agenciabanco) {
        this.agenciabanco = agenciabanco;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public int getServidor() {
        return servidor;
    }

    public void setServidor(int servidor) {
        this.servidor = servidor;
    }

    public Integer getPresente() {
        return presente;
    }

    public void setPresente(Integer presente) {
        this.presente = presente;
    }

    public Integer getListagem() {
        return listagem;
    }

    public void setListagem(Integer listagem) {
        this.listagem = listagem;
    }

    public String getDatnas() {
        return datnas;
    }

    public void setDatnas(String datnas) {
        this.datnas = datnas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getCadPor() {
        return cadPor;
    }

    public void setCadPor(int cadPor) {
        this.cadPor = cadPor;
    }

    public int getEquivExam() {
        return equivExam;
    }

    public void setEquivExam(int equivExam) {
        this.equivExam = equivExam;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
        if (!(object instanceof Colaborador)) {
            return false;
        }
        Colaborador other = (Colaborador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Colaborador[ id=" + id + " ]";
    }
    
}

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
@Table(name = "tb_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.id = :id")
    , @NamedQuery(name = "Usuarios.findByNome", query = "SELECT u FROM Usuarios u WHERE u.nome = :nome")
    , @NamedQuery(name = "Usuarios.findByLogin", query = "SELECT u FROM Usuarios u WHERE u.login = :login")
    , @NamedQuery(name = "Usuarios.findBySessao", query = "SELECT u FROM Usuarios u WHERE u.sessao = :sessao")
    , @NamedQuery(name = "Usuarios.findBySenha", query = "SELECT u FROM Usuarios u WHERE u.senha = :senha")
    , @NamedQuery(name = "Usuarios.findByLogado", query = "SELECT u FROM Usuarios u WHERE u.logado = :logado")
    , @NamedQuery(name = "Usuarios.findByNivel", query = "SELECT u FROM Usuarios u WHERE u.nivel = :nivel")
    , @NamedQuery(name = "Usuarios.findByAtivo", query = "SELECT u FROM Usuarios u WHERE u.ativo = :ativo")
    , @NamedQuery(name = "Usuarios.findByTipo", query = "SELECT u FROM Usuarios u WHERE u.tipo = :tipo")
    , @NamedQuery(name = "Usuarios.findByRg", query = "SELECT u FROM Usuarios u WHERE u.rg = :rg")
    , @NamedQuery(name = "Usuarios.findByRgtipo", query = "SELECT u FROM Usuarios u WHERE u.rgtipo = :rgtipo")
    , @NamedQuery(name = "Usuarios.findByRguf", query = "SELECT u FROM Usuarios u WHERE u.rguf = :rguf")
    , @NamedQuery(name = "Usuarios.findByCpf", query = "SELECT u FROM Usuarios u WHERE u.cpf = :cpf")
    , @NamedQuery(name = "Usuarios.findBySexo", query = "SELECT u FROM Usuarios u WHERE u.sexo = :sexo")
    , @NamedQuery(name = "Usuarios.findByPai", query = "SELECT u FROM Usuarios u WHERE u.pai = :pai")
    , @NamedQuery(name = "Usuarios.findByMae", query = "SELECT u FROM Usuarios u WHERE u.mae = :mae")
    , @NamedQuery(name = "Usuarios.findByNascimento", query = "SELECT u FROM Usuarios u WHERE u.nascimento = :nascimento")
    , @NamedQuery(name = "Usuarios.findByEndnum", query = "SELECT u FROM Usuarios u WHERE u.endnum = :endnum")
    , @NamedQuery(name = "Usuarios.findByBairro", query = "SELECT u FROM Usuarios u WHERE u.bairro = :bairro")
    , @NamedQuery(name = "Usuarios.findByCidade", query = "SELECT u FROM Usuarios u WHERE u.cidade = :cidade")
    , @NamedQuery(name = "Usuarios.findByUf", query = "SELECT u FROM Usuarios u WHERE u.uf = :uf")
    , @NamedQuery(name = "Usuarios.findByTelFixo", query = "SELECT u FROM Usuarios u WHERE u.telFixo = :telFixo")
    , @NamedQuery(name = "Usuarios.findByTelCelular", query = "SELECT u FROM Usuarios u WHERE u.telCelular = :telCelular")
    , @NamedQuery(name = "Usuarios.findByTelComerc", query = "SELECT u FROM Usuarios u WHERE u.telComerc = :telComerc")
    , @NamedQuery(name = "Usuarios.findByEmail", query = "SELECT u FROM Usuarios u WHERE u.email = :email")
    , @NamedQuery(name = "Usuarios.findByDatacad", query = "SELECT u FROM Usuarios u WHERE u.datacad = :datacad")
    , @NamedQuery(name = "Usuarios.findByMarca", query = "SELECT u FROM Usuarios u WHERE u.marca = :marca")
    , @NamedQuery(name = "Usuarios.findByIdFunc", query = "SELECT u FROM Usuarios u WHERE u.idFunc = :idFunc")
    , @NamedQuery(name = "Usuarios.findByIdFuncao", query = "SELECT u FROM Usuarios u WHERE u.idFuncao = :idFuncao")
    , @NamedQuery(name = "Usuarios.findByCargo", query = "SELECT u FROM Usuarios u WHERE u.cargo = :cargo")
    , @NamedQuery(name = "Usuarios.findByCadPor", query = "SELECT u FROM Usuarios u WHERE u.cadPor = :cadPor")
    , @NamedQuery(name = "Usuarios.findByDataAlt", query = "SELECT u FROM Usuarios u WHERE u.dataAlt = :dataAlt")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "login")
    private String login;
    @Size(max = 32)
    @Column(name = "sessao")
    private String sessao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "senha")
    private String senha;
    @Column(name = "logado")
    private Integer logado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nivel")
    private int nivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ativo")
    private int ativo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 40)
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "rgtipo")
    private String rgtipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "rguf")
    private String rguf;
    @Size(max = 14)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "sexo")
    private String sexo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "pai")
    private String pai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "mae")
    private String mae;
    @Column(name = "nascimento")
    @Temporal(TemporalType.DATE)
    private Date nascimento;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "end")
    private String end;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "endnum")
    private String endnum;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "endcomp")
    private String endcomp;
    @Size(max = 40)
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private Integer cidade;
    @Column(name = "uf")
    private Integer uf;
    @Size(max = 40)
    @Column(name = "tel_fixo")
    private String telFixo;
    @Size(max = 40)
    @Column(name = "tel_celular")
    private String telCelular;
    @Size(max = 40)
    @Column(name = "tel_comerc")
    private String telComerc;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 225)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datacad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacad;
    @Column(name = "marca")
    private Integer marca;
    @Size(max = 10)
    @Column(name = "id_func")
    private String idFunc;
    @Column(name = "id_funcao")
    private Integer idFuncao;
    @Size(max = 25)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 255)
    @Column(name = "cad_por")
    private String cadPor;
    @Lob
    @Size(max = 65535)
    @Column(name = "comentarios")
    private String comentarios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_alt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlt;

    public Usuarios() {
    }

    public Usuarios(Integer id) {
        this.id = id;
    }

    public Usuarios(Integer id, String login, String senha, int nivel, int ativo, String tipo, String rgtipo, String rguf, String sexo, String pai, String mae, String endnum, String endcomp, Date datacad, Date dataAlt) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
        this.ativo = ativo;
        this.tipo = tipo;
        this.rgtipo = rgtipo;
        this.rguf = rguf;
        this.sexo = sexo;
        this.pai = pai;
        this.mae = mae;
        this.endnum = endnum;
        this.endcomp = endcomp;
        this.datacad = datacad;
        this.dataAlt = dataAlt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getLogado() {
        return logado;
    }

    public void setLogado(Integer logado) {
        this.logado = logado;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgtipo() {
        return rgtipo;
    }

    public void setRgtipo(String rgtipo) {
        this.rgtipo = rgtipo;
    }

    public String getRguf() {
        return rguf;
    }

    public void setRguf(String rguf) {
        this.rguf = rguf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEndnum() {
        return endnum;
    }

    public void setEndnum(String endnum) {
        this.endnum = endnum;
    }

    public String getEndcomp() {
        return endcomp;
    }

    public void setEndcomp(String endcomp) {
        this.endcomp = endcomp;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getCidade() {
        return cidade;
    }

    public void setCidade(Integer cidade) {
        this.cidade = cidade;
    }

    public Integer getUf() {
        return uf;
    }

    public void setUf(Integer uf) {
        this.uf = uf;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getTelComerc() {
        return telComerc;
    }

    public void setTelComerc(String telComerc) {
        this.telComerc = telComerc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatacad() {
        return datacad;
    }

    public void setDatacad(Date datacad) {
        this.datacad = datacad;
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }

    public String getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(String idFunc) {
        this.idFunc = idFunc;
    }

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(Integer idFuncao) {
        this.idFuncao = idFuncao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCadPor() {
        return cadPor;
    }

    public void setCadPor(String cadPor) {
        this.cadPor = cadPor;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getDataAlt() {
        return dataAlt;
    }

    public void setDataAlt(Date dataAlt) {
        this.dataAlt = dataAlt;
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
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Usuarios[ id=" + id + " ]";
    }
    
}

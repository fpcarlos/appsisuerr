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
@Table(name = "tb_candidato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidato.findAll", query = "SELECT c FROM Candidato c")
    , @NamedQuery(name = "Candidato.findByIdCandidato", query = "SELECT c FROM Candidato c WHERE c.idCandidato = :idCandidato")
    , @NamedQuery(name = "Candidato.findByNomeCandidato", query = "SELECT c FROM Candidato c WHERE c.nomeCandidato = :nomeCandidato")
    , @NamedQuery(name = "Candidato.findBySexoCandidato", query = "SELECT c FROM Candidato c WHERE c.sexoCandidato = :sexoCandidato")
    , @NamedQuery(name = "Candidato.findByLogin", query = "SELECT c FROM Candidato c WHERE c.login = :login")
    , @NamedQuery(name = "Candidato.findBySenhaCandidato", query = "SELECT c FROM Candidato c WHERE c.senhaCandidato = :senhaCandidato")
    , @NamedQuery(name = "Candidato.findByRgCandidato", query = "SELECT c FROM Candidato c WHERE c.rgCandidato = :rgCandidato")
    , @NamedQuery(name = "Candidato.findByRgtipoCandidato", query = "SELECT c FROM Candidato c WHERE c.rgtipoCandidato = :rgtipoCandidato")
    , @NamedQuery(name = "Candidato.findByRgufCandidato", query = "SELECT c FROM Candidato c WHERE c.rgufCandidato = :rgufCandidato")
    , @NamedQuery(name = "Candidato.findByRgemissorCandidato", query = "SELECT c FROM Candidato c WHERE c.rgemissorCandidato = :rgemissorCandidato")
    , @NamedQuery(name = "Candidato.findByCpfCandidato", query = "SELECT c FROM Candidato c WHERE c.cpfCandidato = :cpfCandidato")
    , @NamedQuery(name = "Candidato.findByPaiCandidato", query = "SELECT c FROM Candidato c WHERE c.paiCandidato = :paiCandidato")
    , @NamedQuery(name = "Candidato.findByMaeCandidato", query = "SELECT c FROM Candidato c WHERE c.maeCandidato = :maeCandidato")
    , @NamedQuery(name = "Candidato.findByEscolaCandidato", query = "SELECT c FROM Candidato c WHERE c.escolaCandidato = :escolaCandidato")
    , @NamedQuery(name = "Candidato.findByDatnasCandidato", query = "SELECT c FROM Candidato c WHERE c.datnasCandidato = :datnasCandidato")
    , @NamedQuery(name = "Candidato.findByEndcepCandidato", query = "SELECT c FROM Candidato c WHERE c.endcepCandidato = :endcepCandidato")
    , @NamedQuery(name = "Candidato.findByEndlograCandidato", query = "SELECT c FROM Candidato c WHERE c.endlograCandidato = :endlograCandidato")
    , @NamedQuery(name = "Candidato.findByEndCandidato", query = "SELECT c FROM Candidato c WHERE c.endCandidato = :endCandidato")
    , @NamedQuery(name = "Candidato.findByEndnumCandidato", query = "SELECT c FROM Candidato c WHERE c.endnumCandidato = :endnumCandidato")
    , @NamedQuery(name = "Candidato.findByBairroCandidato", query = "SELECT c FROM Candidato c WHERE c.bairroCandidato = :bairroCandidato")
    , @NamedQuery(name = "Candidato.findByCidadeCandidato", query = "SELECT c FROM Candidato c WHERE c.cidadeCandidato = :cidadeCandidato")
    , @NamedQuery(name = "Candidato.findByCidadeCandidato2", query = "SELECT c FROM Candidato c WHERE c.cidadeCandidato2 = :cidadeCandidato2")
    , @NamedQuery(name = "Candidato.findByUfCandidato", query = "SELECT c FROM Candidato c WHERE c.ufCandidato = :ufCandidato")
    , @NamedQuery(name = "Candidato.findByTel1Candidato", query = "SELECT c FROM Candidato c WHERE c.tel1Candidato = :tel1Candidato")
    , @NamedQuery(name = "Candidato.findByTel2Candidato", query = "SELECT c FROM Candidato c WHERE c.tel2Candidato = :tel2Candidato")
    , @NamedQuery(name = "Candidato.findByTel3Candidato", query = "SELECT c FROM Candidato c WHERE c.tel3Candidato = :tel3Candidato")
    , @NamedQuery(name = "Candidato.findByEmailCandidato", query = "SELECT c FROM Candidato c WHERE c.emailCandidato = :emailCandidato")
    , @NamedQuery(name = "Candidato.findByDatacadCandidato", query = "SELECT c FROM Candidato c WHERE c.datacadCandidato = :datacadCandidato")
    , @NamedQuery(name = "Candidato.findByHoracadCandidato", query = "SELECT c FROM Candidato c WHERE c.horacadCandidato = :horacadCandidato")
    , @NamedQuery(name = "Candidato.findByDataaltCandidato", query = "SELECT c FROM Candidato c WHERE c.dataaltCandidato = :dataaltCandidato")
    , @NamedQuery(name = "Candidato.findByHoraaltCandidato", query = "SELECT c FROM Candidato c WHERE c.horaaltCandidato = :horaaltCandidato")
    , @NamedQuery(name = "Candidato.findByMarcaCandidato", query = "SELECT c FROM Candidato c WHERE c.marcaCandidato = :marcaCandidato")
    , @NamedQuery(name = "Candidato.findByEspecialCandidato", query = "SELECT c FROM Candidato c WHERE c.especialCandidato = :especialCandidato")
    , @NamedQuery(name = "Candidato.findByEspecialobsCandidato", query = "SELECT c FROM Candidato c WHERE c.especialobsCandidato = :especialobsCandidato")
    , @NamedQuery(name = "Candidato.findByLogCandidato", query = "SELECT c FROM Candidato c WHERE c.logCandidato = :logCandidato")})
public class Candidato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_candidato")
    private Integer idCandidato;
    @Size(max = 100)
    @Column(name = "nome_candidato")
    private String nomeCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "sexo_candidato")
    private String sexoCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "senha_candidato")
    private String senhaCandidato;
    @Size(max = 40)
    @Column(name = "rg_candidato")
    private String rgCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "rgtipo_candidato")
    private String rgtipoCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "rguf_candidato")
    private String rgufCandidato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rgemissor_candidato")
    private int rgemissorCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "cpf_candidato")
    private String cpfCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "pai_candidato")
    private String paiCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "mae_candidato")
    private String maeCandidato;
    @Column(name = "escola_candidato")
    private Integer escolaCandidato;
    @Column(name = "datnas_candidato")
    @Temporal(TemporalType.DATE)
    private Date datnasCandidato;
    @Size(max = 9)
    @Column(name = "endcep_candidato")
    private String endcepCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "endlogra_candidato")
    private String endlograCandidato;
    @Size(max = 100)
    @Column(name = "end_candidato")
    private String endCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "endnum_candidato")
    private String endnumCandidato;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "endcomp_candidato")
    private String endcompCandidato;
    @Size(max = 40)
    @Column(name = "bairro_candidato")
    private String bairroCandidato;
    @Size(max = 40)
    @Column(name = "cidade_candidato")
    private String cidadeCandidato;
    @Size(max = 30)
    @Column(name = "cidade_candidato2")
    private String cidadeCandidato2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uf_candidato")
    private int ufCandidato;
    @Size(max = 40)
    @Column(name = "tel1_candidato")
    private String tel1Candidato;
    @Size(max = 40)
    @Column(name = "tel2_candidato")
    private String tel2Candidato;
    @Size(max = 40)
    @Column(name = "tel3_candidato")
    private String tel3Candidato;
    @Size(max = 225)
    @Column(name = "email_candidato")
    private String emailCandidato;
    @Column(name = "datacad_candidato")
    @Temporal(TemporalType.DATE)
    private Date datacadCandidato;
    @Size(max = 80)
    @Column(name = "horacad_candidato")
    private String horacadCandidato;
    @Column(name = "dataalt_candidato")
    @Temporal(TemporalType.DATE)
    private Date dataaltCandidato;
    @Size(max = 80)
    @Column(name = "horaalt_candidato")
    private String horaaltCandidato;
    @Column(name = "marca_candidato")
    private Integer marcaCandidato;
    @Size(max = 100)
    @Column(name = "especial_candidato")
    private String especialCandidato;
    @Size(max = 200)
    @Column(name = "especialobs_candidato")
    private String especialobsCandidato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "log_candidato")
    private int logCandidato;

    public Candidato() {
    }

    public Candidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

    public Candidato(Integer idCandidato, String sexoCandidato, String login, String senhaCandidato, String rgtipoCandidato, String rgufCandidato, int rgemissorCandidato, String cpfCandidato, String paiCandidato, String maeCandidato, String endlograCandidato, String endnumCandidato, String endcompCandidato, int ufCandidato, int logCandidato) {
        this.idCandidato = idCandidato;
        this.sexoCandidato = sexoCandidato;
        this.login = login;
        this.senhaCandidato = senhaCandidato;
        this.rgtipoCandidato = rgtipoCandidato;
        this.rgufCandidato = rgufCandidato;
        this.rgemissorCandidato = rgemissorCandidato;
        this.cpfCandidato = cpfCandidato;
        this.paiCandidato = paiCandidato;
        this.maeCandidato = maeCandidato;
        this.endlograCandidato = endlograCandidato;
        this.endnumCandidato = endnumCandidato;
        this.endcompCandidato = endcompCandidato;
        this.ufCandidato = ufCandidato;
        this.logCandidato = logCandidato;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getSexoCandidato() {
        return sexoCandidato;
    }

    public void setSexoCandidato(String sexoCandidato) {
        this.sexoCandidato = sexoCandidato;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenhaCandidato() {
        return senhaCandidato;
    }

    public void setSenhaCandidato(String senhaCandidato) {
        this.senhaCandidato = senhaCandidato;
    }

    public String getRgCandidato() {
        return rgCandidato;
    }

    public void setRgCandidato(String rgCandidato) {
        this.rgCandidato = rgCandidato;
    }

    public String getRgtipoCandidato() {
        return rgtipoCandidato;
    }

    public void setRgtipoCandidato(String rgtipoCandidato) {
        this.rgtipoCandidato = rgtipoCandidato;
    }

    public String getRgufCandidato() {
        return rgufCandidato;
    }

    public void setRgufCandidato(String rgufCandidato) {
        this.rgufCandidato = rgufCandidato;
    }

    public int getRgemissorCandidato() {
        return rgemissorCandidato;
    }

    public void setRgemissorCandidato(int rgemissorCandidato) {
        this.rgemissorCandidato = rgemissorCandidato;
    }

    public String getCpfCandidato() {
        return cpfCandidato;
    }

    public void setCpfCandidato(String cpfCandidato) {
        this.cpfCandidato = cpfCandidato;
    }

    public String getPaiCandidato() {
        return paiCandidato;
    }

    public void setPaiCandidato(String paiCandidato) {
        this.paiCandidato = paiCandidato;
    }

    public String getMaeCandidato() {
        return maeCandidato;
    }

    public void setMaeCandidato(String maeCandidato) {
        this.maeCandidato = maeCandidato;
    }

    public Integer getEscolaCandidato() {
        return escolaCandidato;
    }

    public void setEscolaCandidato(Integer escolaCandidato) {
        this.escolaCandidato = escolaCandidato;
    }

    public Date getDatnasCandidato() {
        return datnasCandidato;
    }

    public void setDatnasCandidato(Date datnasCandidato) {
        this.datnasCandidato = datnasCandidato;
    }

    public String getEndcepCandidato() {
        return endcepCandidato;
    }

    public void setEndcepCandidato(String endcepCandidato) {
        this.endcepCandidato = endcepCandidato;
    }

    public String getEndlograCandidato() {
        return endlograCandidato;
    }

    public void setEndlograCandidato(String endlograCandidato) {
        this.endlograCandidato = endlograCandidato;
    }

    public String getEndCandidato() {
        return endCandidato;
    }

    public void setEndCandidato(String endCandidato) {
        this.endCandidato = endCandidato;
    }

    public String getEndnumCandidato() {
        return endnumCandidato;
    }

    public void setEndnumCandidato(String endnumCandidato) {
        this.endnumCandidato = endnumCandidato;
    }

    public String getEndcompCandidato() {
        return endcompCandidato;
    }

    public void setEndcompCandidato(String endcompCandidato) {
        this.endcompCandidato = endcompCandidato;
    }

    public String getBairroCandidato() {
        return bairroCandidato;
    }

    public void setBairroCandidato(String bairroCandidato) {
        this.bairroCandidato = bairroCandidato;
    }

    public String getCidadeCandidato() {
        return cidadeCandidato;
    }

    public void setCidadeCandidato(String cidadeCandidato) {
        this.cidadeCandidato = cidadeCandidato;
    }

    public String getCidadeCandidato2() {
        return cidadeCandidato2;
    }

    public void setCidadeCandidato2(String cidadeCandidato2) {
        this.cidadeCandidato2 = cidadeCandidato2;
    }

    public int getUfCandidato() {
        return ufCandidato;
    }

    public void setUfCandidato(int ufCandidato) {
        this.ufCandidato = ufCandidato;
    }

    public String getTel1Candidato() {
        return tel1Candidato;
    }

    public void setTel1Candidato(String tel1Candidato) {
        this.tel1Candidato = tel1Candidato;
    }

    public String getTel2Candidato() {
        return tel2Candidato;
    }

    public void setTel2Candidato(String tel2Candidato) {
        this.tel2Candidato = tel2Candidato;
    }

    public String getTel3Candidato() {
        return tel3Candidato;
    }

    public void setTel3Candidato(String tel3Candidato) {
        this.tel3Candidato = tel3Candidato;
    }

    public String getEmailCandidato() {
        return emailCandidato;
    }

    public void setEmailCandidato(String emailCandidato) {
        this.emailCandidato = emailCandidato;
    }

    public Date getDatacadCandidato() {
        return datacadCandidato;
    }

    public void setDatacadCandidato(Date datacadCandidato) {
        this.datacadCandidato = datacadCandidato;
    }

    public String getHoracadCandidato() {
        return horacadCandidato;
    }

    public void setHoracadCandidato(String horacadCandidato) {
        this.horacadCandidato = horacadCandidato;
    }

    public Date getDataaltCandidato() {
        return dataaltCandidato;
    }

    public void setDataaltCandidato(Date dataaltCandidato) {
        this.dataaltCandidato = dataaltCandidato;
    }

    public String getHoraaltCandidato() {
        return horaaltCandidato;
    }

    public void setHoraaltCandidato(String horaaltCandidato) {
        this.horaaltCandidato = horaaltCandidato;
    }

    public Integer getMarcaCandidato() {
        return marcaCandidato;
    }

    public void setMarcaCandidato(Integer marcaCandidato) {
        this.marcaCandidato = marcaCandidato;
    }

    public String getEspecialCandidato() {
        return especialCandidato;
    }

    public void setEspecialCandidato(String especialCandidato) {
        this.especialCandidato = especialCandidato;
    }

    public String getEspecialobsCandidato() {
        return especialobsCandidato;
    }

    public void setEspecialobsCandidato(String especialobsCandidato) {
        this.especialobsCandidato = especialobsCandidato;
    }

    public int getLogCandidato() {
        return logCandidato;
    }

    public void setLogCandidato(int logCandidato) {
        this.logCandidato = logCandidato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCandidato != null ? idCandidato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidato)) {
            return false;
        }
        Candidato other = (Candidato) object;
        if ((this.idCandidato == null && other.idCandidato != null) || (this.idCandidato != null && !this.idCandidato.equals(other.idCandidato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Candidato[ idCandidato=" + idCandidato + " ]";
    }
    
}

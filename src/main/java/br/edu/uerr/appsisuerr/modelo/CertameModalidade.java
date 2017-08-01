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
@Table(name = "tb_certame_modalidade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CertameModalidade.findAll", query = "SELECT c FROM CertameModalidade c")
    , @NamedQuery(name = "CertameModalidade.findById", query = "SELECT c FROM CertameModalidade c WHERE c.id = :id")
    , @NamedQuery(name = "CertameModalidade.findByIdCertame", query = "SELECT c FROM CertameModalidade c WHERE c.idCertame = :idCertame")
    , @NamedQuery(name = "CertameModalidade.findByIdModalidade", query = "SELECT c FROM CertameModalidade c WHERE c.idModalidade = :idModalidade")
    , @NamedQuery(name = "CertameModalidade.findByValor", query = "SELECT c FROM CertameModalidade c WHERE c.valor = :valor")})
public class CertameModalidade implements Serializable {

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
    @Column(name = "id_modalidade")
    private int idModalidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "valor")
    private String valor;

    public CertameModalidade() {
    }

    public CertameModalidade(Integer id) {
        this.id = id;
    }

    public CertameModalidade(Integer id, int idCertame, int idModalidade, String valor) {
        this.id = id;
        this.idCertame = idCertame;
        this.idModalidade = idModalidade;
        this.valor = valor;
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

    public int getIdModalidade() {
        return idModalidade;
    }

    public void setIdModalidade(int idModalidade) {
        this.idModalidade = idModalidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
        if (!(object instanceof CertameModalidade)) {
            return false;
        }
        CertameModalidade other = (CertameModalidade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.CertameModalidade[ id=" + id + " ]";
    }
    
}

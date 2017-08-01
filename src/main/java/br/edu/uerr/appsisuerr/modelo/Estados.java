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
@Table(name = "tb_estados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estados.findAll", query = "SELECT e FROM Estados e")
    , @NamedQuery(name = "Estados.findById", query = "SELECT e FROM Estados e WHERE e.id = :id")
    , @NamedQuery(name = "Estados.findByUf", query = "SELECT e FROM Estados e WHERE e.uf = :uf")
    , @NamedQuery(name = "Estados.findByNome", query = "SELECT e FROM Estados e WHERE e.nome = :nome")
    , @NamedQuery(name = "Estados.findByCepi", query = "SELECT e FROM Estados e WHERE e.cepi = :cepi")
    , @NamedQuery(name = "Estados.findByCepf", query = "SELECT e FROM Estados e WHERE e.cepf = :cepf")})
public class Estados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nome")
    private String nome;
    @Size(max = 8)
    @Column(name = "cepi")
    private String cepi;
    @Size(max = 8)
    @Column(name = "cepf")
    private String cepf;

    public Estados() {
    }

    public Estados(Integer id) {
        this.id = id;
    }

    public Estados(Integer id, String uf, String nome) {
        this.id = id;
        this.uf = uf;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCepi() {
        return cepi;
    }

    public void setCepi(String cepi) {
        this.cepi = cepi;
    }

    public String getCepf() {
        return cepf;
    }

    public void setCepf(String cepf) {
        this.cepf = cepf;
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
        if (!(object instanceof Estados)) {
            return false;
        }
        Estados other = (Estados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Estados[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appsisuerr.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "tb_funcao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcao.findAll", query = "SELECT f FROM Funcao f")
    , @NamedQuery(name = "Funcao.findByIdFunc", query = "SELECT f FROM Funcao f WHERE f.idFunc = :idFunc")
    , @NamedQuery(name = "Funcao.findByNomeFunc", query = "SELECT f FROM Funcao f WHERE f.nomeFunc = :nomeFunc")
    , @NamedQuery(name = "Funcao.findByValorbase", query = "SELECT f FROM Funcao f WHERE f.valorbase = :valorbase")
    , @NamedQuery(name = "Funcao.findByDescFunc", query = "SELECT f FROM Funcao f WHERE f.descFunc = :descFunc")})
public class Funcao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_func")
    private Integer idFunc;
    @Size(max = 200)
    @Column(name = "nome_func")
    private String nomeFunc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorbase")
    private BigDecimal valorbase;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "desc_func")
    private String descFunc;

    public Funcao() {
    }

    public Funcao(Integer idFunc) {
        this.idFunc = idFunc;
    }

    public Funcao(Integer idFunc, String descFunc) {
        this.idFunc = idFunc;
        this.descFunc = descFunc;
    }

    public Integer getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(Integer idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public BigDecimal getValorbase() {
        return valorbase;
    }

    public void setValorbase(BigDecimal valorbase) {
        this.valorbase = valorbase;
    }

    public String getDescFunc() {
        return descFunc;
    }

    public void setDescFunc(String descFunc) {
        this.descFunc = descFunc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFunc != null ? idFunc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcao)) {
            return false;
        }
        Funcao other = (Funcao) object;
        if ((this.idFunc == null && other.idFunc != null) || (this.idFunc != null && !this.idFunc.equals(other.idFunc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Funcao[ idFunc=" + idFunc + " ]";
    }
    
}

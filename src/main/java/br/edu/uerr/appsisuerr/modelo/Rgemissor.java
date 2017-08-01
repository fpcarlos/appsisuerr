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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "tb_rgemissor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rgemissor.findAll", query = "SELECT r FROM Rgemissor r")
    , @NamedQuery(name = "Rgemissor.findById", query = "SELECT r FROM Rgemissor r WHERE r.id = :id")
    , @NamedQuery(name = "Rgemissor.findByRgemissor", query = "SELECT r FROM Rgemissor r WHERE r.rgemissor = :rgemissor")})
public class Rgemissor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "rgemissor")
    private String rgemissor;

    public Rgemissor() {
    }

    public Rgemissor(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRgemissor() {
        return rgemissor;
    }

    public void setRgemissor(String rgemissor) {
        this.rgemissor = rgemissor;
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
        if (!(object instanceof Rgemissor)) {
            return false;
        }
        Rgemissor other = (Rgemissor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appsisuerr.modelo.Rgemissor[ id=" + id + " ]";
    }
    
}

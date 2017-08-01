/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appsisuerr.visao;

import br.edu.uerr.appsisuerr.controle.CertameControle;
import br.edu.uerr.appsisuerr.modelo.Certame;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author fpcarlos
 */
@Named
@SessionScoped
public class InicioVisao extends AbstractVisao implements Serializable{
    
    @EJB
    private CertameControle certameControle;
    
    private Certame certame;
    
    private List<Certame> listCertameAtivo = new ArrayList<>();
    private List<Certame> listCertameInativo = new ArrayList<>();
    
    public InicioVisao(){
        super();
    }
    
    public String abreListaCertame(){
        try {
            listCertameAtivo = new ArrayList<>();
            listCertameAtivo = certameControle.findAllAtivos();
            listCertameInativo = new ArrayList<>();
            listCertameInativo = certameControle.findAllInativos();
            return redirect("/publico/listaCertames.xhtml");
        } catch (Exception e) {
            return null;
        }
    }
    
    //Gets e Sets
    public Certame getCertame() {
        return certame;
    }

    public void setCertame(Certame certame) {
        this.certame = certame;
    }

    public List<Certame> getListCertameAtivo() {
        return listCertameAtivo;
    }

    public void setListCertameAtivo(List<Certame> listCertameAtivo) {
        this.listCertameAtivo = listCertameAtivo;
    }

    public List<Certame> getListCertameInativo() {
        return listCertameInativo;
    }

    public void setListCertameInativo(List<Certame> listCertameInativo) {
        this.listCertameInativo = listCertameInativo;
    }

    
}

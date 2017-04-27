/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.entity;

import javax.persistence.Embeddable;

/**
 *
 * @author formation
 */
@Embeddable
public class Adresse {
    
    private String rue;
    private String lacoalite;
    private String pays;
    private Long postale;

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getLacoalite() {
        return lacoalite;
    }

    public void setLacoalite(String lacoalite) {
        this.lacoalite = lacoalite;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Long getPostale() {
        return postale;
    }

    public void setPostale(Long postale) {
        this.postale = postale;
    }
    
    
}

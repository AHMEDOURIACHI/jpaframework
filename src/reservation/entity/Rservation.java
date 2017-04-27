/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author formation
 */
@Entity
public class Rservation implements Serializable {
    
    
    public enum Etatreservation{
        
        NON_VALIDE,
        VALIDE,
        TERMINE,
        ANULE
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
   
    
    @Temporal(TemporalType.DATE)
    private Date datedebut;
    @Temporal(TemporalType.DATE)
    private Date datefin;
    @Temporal(TemporalType.DATE)
    private Date dateheurereservation;
    @Enumerated(EnumType.STRING)
    private Etatreservation etat;
    
    @ManyToOne
    @JoinColumn(name="reservation_id")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name = "cambre_id")
    private Chambre chambre;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Rservation)) {
            return false;
        }
        Rservation other = (Rservation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "reservation.entity.Rservation[ id=" + id + " ]";
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public Date getDateheurereservation() {
        return dateheurereservation;
    }

    public void setDateheurereservation(Date dateheurereservation) {
        this.dateheurereservation = dateheurereservation;
    }

    public Etatreservation getEtat() {
        return etat;
    }

    public void setEtat(Etatreservation etat) {
        this.etat = etat;
    }

    
    
    
}

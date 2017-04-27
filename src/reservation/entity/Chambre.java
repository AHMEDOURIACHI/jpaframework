
package reservation.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author formation
 */
@Entity
@Table(name="romm")
public class Chambre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
     @Column(nullable = false,length = 32)
     private String nom; 
    
    @Column(length = 1485)
    private String description;
    @Column(nullable = false,name = "KAPLANPRICE")
    private Double prix;
    @ManyToOne
  
    @JoinColumn(name="hotel_id")
    private Hotel hotel;
    
    @OneToMany(mappedBy = "chambre")
    private  Set<Rservation> reservations = new HashSet<>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    
    
   
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
     public Long getid() {
        return id;
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
        if (!(object instanceof Chambre)) {
            return false;
        }
        Chambre other = (Chambre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "reservation.entity.Chambre[ id=" + id + " ]";
    }
    
}





import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manue
 */
@Entity
public class vehicule implements Serializable {

    private boolean disponibilite;

    /**
     * Get the value of disponibilite
     *
     * @return the value of disponibilite
     */
    public boolean isDisponibilite() {
        return disponibilite;
    }

    /**
     * Set the value of disponibilite
     *
     * @param disponibilite new value of disponibilite
     */
    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
        if (!(object instanceof vehicule)) {
            return false;
        }
        vehicule other = (vehicule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vehicule[ id=" + id + " ]";
    }
    
}

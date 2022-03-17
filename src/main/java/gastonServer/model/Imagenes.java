
package gastonServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imagenes {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String portada;
    private String perfil;

    public Imagenes() {
    }

    
    
    
    public Imagenes(Long id, String portada, String perfil) {
        this.id = id;
        this.portada = portada;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }

    public String getPortada() {
        return portada;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
  
    
    
    
}


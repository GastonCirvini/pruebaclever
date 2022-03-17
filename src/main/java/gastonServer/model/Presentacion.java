
package gastonServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Presentacion {
   @Id
   @GeneratedValue (strategy = GenerationType.AUTO)
 private Long Id;
 private String nombreytitulo;
 private String nacimiento;
 private String edad;
 private String estudios;
 private String email;

 //Constructor
    public Presentacion() {
    }

    public Presentacion(Long Id, String nombreytitulo, String nacimiento, String edad, String estudios, String email) {
        this.Id = Id;
        this.nombreytitulo = nombreytitulo;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.estudios = estudios;
        this.email = email;
    }
//Getter
    public Long getId() {
        return Id;
    }

    public String getNombreytitulo() {
        return nombreytitulo;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public String getEstudios() {
        return estudios;
    }

    public String getEmail() {
        return email;
    }
//Setter
    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setNombreytitulo(String nombreytitulo) {
        this.nombreytitulo = nombreytitulo;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
 
    
    
    
}

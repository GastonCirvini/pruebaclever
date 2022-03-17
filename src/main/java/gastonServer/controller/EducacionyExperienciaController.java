
package gastonServer.controller;

import gastonServer.model.EducacionyExperiencia;
import gastonServer.repository.EducacionyExperienciaRepository;

import gastonServer.service.IEducacionyExperienciaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionyExperienciaController {
     
    @Autowired
    private IEducacionyExperienciaService eduyexp;

    public EducacionyExperienciaRepository eduyexprepo;
    
    @PostMapping ("/nueva/educacion")
    public void agregarEducacionyExperiencia (@RequestBody EducacionyExperiencia exp) {
        eduyexp.crearEducacion(exp);
    }
    @GetMapping ("/ver/educacion")
    public List <EducacionyExperiencia> verEducacion (){
        return eduyexp.verEducacionyExperiencia();
    }
    @DeleteMapping ("/borrarEducacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
        eduyexp.borrarEducacion(id);
    }
    

    



    
}

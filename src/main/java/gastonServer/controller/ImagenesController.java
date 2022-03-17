
package gastonServer.controller;

import gastonServer.model.Imagenes;
import gastonServer.service.IImagenesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImagenesController {
    
    @Autowired
    private IImagenesService imgs;
    
    @GetMapping ("/ver/imagenes")
    public List <Imagenes> verImagenes(){
        return imgs.verImagenes();
    }
    
    @PostMapping ("/nueva/imagen")
    public void agregarImagen(@RequestBody Imagenes img){
        imgs.cambiarImagenes(img);
        
    }
    
    @DeleteMapping ("/borrar/imagen/{id}")
    public void borrarImagen (@PathVariable Long id){
        imgs.borrarImagenes(id);
    }
    
}


package gastonServer.controller;

import gastonServer.model.Titulos;
import gastonServer.service.ITitulosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TitulosController {
    
   @Autowired
   private ITitulosService tit;
   
 @PostMapping ("/nuevo/titulo")
 public void nuevoTitulo (@RequestBody Titulos ti ) {
     tit.crearTitulos(ti);
 }
 @GetMapping ("/ver/titulos")
 public List <Titulos> verTitulos (){
     return tit.verTitulos();
     
 }
 @DeleteMapping ("/borrarTitulo/{id}")
 public void borrarTitulo (@PathVariable Long id){ 
     tit.borrarTitulos(id);
 }
}

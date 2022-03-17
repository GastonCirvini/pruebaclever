
package gastonServer.controller;

import gastonServer.model.Proyecto;
import gastonServer.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {
    
    @Autowired
    private IProyectoService proy;
    
    @PostMapping ("/nuevo/proyecto")
    public void agregarProyecto (@RequestBody Proyecto pro) {
        proy.crearProyecto(pro);
    }
    
    @GetMapping ("/ver/proyecto")
    public List <Proyecto> verProyecto(){
        return proy.verProyecto();
    }
    @DeleteMapping ("/borrarProyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
        proy.borrarProyecto(id);
    }
}

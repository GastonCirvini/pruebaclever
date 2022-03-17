
package gastonServer.controller;

import gastonServer.model.Sobremi;
import gastonServer.service.ISobremiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SobremiController {
    
    @Autowired
    private ISobremiService sobre;
    
    @PostMapping ("/crear/dato")
    public void crearDatos (@RequestBody Sobremi sobr) {
        sobre.crearTexto(sobr);
    }
    @GetMapping ("/ver/datos")
    public List <Sobremi> verDatos (){
        return sobre.verSobremi();
        
    }
    @DeleteMapping ("/eliminarDato/{id}")
    public void borrarDatos (@PathVariable Long id){
        sobre.borrarTexto(id);
    }
    
}

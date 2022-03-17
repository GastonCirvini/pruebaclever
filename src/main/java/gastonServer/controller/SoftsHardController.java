
package gastonServer.controller;

import gastonServer.model.SoftsHard;
import gastonServer.service.ISoftsHardService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoftsHardController {
    
    @Autowired
    private ISoftsHardService sof;
    
    @PostMapping ("/nueva/soft")
    public void agregarSoft (@RequestBody SoftsHard sft) {
        sof.crearSoftsHard(sft);
        
    }
    @GetMapping ("/ver/soft")
    public List <SoftsHard> verSofts (){
       return sof.verSoftsHard();
    }
    
    @DeleteMapping ("/borrar/soft/{id}")
    public void borrarSoft (@PathVariable Long id){
        sof.borrarSoftsHard(id);
    }
}


package gastonServer.service;

import gastonServer.model.Imagenes;
import java.util.List;


public interface IImagenesService {
    List <Imagenes> verImagenes();
    
    void cambiarImagenes (Imagenes imagen);
    void borrarImagenes (Long id);
    Imagenes buscarImagenes (Long id);
}

package yavirac.asistencia_docente.feature.user.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rol")
@CrossOrigin(("*"))
public class RolController {

    @Autowired
    RolService rolService;
    @GetMapping("/findAll")
    public List<Rol> findAll(){
        return rolService.findAll();
    }

    @GetMapping(value="/findById(id)")
    public Rol findById(@PathVariable Long id){
        return rolService.findById(id);
    }
    
}

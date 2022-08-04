package yavirac.asistencia_docente.feature.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {

    @Autowired
    RolRepository rolRepository;
     
    public List<Rol> findAll(){
        return rolRepository.findAll();
    }

    public Rol findById(long id){
        return rolRepository.findById(id).orElse(new Rol());

    }
    
}

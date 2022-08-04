package yavirac.asistencia_docente.feature.permiso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermisoService {
    

    @Autowired
    PermisoRepository permisoRepository;

    public Permiso save(Permiso permiso){
       return permisoRepository.save(permiso);
    }

    public Permiso findById(long id){
        return permisoRepository.findById(id).orElse(new Permiso());
    }

    public Permiso update(Permiso permiso){
        return permisoRepository.save(permiso);

    }

    public void deleteById(long id){
        permisoRepository.deleteById(id);
    }

    public List<Permiso> findAll(){
        return permisoRepository.findAll();
    }

    public List<Permiso> findByName(String term){
        return permisoRepository.findByNameLikeIgnoreCase(term+"%");
    }
}

package yavirac.asistencia_docente.feature.permiso;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PermisoRepository extends CrudRepository<Permiso, Long> {
    
    List<Permiso>findAll();
    List<Permiso>findByNameLikeIgnoreCase(String term);

}

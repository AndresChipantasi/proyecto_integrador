package yavirac.asistencia_docente.auth.authority;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {

    List<Authority> findByNameLikeIgnoreCase(String term);
    
}
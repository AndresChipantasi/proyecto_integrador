package yavirac.asistencia_docente.feature.person;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>{

    @Query("select * from persons where archived = false")
    List<Person> findAll();

    @Query("select * from persons where archived = true")
    List<Person> findArchived();

    List<Person> findByNameLikeIgnoreCase(String term);

}
    

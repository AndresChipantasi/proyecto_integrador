package yavirac.asistencia_docente.feature.user.user;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

    @Query("select * from users where archived = false")
    List<User> findAll();

    @Query("select * from users where archived = true")
    List<User> findArchived();

    List<User> findByUsernameLikeIgnoreCase(String term);

}
    

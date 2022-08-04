package yavirac.asistencia_docente.feature.user;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("users")
public class User {

    @Id
    @Column("user_id")
    private long userId;
    private String username;
    private String email;
    private String password;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private boolean archived;
    @Column("person_id")
    private long personId;

    @MappedCollection(idColumn = "user_id")
    private Set<UserPermission> permissions = new HashSet<>();
}

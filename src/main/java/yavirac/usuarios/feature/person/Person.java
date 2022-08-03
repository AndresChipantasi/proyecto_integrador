package yavirac.usuarios.feature.person;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("persons")
public class Person {

    @Id
    @Column("person_id")
    private long personId;
    private String dni;
    private String name;
    private String email;
    private String username;
    private String password;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private Long rolId;
    private boolean archived;
}

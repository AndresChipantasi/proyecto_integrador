package yavirac.asistencia_docente.feature.person;
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
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private boolean archived;
}

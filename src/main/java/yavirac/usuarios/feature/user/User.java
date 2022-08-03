package yavirac.usuarios.feature.user;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
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
    private Long personId;
    private Long rolId;
    private boolean archived;
}

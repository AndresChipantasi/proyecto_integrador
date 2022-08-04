package yavirac.asistencia_docente.feature.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("users_permissions")
public class UserPermission {

    @Id
    @Column("users_permissions")
    private long userPermissionId;
    @Column("user_id")
    private long userId;
    @Column("permission_id")
    private long permissionId;
}

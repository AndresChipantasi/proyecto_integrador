package yavirac.asistencia_docente.feature.tipopermisos;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("permiso_permission")
public class PermisoPermission {

    @Id
    @Column("permiso_permission_id")
    private long permisoPermissionId;
    @Column("permiso_id")
    private long permisoId;
    @Column("permission_id")
    private long permissionId;
}
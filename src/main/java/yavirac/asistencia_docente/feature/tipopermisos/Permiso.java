package yavirac.asistencia_docente.feature.tipopermisos;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("tipopermisos")

public class Permiso {


    @Id
    @Column("permiso_id")
    private long permisoId;
    private String name;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private Long userId;
    
    @MappedCollection(idColumn = "permiso_id")
    private Set<PermisoPermission> permissions = new HashSet<>();
    
}

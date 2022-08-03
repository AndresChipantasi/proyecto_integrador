package yavirac.asistencia_docente.feature.permiso;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("permisos")
public class Permiso {


    @Id
    @Column("permiso_id")
    private long permisoId;
    private String name;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled; 
}

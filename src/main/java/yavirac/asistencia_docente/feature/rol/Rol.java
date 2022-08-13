package yavirac.asistencia_docente.feature.rol;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Rol {
    @Id private long id;
    private String name;
}

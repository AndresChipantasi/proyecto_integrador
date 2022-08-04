package yavirac.asistencia_docente.auth.authority;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Authority {
    @Id
    private long id;
    private String name;
}
package yavirac.asistencia_docente.feature.activity;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("activities")
public class Activity {

    @Id
    @Column("activity_id")
    private Long activityId;
    private String userName;
    private String nameActivity;
    private String description;
    private Timestamp date;
    private boolean active;
    
}

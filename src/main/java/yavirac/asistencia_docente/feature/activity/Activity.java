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
    private long activityId;
    @Column("user_name")
    private String userName;
    @Column("name_activity")
    private String nameActivity;
    private String description;
    private Timestamp date;
    private boolean active;
    
}

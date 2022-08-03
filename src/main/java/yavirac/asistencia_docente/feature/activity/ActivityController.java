package yavirac.asistencia_docente.feature.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activity")
public class ActivityController {
    

    @Autowired
    ActivityService activityService;

    //CRUD

    @PostMapping("/save")
    public Activity save(Activity activity){
        return activityService.save(activity);
    }

}

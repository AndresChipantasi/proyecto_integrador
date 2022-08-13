package yavirac.asistencia_docente.feature.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    @Autowired
    ActivityRepository activityRepository;

    //CRUD = Create, Read, Update, Delete

    public Activity save(Activity activity){
        return activityRepository.save(activity);
    }

    public Activity findById(long id){
        return activityRepository.findById(id).orElse(new Activity());
    }

    public Activity update(Activity activity){
        return activityRepository.save(activity);
    }

    public void deleteById(long id){
        activityRepository.deleteById(id);
    }
    
}

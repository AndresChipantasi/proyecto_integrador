package yavirac.asistencia_docente.feature.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    

    @Autowired
    ActivityRepository activityRepository;

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

    public List<Activity> findAll(){
        return activityRepository.findAll();
    }

    public List<Activity> findByName(String term){
        return activityRepository.findByUserNameLikeIgnoreCase(term+"%");
    }
}
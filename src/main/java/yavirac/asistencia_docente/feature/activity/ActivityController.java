package yavirac.asistencia_docente.feature.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/api/activity")
public class ActivityController {
    

    @Autowired
    ActivityService activityService;

    //CRUD

    @PostMapping("/save")
    public Activity save(@RequestBody Activity activity){
        return activityService.save(activity);
    }
    
    @GetMapping("/{id}")
    public Activity findById(@PathVariable long id){
    return activityService.findById(id); 
    }

    @PutMapping("/update")
    public Activity update(@RequestBody  Activity activity){

    return activityService.save(activity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id){
        activityService.deleteById(id);
    
    }

    }

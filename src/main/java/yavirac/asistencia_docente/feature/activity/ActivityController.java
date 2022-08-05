package yavirac.asistencia_docente.feature.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activity")
@CrossOrigin({"*"})

public class ActivityController {
    @Autowired

    ActivityService activityService;

    @PostMapping("/save")
    public Activity save(@RequestBody Activity activity) {
        return activityService.save(activity);
    }
    @GetMapping("/{id}")
    public Activity findById(@PathVariable long id){
        return activityService.findById(id);
    }
    
    @PutMapping("/update")
    public Activity update(@RequestBody Activity activity)
    {
        return activityService.save(activity);
    }
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        activityService.deleteById(id);
    }
    @GetMapping("/findAll")
    public List<Activity> findAll(){
        return activityService.findAll();
    }
    @GetMapping("/findByName/{term}")
    public List<Activity> findByName(@PathVariable String term){ //Mapea desde la URL con PathVariable
        return activityService.findByName(term);
    }
}
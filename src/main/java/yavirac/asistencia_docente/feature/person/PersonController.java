package yavirac.asistencia_docente.feature.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
@CrossOrigin({"*"})

public class PersonController {
    
    @Autowired
    PersonService personService;

    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Person save(@RequestBody Person person){
        return personService.save(person);
    }
    
    @GetMapping("/findById/{id}")
    public Person findById(@PathVariable Long id) {
        return personService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/findByName/{term}")
    public List<Person> findByName(@PathVariable String term){
        return personService.findByName(term);
    }

    @GetMapping("/findArchived")
    public List<Person> findArchived() {
        return personService.findArchived();
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person usuario) {
        return personService.save(usuario);
    }
}

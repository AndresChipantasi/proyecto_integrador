package yavirac.asistencia_docente.feature.user.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    //CRUD = Create, Read, Update, Delete
    public Person save(Person person) {
        return personRepository.save(person);
    } 
    
    public List<Person> findAll() {
        return personRepository.findAll();
    }
    public List<Person> findByName(String term){
        return personRepository.findByNameLikeIgnoreCase(term+"%");
    }

    public List<Person> findArchived() {
        return personRepository.findArchived();
    }

    public Person findById(long id){
        return personRepository.findById(id).orElse(new Person());
    }

    public Person update(Person person){
        return personRepository.save(person);
    }
}

package dto;

import entities.Person;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Per
 */


public class PersonsDTO {
    
    List<PersonDTO> all = new ArrayList();

    public PersonsDTO(List<Person> personEntities) {
        personEntities.forEach((p) -> {
            all.add(new PersonDTO(p));
        });
    }
}


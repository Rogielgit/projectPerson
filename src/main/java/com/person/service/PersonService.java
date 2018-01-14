package com.person.service;

import com.person.model.Person;
import com.person.repository.IPersonRepository;
import com.person.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService implements IPersonService{

    public IPersonRepository personRepository;

    @Transactional
    public void createPerson(Person p) {
        personRepository.createPerson(p);
    }

    @Transactional
    public void updatePerson(Person p) {
        personRepository.updatePerson(p);
    }

    @Transactional
    public void deletePerson(int id) {
        personRepository.deletePerson(id);
    }

    @Transactional
    public List<Person> listPerson() {
       return personRepository.listPerson();
    }

    @Transactional
    public Person findPersonById(int id) {
        return personRepository.findPersonById(id);
    }

    public void setiPersonRepository(PersonRepository iPersonRepository) {
        this.personRepository = iPersonRepository;
    }

}

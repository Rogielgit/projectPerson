package com.person.repository;

import com.person.model.Person;
import org.hibernate.SessionFactory;

import java.util.List;

public interface IPersonRepository {

   public void createPerson(Person p);
   public void updatePerson(Person p);
   public void deletePerson(int id);
   public List<Person> listPerson();
   public void setSessionFactory(SessionFactory sf);
   public Person findPersonById(int id);

}

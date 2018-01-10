package com.person.repository;

import com.person.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository implements IPersonRepository{

    private SessionFactory sessionFactory;

    @Override
    public void createPerson(Person p) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(p);
    }

    @Override
    public void updatePerson(Person p) {
        Session session = sessionFactory.getCurrentSession();
        session.update(p);
    }

    @Override
    public void deletePerson(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Person person = (Person) session.load(Person.class, new Integer(id));
        session.delete(person);
    }

    @Override
    public List<Person> listPerson() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Person> personsList = session.createQuery("from Person").list();
        return personsList;
    }

    @Override
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
}

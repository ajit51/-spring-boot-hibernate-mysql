package com.example.springboothibernatemysql.dao;

import com.example.springboothibernatemysql.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        Session session = sessionFactory.getCurrentSession();
        if (session == null) {
            session = sessionFactory.openSession();
        }
        return session;
    }

    public void savePerson(Person person){
        getSession().save(person);
    }

    public List<Person> getPerson(){
        return getSession().createCriteria(Person.class).list();
    }
}

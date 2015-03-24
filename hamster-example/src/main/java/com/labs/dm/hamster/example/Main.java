package com.labs.dm.hamster.example;

import com.labs.dm.hamster.example.domain.Person;
import com.labs.dm.hamster.example.helpers.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * @author daniel
 */
public class Main {
    private static final SessionFactory sf = HibernateUtil.getSessionFactory();

    public static void main(String[] args) {
        Session s = sf.openSession();
        s.getTransaction().begin();
        Person person = new Person("Jack Smith");
        System.out.println(s.save(person));
        System.out.println(person.getId());
        s.getTransaction().commit();
        s.flush();
        System.out.println(s.getStatistics());

        s.close();
        s = sf.openSession();

        s.get(Person.class, person.getId());

        List<Person> list = s.createQuery("from Person").list();
        System.out.println(list.size());
        System.out.println(s.getStatistics());

        list = s.createQuery("from Person").list();
        System.out.println(list.size());
        System.out.println(s.getStatistics());
        s.get(Person.class, person.getId());
        s.close();
        sf.close();
    }
}

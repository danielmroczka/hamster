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

    private static void add() {
        System.out.println("Add items...");
        Session s = sf.openSession();
        s.getTransaction().begin();

        s.save(new Person("Jack Smith"));
        s.save(new Person("John Newman"));
        s.save(new Person("Eddie Murphy"));
        s.getTransaction().commit();
        s.flush();
    }

    public static void main(String[] args) {
        Session s = null;
        try {
            s = sf.openSession();
            List<Person> list = s.createQuery("from Person").list();
            if (list.isEmpty()) {
                add();
                list = s.createQuery("from Person").list();
            }
            s.close();

            Session s2 = sf.openSession();

            System.out.println("Session2 -->");
            s2.get(Person.class, list.get(0).getId());
            s2.close();

            sf.getCache().evictAllRegions();
            Session s3 = sf.openSession();

            System.out.println("Session3 -->");
            s3.get(Person.class, list.get(0).getId());
            s3.get(Person.class, list.get(0).getId());
            s3.close();


        } finally {

            sf.close();

        }


    }
}

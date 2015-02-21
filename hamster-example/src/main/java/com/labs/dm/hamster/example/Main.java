package com.labs.dm.hamster.example;

import com.labs.dm.hamster.example.domain.Person;
import com.labs.dm.hamster.example.helpers.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author daniel 
 */
public class Main {
    private static final SessionFactory sf = HibernateUtil.getSessionFactory();
    
    public static void main(String[] args) {
        Session s = sf.openSession();
        
        Person person = new Person("Jack Smith");
        s.save(person);
        
        
        System.out.println(s.getStatistics());
        
        s.close();
        s = sf.openSession();
        
        List<Person> list = s.createQuery("from Person").list();
        System.out.println(list.size());
        System.out.println(s.getStatistics());
        
        list = s.createQuery("from Person").list();
        System.out.println(list.size());
        System.out.println(s.getStatistics());
        
        s.close();
        sf.close();
    }
}

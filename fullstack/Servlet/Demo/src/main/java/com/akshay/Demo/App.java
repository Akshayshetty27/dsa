package com.akshay.Demo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Alien tulosko = new Alien ();
        tulosko.setAlien_id(101);
        tulosko.setName("abc");
        tulosko.setColor("pink");
        
        
        Configuration con = new Configuration(); 
        
        SessionFactory sf= con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        session.save(tulosko);
        
    }
}

package com.hexaware.hibernate2.com.hexaware.hibernate2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    	Scanner sc=new Scanner(System.in);
    	
    	SessionFactory fac;
    	Session ses;
    	Transaction tx;
    	
    	App(){
    		fac=new Configuration().configure("hiber.config.xml").addAnnotatedClass(Student.class).buildSessionFactory();
    		ses=fac.openSession();
    	}
    	
    	void insertRecord() {
    		tx=ses.beginTransaction();
        
        	Student s1=new Student();
        	Result r1=new Result();
        	s1.setName("Asha");
        	s1.setFee(11000.00);
        	r1.setMarks(99);
        	r1.setSubject("Maths");
        	s1.setRes(r1);
        	ses.save(s1);
        	tx.commit();
    	}

    	public static void main(String args[]) {
    		App app=new App();
        	app.insertRecord();
    		
    		System.out.println("Done!");
    		
    		
    	}
}

package com.sample.project.jpa_project.Akshay;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main2.school;


public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
        try {
        	emf = Persistence.createEntityManagerFactory("jpa-mss");
        	entityManager = emf.createEntityManager();
        				transaction = entityManager.getTransaction();
        				transaction.begin();
        				school s1=new school();
        				s1.setStd(1);
        				s1.setName("SVM");
        				s1.setDivision("A");
        				s1.setAddress("Mumbai");
        				s1.setEmailId("svm@gmail.com");
        				s1.setContact("12345");
        				
        				s1.setStd(2);
        				s1.setName("AMB");
        				s1.setDivision("B");
        				s1.setAddress("Pune");
        				s1.setEmailId("abm@gmail.com");
        				s1.setContact("7895");
        				
        				entityManager.persist(s1);
        				transaction.commit();
        				Query q = entityManager.createQuery("select v from school v");
        				List<school> resultList = q.getResultList();
        				System.out.println("num of school:" + resultList.size());
        				for (school next : resultList) {
        					System.out.println("next school: " + next);
        				}
        				
        }
        
        catch(Exception e){
    			System.out.println(e);
    			transaction.rollback();
    		}
        
        finally {
    			entityManager.close();
    			emf.close();
    		}
    	}
      
}

/*package com.semihdizdar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindMethodOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personel p ;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_jpa");
		EntityManager em = emf.createEntityManager();
		
		p = em.find(Personel.class, 2);
		System.out.println("Adý : " + p.getName() + " Soyadý : " + p.getSurname());
		
		
		emf.close();
		em.close();
		
		
		
		
		
	}
	
}
*/


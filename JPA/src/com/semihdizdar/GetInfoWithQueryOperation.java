package com.semihdizdar;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class GetInfoWithQueryOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_jpa");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Personel> personQuery = em.createQuery("Select p from Personel p", Personel.class);
		List<Personel> personList = personQuery.getResultList();
		
		for(Personel p : personList) {
			
			System.out.println("Adi : " + p.getName() + " Soyadi : " + p.getSurname());
			emf.close();
			em.close();
			
		}
	}

}

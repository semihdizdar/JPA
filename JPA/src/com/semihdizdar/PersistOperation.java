/*
 * package com.semihdizdar;
 * 
 * import javax.persistence.EntityManager; import
 * javax.persistence.EntityManagerFactory;
 * 
 * import org.hibernate.boot.archive.internal.ExplodedArchiveDescriptor; import
 * org.hibernate.jpamodelgen.xml.jaxb.Persistence;
 * 
 * public class PersistOperation {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * EntityManagerFactory emf; EntityManager em; emf =
 * javax.persistence.Persistence.createEntityManagerFactory("pu_jpa"); em =
 * emf.createEntityManager();
 * 
 * Personel perso = new Personel(); perso.setName("emrah");
 * perso.setSurname("erdoðan");
 * 
 * 
 * try {
 * 
 * em.getTransaction().begin(); em.persist(perso); em.getTransaction().commit();
 * em.close(); emf.close();
 * System.out.println("Record was inserted successfully!");
 * 
 * }catch(Exception e) {
 * 
 * System.err.println("An Error Occured. Error is:"+e); }
 * 
 * 
 * 
 * }
 * 
 * }
 */
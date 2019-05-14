package com.semihdizdar;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.GenerationType.TABLE;

/**
 * Entity implementation class for Entity: Personel
 *
 */
@Entity
@Table(name = "tblPersonel")
@NamedQuery(name = "Person.findAll", query = "SELECT p FROM Personel p")
public class Personel implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private String name;
	private String surname;
	private static final long serialVersionUID = 1L;

	public Personel() {
		super();
	}   
	public int get›d() {
		return this.id;
	}

	public void set›d(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
   
}

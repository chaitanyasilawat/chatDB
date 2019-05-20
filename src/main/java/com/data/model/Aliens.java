package com.data.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Aliens {
	
	public Aliens() {
		super();
	}
	public Aliens(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;

}
package com.lcwd.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="HOTELS")
public class Hotel {
	
	@Id
	private String id;
	private String name;
	private String about;
	private String location;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String id, String name, String about, String location) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", about=" + about + ", location=" + location + "]";
	}
	
	

}

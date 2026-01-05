package com.hybernates.java.hybernates_java;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CritEmp")
public class CriteriaEmp {
	
	@Id
	int id;
	String name;
	
	@Column(name="loc")
	String location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "CriteriaEmp [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	

}

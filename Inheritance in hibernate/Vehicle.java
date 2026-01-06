package Hibernate_Inheritance;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
@Entity
@Table(name="Vehicle")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "veh_Type",discriminatorType = DiscriminatorType.STRING)

public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + "]";
	}
	public void setBrand1(String brand2) {
		// TODO Auto-generated method stub
		
	}

}

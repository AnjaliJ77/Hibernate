package Hibernate_Inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "bike")
public class Bike extends Vehicle{
	int model;
	String clr;
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getClr() {
		return clr;
	}
	public void setClr(String clr) {
		this.clr = clr;
	}
	@Override
	public String toString() {
		return "Bike [model=" + model + ", clr=" + clr + "]";
	}
	
}

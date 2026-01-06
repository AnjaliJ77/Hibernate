package Hibernate_Inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@Entity
@DiscriminatorValue(value="car")
public class Car extends Vehicle{
	String fuelType;

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [fuelType=" + fuelType + "]";
	}
	

}

package Hibernate_Inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Cow extends Pet{
	String clr;
	boolean child;
	public String getClr() {
		return clr;
	}
	public void setClr(String clr) {
		this.clr = clr;
	}
	public boolean isChild() {
		return child;
	}
	public void setChild(boolean child) {
		this.child = child;
	}
	@Override
	public String toString() {
		return "Cow [clr=" + clr + ", child=" + child + "]";
	}
	
	

}

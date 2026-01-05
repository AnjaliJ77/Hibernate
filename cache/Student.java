package com.hybernates.java.hybernates_java;



import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Student {
	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int sid;
	String sname;
	double feese;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getFeese() {
		return feese;
	}
	public void setFeese(double feese) {
		this.feese = feese;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", feese=" + feese + "]";
	}
	

}

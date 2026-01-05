package com.hybernates.java.hybernates_java;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class emptable {
	
	
	//id is our primary key hence we should use annotation here
	
	//Empid, EmpName, doj, Sal
	
	
	@Id
	@Column(name="Empid")
	int Empid;
	
	@Column(name="EmpName")
	String EmpName;
	
	@Column(name="dep")
	String dep;
	
	@Column(name="Sal")
	double sal;
	
	
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String doj) {
		this.dep = doj;
	}
	@Override
	public String toString() {
		return "emptable [Empid=" + Empid + ", EmpName=" + EmpName + ", dep=" + dep + ", sal=" + sal + "]";
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}

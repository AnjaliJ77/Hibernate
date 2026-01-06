package Hibernate_Inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="Pet")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	String pname;
	String loc;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Pet [pid=" + pid + ", pname=" + pname + ", loc=" + loc + "]";
	}
	

}

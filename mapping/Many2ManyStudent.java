package HibernateMapping;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Many2ManyStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sid;
	String sname;
	String loc;
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_course",
	joinColumns=@JoinColumn(name="sid"),
	inverseJoinColumns = @JoinColumn(name="cid")
	)
	private Set<Many2ManyCourse> course;
	public Set<Many2ManyCourse> getCourse() {
		return course;
	}
	public void setCourse(Set<Many2ManyCourse> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Many2ManyStudent [sid=" + sid + ", sname=" + sname + ", loc=" + loc + ", course=" + course + "]";
	}
	
	
	
	
	
	
	
	
	

}


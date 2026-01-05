package HibernateMapping;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Many2ManyCourse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cid;
	String cname;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	@ManyToMany(mappedBy = "course")
	
	private Set<Many2ManyStudent> student;

	@Override
	public String toString() {
		return "Many2ManyCourse [cid=" + cid + ", cname=" + cname + ", student=" + student + "]";
	}
	
	
	

}

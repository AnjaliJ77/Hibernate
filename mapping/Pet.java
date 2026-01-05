package HibernateMapping;

import org.hibernate.annotations.AnyDiscriminatorImplicitValues.Strategy;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Pet")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	String cat;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="oid")
	private OneToOne_Owner owner;
	public OneToOne_Owner getOwner() {
		return owner;
	}
	public void setOwner(OneToOne_Owner owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Pet [pid=" + pid + ", cat=" + cat + ", owner=" + owner + "]";
	}
	

}

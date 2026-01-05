package HibernateMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Owner")
public class OneToOne_Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int oid;
	String oName;
	String address;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getAdd() {
		return address;
	}
	public void setAdd(String add) {
		this.address = add;
	}
	
	@OneToOne(mappedBy = "owner")
	private Pet pet;
	@Override
	public String toString() {
		return "OneToOne_Owner [oid=" + oid + ", oName=" + oName + ", add=" + address + "]";
	}
	
	

}

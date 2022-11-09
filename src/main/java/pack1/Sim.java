package pack1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String simid;
	private String company;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSimid() {
		return simid;
	}
	public void setSimid(String simid) {
		this.simid = simid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
}

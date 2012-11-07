package registerOffice.businessObjects.persons;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String miasto;
	private String ulica;
	private int nr;
	@ManyToMany(cascade=javax.persistence.CascadeType.PERSIST, fetch=FetchType.EAGER)
	protected List<Person> mieszkaniec;
	
	public Address(String miasto,String ulica,int nr){
		this.ulica=ulica;
		this.miasto=miasto;
		this.nr=nr;
		this.mieszkaniec=new ArrayList<Person>();
	}

	public List<Person> getMieszkaniec() {
		return mieszkaniec;
	}

	public void setMieszkaniec(List<Person> mieszkaniec) {
		this.mieszkaniec = mieszkaniec;
	}
	

}

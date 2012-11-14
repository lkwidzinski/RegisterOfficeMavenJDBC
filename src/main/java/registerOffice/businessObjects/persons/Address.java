package registerOffice.businessObjects.persons;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@NamedQueries({
	@NamedQuery(
			name="allAddresses.ById",
			query="From Address a where a.id=:id"),
	@NamedQuery(
			name="allAddresses",
			query="From Address a"),
	@NamedQuery(
			name="deleteAddress",
			query="delete from Address a where a.id=:id")
	
		
		
		
		
})





@Entity
public class Address {
	
	public int getId() {
		return id;
	}

	
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

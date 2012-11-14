package registerOffice.businessObjects.persons;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import registerOffice.businessObjects.cars.*;

@NamedQueries({
	@NamedQuery(
		name="allPersons.ByName",
		query="From Person p where p.name=:name"),
	@NamedQuery(
			
		name="allPersons",
		query="From Person p"),
	@NamedQuery(
		name="allPersons.ById",
		query="From Person p where p.id=:id"),
	@NamedQuery(
		name="deletePerson"	,
		query="delete Person p where p.id=:id"	)

})
@Entity
@Table(name="OSOBY")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="imie")
	private String name;
	
	@OneToMany(mappedBy="owner", cascade=javax.persistence.CascadeType.PERSIST)
	private List<Car> cars;
	private String pesel;
	@ManyToMany(mappedBy="mieszkaniec")
	private List<Address> adres=new ArrayList<Address>();
	
	public Person(String name, String pesel)
	{
		this.pesel=pesel;
		this.name=name;
		this.cars=new ArrayList<Car>();
	}
	
	public Person(String name) {
		
		this(name,"");
	}
	
	public Person()
	{
		this("","");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setAdres(List<Address> adres){
		this.adres=adres;
		
	}
	public List<Address> getAdres(){
		return adres;
	}
	
}

package registerOffice.businessObjects.persons;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import registerOffice.businessObjects.cars.*;

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
	
	
	
}

package registerOffice.businessObjects.cars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import registerOffice.businessObjects.persons.Person;

public abstract class Car implements CarInterface{

	protected int id;
	protected Person owner;
	
	public void printData()
	{
		System.out.println("Owner: "+owner.getName());
		System.out.println(getCarDetails());
	}
	
	public abstract String getCarDetails();
	
	public abstract Car Clone();
	
	public void setOwner(Person owner)
	{
		this.owner=owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getOwner() {
		return owner;
	}
	
	
}

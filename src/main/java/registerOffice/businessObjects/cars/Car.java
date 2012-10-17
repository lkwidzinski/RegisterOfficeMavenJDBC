package registerOffice.businessObjects.cars;

import registerOffice.businessObjects.persons.Person;

public abstract class Car implements CarInterface{

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
	
	
}

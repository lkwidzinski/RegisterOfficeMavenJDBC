package registerOffice;

import registerOffice.businessObjects.persons.*;
import registerOffice.management.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PersonManager mgr = new PersonManager();
		mgr.save(new Person("Adam","1234"));
		mgr.save(new Person("Michal","1234"));
		mgr.save(new Person("Paweł","1234"));
		
		//mgr.delete(new Person("Adam"));
		for(Person p: mgr.getAll())
		{
			System.out.println(p.getName());
		}
		
	}

}

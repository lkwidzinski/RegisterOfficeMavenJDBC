package registerOffice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import registerOffice.businessObjects.cars.Car;
import registerOffice.businessObjects.cars.PersonCar;
import registerOffice.businessObjects.persons.*;
import registerOffice.management.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		//
		Car c = new PersonCar("BMW","GDA12345");
		Person adam = new Person("Adam","1234");
		Address a=new Address("sezamkowa","zamek",12);
		adam.getCars().add(c);
		adam.getAdres().add(a);
		a.getMieszkaniec().add(adam);
		c.setOwner(adam);
		
		//
		
		session.persist(adam);
		session.persist(a);
		session.getTransaction().commit();
		session.close();
		//PersonManager mgr = new PersonManager();
		//mgr.save(new Person("Adam","1234"));
		//mgr.save(new Person("Michal","1234"));
		//mgr.save(new Person("Paweł","1234"));
		
		//mgr.delete(new Person("Adam"));
		//for(Person p: mgr.getAll())
		//{
		//	System.out.println(p.getName());
		//}
		
		
		//System.out.println("Osoba o id 4:"+mgr.get(4).getName());
		
	}

}

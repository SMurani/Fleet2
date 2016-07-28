package fleet.person.bean;

import java.util.List;

import fleet.person.model.Person;



public interface PersonBeanI {

	void create(Person person);

	Boolean login (String username, String password);
	List<Person> list();

}

package fleet.person.bean;

import java.util.List;

import fleet.person.model.Person;



public interface PersonBeanI {

	void create(Person person);

	Boolean login (String username, String password);
	List<Person> list();

	String userId(String username, String password);

	String userType(String username, String password);
	List<Person>list2();
	boolean delete(Long id);
	boolean update (Long id);

	int countApproved();
	int countUsers();

}

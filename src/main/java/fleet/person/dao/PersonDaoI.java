package fleet.person.dao;

import java.util.List;

import javax.persistence.EntityManager;

import fleet.generic.dao.GenericDaoI;

import fleet.person.model.Person;

public interface PersonDaoI extends GenericDaoI<Person, Long>{

	Boolean login (String username, String password);

	String userId(String username, String password);

	String userType(String username, String password);

	List<Person>list2();

	void delete(Long id);




}

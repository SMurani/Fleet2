package fleet.person.dao;

import java.util.List;

import javax.persistence.EntityManager;

import fleet.generic.dao.GenericDaoI;

import fleet.person.model.Person;

public interface PersonDaoI extends GenericDaoI<Person, Long>{

	Boolean login (String username, String password);


}

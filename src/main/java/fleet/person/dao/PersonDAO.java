package fleet.person.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Query;

import fleet.generic.dao.GenericDao;
import fleet.person.model.Person;

public class PersonDAO extends GenericDao <Person, Long> implements PersonDaoI{

	public Boolean login(String username, String password) {


		String hql = "FROM Person p WHERE p.user.username=:username "
				+ "and p.user.password=:pwd";
		Query query = em.createQuery(hql)
				.setParameter("username", username)
				.setParameter("pwd", password);

		List<Person> results = query.getResultList();


		System.out.println(results.isEmpty());

		if (results.isEmpty())
			return false;
		else
			return true;
	}

	public String userId(String username, String password) {
		String userId = "";
		String hql = "FROM Person p WHERE p.user.username=:username  and p.user.password=:pwd";
		Query query = em.createQuery(hql).setParameter("username", username)
				.setParameter("pwd", password);
		List <Person> list = query.getResultList();

		if (list.isEmpty()){
			return null;
		}
		else{
			for (Person p : list){
				userId = p.getId().toString();
			}
		}
		return userId;
	}

	public String userType(String username, String password) {
		String usertype = "";
		String hql = "FROM Person p WHERE p.user.username=:username  and p.user.password=:pwd";
		Query query = em.createQuery(hql).setParameter("username", username)
				.setParameter("pwd", password);
		List <Person> list = query.getResultList();

		if (list.isEmpty()){
			return null;
		}
		else{
			for (Person p : list){

				usertype=p.getUser().getUserType().toString();
			}
		}
		return usertype;

	}




	public List<Person> list2() {

		List<Person> personserson = getEm().createNamedQuery(Person.NQ_ALL)
				.getResultList();

		return personserson;
	}

	public void update(Long id) {
			String hql1 = "UPDATE Person p set p.user.userType = '2' "  +
				"WHERE p.id = :id";


			Query query = em.createQuery(hql1).setParameter("id", id);
			query.executeUpdate();


	}

	public int countApproved() {
		List <BigInteger> result = em.createNativeQuery("select count(user_type) from user_users p where p.user_type='2'").getResultList();
		return (result.get(0)).intValue();
	}
	public int countUsers() {
		List <BigInteger> result = em.createNativeQuery("select count(*) from user_users").getResultList();
		return (result.get(0)).intValue();

	}

	public void delete(Person id){
		em.remove(em.find(Person.class, id));
	}






}

package fleet.person.model;

import java.io.Serializable;

import javax.persistence.*;

import fleet.common.model.Address;
import fleet.common.model.User;


@NamedQueries({
		@NamedQuery(
				name = Person.NQ_ALL,
				query = "FROM Person p"
		)

})

@Entity
@Table(name = "user_users")
public class Person  implements Serializable{

	private static final long serialVersionUID = 1L;
	@Transient
	public static final String NQ_ALL = "Person.All";

	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "first_name")
	private String fName;

	@Column(name = "last_name")
	private String lName;

	@Column( unique = true)
	private String personId;

	@Embedded
	private Address address;

	@Embedded
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstname() {
		return fName;
	}

	public void setFirstname(String firstname) {
		this.fName = firstname;
	}

	public String getLastname() {
		return lName;
	}

	public void setLastname(String lastname) {
		this.lName = lastname;
	}

	/*public String getId() {
		return personId;
	}

	public void setId(String id) {
		this.personId = id;
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}
}

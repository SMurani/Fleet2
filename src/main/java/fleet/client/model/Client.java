package fleet.client.model;




import com.fasterxml.jackson.annotation.JsonIgnore;
import fleet.common.model.Address;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


@NamedQueries({
	@NamedQuery(
			name = Client.NQ_ALL,
			query = "FROM Client c"
	),
	@NamedQuery(
			name = Client.NQ_FINDBYID,
			query = "FROM Client c WHERE c.id=:id"
	)
})
@Entity
@Table(name = "client_clients")
@XmlRootElement
//@JsonInclude(Include.NON_EMPTY)
public class Client implements Serializable {
	
	public static final long SerialVersionUI=1L;
	
	@Transient
	public static final String NQ_ALL = "Client.All";
	
	@Transient
	public static final String NQ_FINDBYID = "Client.findById";
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "id_number")
	private String idNumber;

	@Column(name = "description", columnDefinition = "TEXT")
	private String clientDescription;
	@Embedded
	private Address address;


	public Client(){

	}

	public Client(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getClientDescription() {
		return clientDescription;
	}

	public void setClientDescription(String clientDescription) {
		this.clientDescription = clientDescription;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@JsonIgnore
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
				.append("\"id\": \"").append(getId()).append("\",")
				.append("\"clientName\": \"").append(getName()).append("\",")
				.append("\"clientReg\": \"").append(getIdNumber()).append("\",")
				.append("\"clientDescription\": \"").append(getClientDescription()).append("\"");

		if(getAddress() != null){
			sb.append(",\"phoneNo\": \"").append(getAddress().getPhoneNo()).append("\",")
					.append("\"email\": \"").append(getAddress().getEmail()).append("\",")
					.append("\"town\": \"").append(getAddress().getTown()).append("\",")
					.append("\"country\": \"").append(getAddress().getCountry()).append("\",")
					.append("\"box\": \"").append(getAddress().getBox()).append("\"");
		}

		sb.append("}");

		return sb.toString();

	}
}



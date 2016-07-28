package fleet.bus.model;





import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;


@NamedQueries({
	@NamedQuery(
			name = Bus.NQ_ALL,
			query = "FROM Bus r"
	),
	@NamedQuery(
			name = Bus.NQ_FINDBYID,
			query = "FROM Bus r WHERE r.id=:id"
	)
})
@Entity
@Table(name = "bus_buss")
@XmlRootElement
//@JsonInclude(Include.NON_EMPTY)
public class Bus implements Serializable {
	
	public static final long SerialVersionUI=1L;
	
	@Transient
	public static final String NQ_ALL = "Bus.All";
	
	@Transient
	public static final String NQ_FINDBYID = "Bus.findById";
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "manager")
	private String manager;
	
	@Column(name = "description", columnDefinition = "TEXT")
	private String busDescription;
	
	@Column(name = "town")
	private String town;


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

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getBusDescription() {
		return busDescription;
	}

	public void setBusDescription(String busDescription) {
		this.busDescription = busDescription;
	}




	//@JsonIgnore
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"busName\": \"").append(getName()).append("\",")
			.append("\"busManager\": \"").append(getManager()).append("\",")
			.append("\"busDescription\": \"").append(getBusDescription()).append("\",")
			

			.append("\"busTown\": \"").append(getTown()).append("\"");
		sb.append("}");
		
		return sb.toString();
	

	
}
}

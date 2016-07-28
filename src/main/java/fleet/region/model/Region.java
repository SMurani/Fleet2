package fleet.region.model;





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
			name = Region.NQ_ALL,
			query = "FROM Region r"
	),
	@NamedQuery(
			name = Region.NQ_FINDBYID,
			query = "FROM Region r WHERE r.id=:id"
	)
})
@Entity
@Table(name = "region_regions")
@XmlRootElement
//@JsonInclude(Include.NON_EMPTY)
public class Region implements Serializable {
	
	public static final long SerialVersionUI=1L;
	
	@Transient
	public static final String NQ_ALL = "Region.All";
	
	@Transient
	public static final String NQ_FINDBYID = "Region.findById";
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "manager")
	private String manager;
	
	@Column(name = "description", columnDefinition = "TEXT")
	private String regionDescription;
	
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

	public String getRegionDescription() {
		return regionDescription;
	}

	public void setRegionDescription(String regionDescription) {
		this.regionDescription = regionDescription;
	}




	//@JsonIgnore
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"regionName\": \"").append(getName()).append("\",")
			.append("\"regionManager\": \"").append(getManager()).append("\",")
			.append("\"regionDescription\": \"").append(getRegionDescription()).append("\",")
			

			.append("\"regionTown\": \"").append(getTown()).append("\"");
		sb.append("}");
		
		return sb.toString();
	

	
}
}

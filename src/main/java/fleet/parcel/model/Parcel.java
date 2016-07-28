package fleet.parcel.model;





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
			name = Parcel.NQ_ALL,
			query = "FROM Parcel p"
	),
	@NamedQuery(
			name = Parcel.NQ_FINDBYID,
			query = "FROM Parcel p WHERE p.id=:id"
	)
})
@Entity
@Table(name = "parcel_parcels")
@XmlRootElement
//@JsonInclude(Include.NON_EMPTY)
public class Parcel implements Serializable {
	
	public static final long SerialVersionUI=1L;
	
	@Transient
	public static final String NQ_ALL = "Parcel.All";
	
	@Transient
	public static final String NQ_FINDBYID = "Parcel.findById";
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "parcel_to")
	private String parcelTo;
	
	@Column(name = "parcel_from")
	private String parcelFrom;
	
	@Column(name = "description", columnDefinition = "TEXT")
	private String parcelDescription;
	
	@Column(name = "route")
	private String route;
	
	@Column(name = "cost",columnDefinition = "DOUBLE")
	private Double parcelcost;

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Double getParcelcost() {
		return parcelcost;
	}

	public void setParcelcost(Double parcelcost) {
		this.parcelcost = parcelcost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParcelTo() {
		return parcelTo;
	}

	public void setParcelTo(String parcelTo) {
		this.parcelTo = parcelTo;
	}

	public String getParcelFrom() {
		return parcelFrom;
	}

	public void setParcelFrom(String parcelFrom) {
		this.parcelFrom = parcelFrom;
	}

	public String getParcelDescription() {
		return parcelDescription;
	}

	public void setParcelDescription(String parcelDescription) {
		this.parcelDescription = parcelDescription;
	}




	//@JsonIgnore
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"parcelTo\": \"").append(getParcelTo()).append("\",")
			.append("\"parcelFrom\": \"").append(getParcelFrom()).append("\",")
			.append("\"parcelDescription\": \"").append(getParcelDescription()).append("\",")
			

			.append("\"parcelcost\": \"").append(getParcelcost()).append("\"");
		sb.append("}");
		
		return sb.toString();
	

	
}
}

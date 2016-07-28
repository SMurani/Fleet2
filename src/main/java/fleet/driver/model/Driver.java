package fleet.driver.model;




import com.fasterxml.jackson.annotation.JsonIgnore;
import fleet.car.model.Car;
import fleet.common.model.Address;
import fleet.region.model.Region;
import fleet.driver.model.*;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


@NamedQueries({
		@NamedQuery(
				name = Driver.NQ_ALL,
				query = "FROM Driver d"
		),
		@NamedQuery(
				name = Driver.NQ_FINDBYID,
				query = "FROM Driver d WHERE d.id=:id"
		)
})
@Entity
@Table(name = "driver_drivers")
@XmlRootElement
//@JsonInclude(Include.NON_EMPTY)
public class Driver implements Serializable {

	public static final long SerialVersionUI=1L;

	@Transient
	public static final String NQ_ALL = "Driver.All";

	@Transient
	public static final String NQ_FINDBYID = "Driver.findById";

	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "id_number")
	private String idNumber;



	@Column(name = "vehicle")
	private String vehicle;

	@ManyToOne
	private Car car;

	@Transient
	private Long carId;

	@ManyToOne
	private Region region;

	@Transient
	private Long regionId;
	@Embedded
	private Address address;

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}


	/*public Drive(){

	}

	public Driver(Long id, String name) {
		this.id = id;
		this.fname = name;
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}



	@JsonIgnore
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
				.append("\"id\": \"").append(getId()).append("\",")
				.append("\"fname\": \"").append(getFname()).append("\",")
				.append("\"idNumber\": \"").append(getIdNumber()).append("\",")
				.append("\"car\": \"").append(getCar() == null ? "N/A" : getCar().getCarName()).append("\",")
				.append("\"carId\": \"").append(getCar() == null ? null : getCar().getId()).append("\",")
				.append("\"region\": \"").append(getRegion() == null ? "N/A" : getRegion().getName()).append("\",")
				.append("\"regionId\": \"").append(getRegion() == null ? null : getRegion().getId()).append("\",")
				.append("\"lname\": \"").append(getLname()).append("\"");

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



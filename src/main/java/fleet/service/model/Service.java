
package fleet.service.model;


import fleet.car.model.Car;

import fleet.vendor.model.Vendor;

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
				name = Service.NQ_ALL,
				query = "FROM Service s"
		),
		@NamedQuery(
				name = Service.NQ_FINDBYID,
				query = "FROM Service s WHERE s.id=:id"
		)
})
@Entity
@Table(name = "service_services")
@XmlRootElement
//@JsonInclude(Include.NON_EMPTY)
public class Service implements Serializable {

	public static final long SerialVersionUI=1L;

	@Transient
	public static final String NQ_ALL = "Service.All";

	@Transient
	public static final String NQ_FINDBYID = "Service.findById";

	/*@ManyToOne
	private Car car;
	@ManyToOne
	private Vendor vendor;
	@Transient
	private Long carId;*/



	@Column(name = "vendor_id")
	private String vendorId;



	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "service_date")
	private String serviceDate;

	@Column(name = "odometer")
	private String odometer;
	@Column(name = "service_completed")
	private String serviceCompleted;

	@Column(name = "reference_no")
	private String reference;
	@Column
	private String document;
	@Column
	private String comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	/*public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}*/



	public String getOdometer() {
		return odometer;
	}

	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}

	public String getServiceCompleted() {
		return serviceCompleted;
	}

	public void setServiceCompleted(String serviceCompleted) {
		this.serviceCompleted = serviceCompleted;
	}



	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	/*public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}*/

	public String getVendorId()
	{
		return vendorId;
	}

	public void setVendorId(String vendorId)
	{
		this.vendorId = vendorId;
	}

	//@JsonIgnore
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
				.append("\"id\": \"").append(getId()).append("\",")
				.append("\"serviceDate\": \"").append(getServiceDate()).append("\",")

				.append("\"serviceOdometer\": \"").append(getOdometer()).append("\",")
				.append("\"serviceCompleted\": \"").append(getServiceCompleted()).append("\",")

				.append("\"serviceReference\": \"").append(getReference()).append("\",")
				.append("\"serviceDocument\": \"").append(getDocument()).append("\",")

				/*.append("\"car\": \"").append(getCar() == null ? "N/A" : getCar().getCarName()).append("\",")
				.append("\"carId\": \"").append(getCar() == null ? null : getCar().getId()).append("\",")
				.append("\"vendor\": \"").append(getVendor() == null ? "N/A" : getVendor().getName()).append("\",")
				.append("\"vendorId\": \"").append(getVendorId()).append("\",")*/
				.append("\"vendorId\": \"").append(getVendorId()).append("\",")
				.append("\"serviceComments\": \"").append(getComment()).append("\"");
		sb.append("}");

		return sb.toString();



	}
}

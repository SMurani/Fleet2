/*
package fleet.service.model;





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

import car.model.Car;


@NamedQueries({
	@NamedQuery(
			name = Service.NQ_ALL,
			query = "FROM Service s"
	),
	@NamedQuery(
			name = Service.NQ_FINDBYID,
			query = "FROM service s WHERE s.id=:id"
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


	@ManyToOne
	private Car plate;
@ManyToOne
	private Vendor name;

	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column
	private String serviceDate;

	@Transient
	private Long carId;

	@Column
	private String odometer;

	@Column
	private String task;

	@Column(name = "vendor_id")
	private Long vendor_id;

	@Column(name = "invoice_no")
	private String invoiveNo;

	@Column
	private String document;

	@Column
	private String comments;

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

	public Car getPlate() {
		return plate;
	}

	public void setPlate(Car plate) {
		this.plate = plate;
	}



	public String getOdometer() {
		return odometer;
	}

	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Long getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(Long vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getInvoiveNo() {
		return invoiveNo;
	}

	public void setInvoiveNo(String invoiveNo) {
		this.invoiveNo = invoiveNo;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

*/
/*@JsonIgnore
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"serviceTo\": \"").append(getServiceTo()).append("\",")
			.append("\"serviceFrom\": \"").append(getServiceFrom()).append("\",")
			.append("\"serviceDescription\": \"").append(getServiceDescription()).append("\",")
			

			.append("\"servicecost\": \"").append(getServicecost()).append("\"");
		sb.append("}");
		
		return sb.toString();
	

	
}*//*


}
*/

package fleet.service.model;


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

	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "service_date")
	private String serviceDate;
	@Column(name = "car")
	private String car;
	@Column(name = "odometer")
	private String odometer;
	@Column(name = "service_completed")
	private String serviceCompleted;
	@Column
	private String vendor;
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

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

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

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
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

	//@JsonIgnore
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
				.append("\"id\": \"").append(getId()).append("\",")
				.append("\"serviceDate\": \"").append(getServiceDate()).append("\",")
				.append("\"serviceCar\": \"").append(getCar()).append("\",")
				.append("\"serviceOdometer\": \"").append(getOdometer()).append("\",")
				.append("\"serviceCompleted\": \"").append(getServiceCompleted()).append("\",")
				.append("\"serviceVendor\": \"").append(getVendor()).append("\",")
				.append("\"serviceReference\": \"").append(getReference()).append("\",")
				.append("\"serviceDocument\": \"").append(getDocument()).append("\",")

				.append("\"serviceComments\": \"").append(getComment()).append("\"");
		sb.append("}");

		return sb.toString();



	}
}

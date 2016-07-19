package fleet.driver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import fleet.common.model.Address;
@Entity
@Table(name = "driver_drivers")
public class Driver {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	@Column
	private String fname;
	@Column
	private String lname;
	@Column(name="id_no")
	private String idNo;
	@Column(name = "region_of_operation")
	private String regionOperation;
	@Column(name = "vehicle_assigned")
	private String vehicleAssigned;
	@Embedded
	private Address address;


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

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getRegionOperation() {
		return regionOperation;
	}

	public void setRegionOperation(String regionOperation) {
		this.regionOperation = regionOperation;
	}

	public String getVehicleAssigned() {
		return vehicleAssigned;
	}

	public void setVehicleAssigned(String vehicleAssigned) {
		this.vehicleAssigned = vehicleAssigned;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}


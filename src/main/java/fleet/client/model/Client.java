package fleet.client.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import fleet.common.model.Address;


@Entity
@Table(name = "client_clients")
public class Client {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Column(name = "client_name")
	private String clientName;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }


	@Column(name = "id_no")
	private String idNo;
	@Column(name = "registration_date")
	private String regitrationDate;
	@Embedded
	private Address address;


	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getRegitrationDate() {
		return regitrationDate;
	}

	public void setRegitrationDate(String regitrationDate) {
		this.regitrationDate = regitrationDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}


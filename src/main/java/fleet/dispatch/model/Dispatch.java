package fleet.dispatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "dispatch_dispatchs")
public class Dispatch {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




    @Column(name = "vehicle_id")
    private Long vehicle_id;
    @Column(name = "client_id")
    private Long client_id;
    @Column(name = "date_taken")
    private String dateTaken;
    @Column(name = "date_return")
    private  String dataReturn;
    @Column
    private String agreement;
    @Column
    private String comments;

    public Long getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public String getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(String dateTaken) {
        this.dateTaken = dateTaken;
    }

    public String getDataReturn() {
        return dataReturn;
    }

    public void setDataReturn(String dataReturn) {
        this.dataReturn = dataReturn;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}


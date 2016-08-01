package fleet.dispatch.model;

import fleet.car.model.Car;

import javax.persistence.*;


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

   /* public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }*/

    /*@ManyToOne
    private Car car;*/




    @Column(name = "car")
    private String car;
    @Column(name = "client")
    private String client;
    @Column(name = "date_taken")
    private String dateTaken;
    @Column(name = "date_return")
    private  String dataReturn;
    @Column
    private String agreement;
    @Column
    private String comments;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
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


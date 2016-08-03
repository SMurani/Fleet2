package fleet.car.model;



import javax.persistence.*;

/**
 * Created by sammy on 8/2/16.
 */
@Entity
@Table (name="car_booking")
public class CarBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String car;
    @Column
    private String booingDate;
    @Column
    private String returnDate;
    @Column
    private String status;
    @Column
    private String agreement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getBooingDate() {
        return booingDate;
    }

    public void setBooingDate(String booingDate) {
        this.booingDate = booingDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

}

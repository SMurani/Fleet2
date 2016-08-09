package fleet.car.model;



import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sammy on 8/2/16.
 */

@NamedQueries({
        @NamedQuery(
                name = CarBooking.NQ_ALL,
                query = "FROM CarBooking c"
        ),

})
@Entity
@Table (name="car_booking")
public class CarBooking implements Serializable{

    public static final long SerialVersionUI=1L;

    @Transient
    public static final String NQ_ALL = "CarBooking.All";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String car;
    @Column
    private String username;
    @Column
    private String userId;
    @Column
    private String booingDate;
    @Column
    private String returnDate;
    @Column
    private String purpose;
    @Column
    private String comments;

    @Column
    private String driver;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}

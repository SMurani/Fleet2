package fleet.car.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Console;

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
import javax.xml.bind.annotation.XmlRootElement;;

@NamedQueries({
	@NamedQuery(
			name = Car.NQ_ALL,
			query = "FROM Car c"
	),
	@NamedQuery(
			name = Car.NQ_FINDBYID,
			query = "FROM Car c WHERE c.id=:id"
	)
})

@Entity
@Table(name = "car_cars")
@XmlRootElement
public class Car {
	
public static final long SerialVersionUI=1L;
	
	@Transient
	public static final String NQ_ALL = "Car.All";
	
	@Transient
	public static final String NQ_FINDBYID = "Car.findById";
	
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Column(name = "car_name")
    private String carName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Column (name = "car_status" )
    private String Status;


    @Column(name = "car_comments")
    private String carDescription;

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }


    @Column(name = "car_owner")
    private String carOwner;

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    @Column(name = "vehicle_identification_no")
    private String VIN;
    @Column
    private String vehicleType;
    @Column
    private String year;
    @Column(name = "vehicle_make")

    private String make;
    @Column(name = "vehicle_model")

    private String model;
    @Column
    private String plateNo;
    @Column
    private String photo;

    public String getRegTown() {
        return regTown;
    }

    public void setRegTown(String regTown) {
        this.regTown = regTown;
    }

    @Column(name = "registration_Town")
    private String regTown;
    @Column
    private String color;
    @Column(name = "manufacturer_suggested_resale_price")
    private String MSRP;

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMSRP() {
        return MSRP;
    }

    public void setMSRP(String MSRP) {
        this.MSRP = MSRP;
    }
    



    @JsonIgnore
    public String getJson(){
        StringBuilder sb = new StringBuilder();
        sb.append("{")
                .append("\"id\": \"").append(getId()).append("\",")
                .append("\"carName\": \"").append(getCarName()).append("\",")
                .append("\"carComments\": \"").append(getCarDescription()).append("\",")
                .append("\"carOwner\": \"").append(getCarOwner()).append("\",")
                .append("\"carVIN\": \"").append(getVIN()).append("\",")
                .append("\"carType\": \"").append(getVehicleType()).append("\",")
                .append("\"carYear\": \"").append(getYear()).append("\",")
                .append("\"carMake\": \"").append(getMake()).append("\",")
                .append("\"carStatus\": \"").append(getStatus()).append("\",")
                .append("\"carModel\": \"").append(getModel()).append("\",")
                .append("\"carRegistrationTown\": \"").append(getRegTown()).append("\",")
                .append("\"carLicence\": \"").append(getPlateNo()).append("\",")
                .append("\"carPhoto\": \"").append(getPhoto()).append("\",")
                .append("\"carColor\": \"").append(getColor()).append("\",")

                .append("\"serviceComments\": \"").append(getMSRP()).append("\"");
        sb.append("}");

        return sb.toString();



    }
    
}


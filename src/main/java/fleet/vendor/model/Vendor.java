package fleet.vendor.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import fleet.common.model.Address;

@NamedQueries({
        @NamedQuery(
                name = Vendor.NQ_ALL,
                query = "FROM Vendor v"
        ),
        @NamedQuery(
                name = Vendor.NQ_FINDBYID,
                query = "FROM Vendor v WHERE v.id=:id"
        )
})
@Entity
@Table(name = "vendor_vendors")
@XmlRootElement
@JsonInclude(Include.NON_EMPTY)
public class Vendor implements Serializable{

    private static final long serialVersionUID = 1L;

    @Transient
    public static final String NQ_ALL = "Vendor.All";

    @Transient
    public static final String NQ_FINDBYID = "Vendor.findById";

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column
    private String name;


    @Column(name = "speciality", columnDefinition = "TEXT")
    private String speciality;

    @Embedded
    private Address address;

    public Vendor() {
    }

    public Vendor(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Address getAddress() {
        if(address ==  null)
            address = new Address();

        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @JsonIgnore
    public String getJson(){
        StringBuilder sb = new StringBuilder();
        sb.append("{")
                .append("\"id\": \"").append(getId()).append("\",")
                .append("\"name\": \"").append(getName()).append("\",")

                .append("\"speciality\": \"").append(getSpeciality()).append("\"");

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

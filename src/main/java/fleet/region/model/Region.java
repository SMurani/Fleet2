package fleet.region.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "region_regions")
public class Region {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Column(name = "region_name")
	private String regionName;

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }


    @Column(name = "region_description")
    private String regionDescription;

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }


    @Column(name = "region_manager")
    private String regionManager;

    public String getRegionManager() {
        return regionManager;
    }

    public void setRegionManager(String regionManager) {
        this.regionManager = regionManager;
    }






	@Column(name = "from_location")
	private Long  fromLocationId;
	
	@Column(name = "to_location")
	private Long toLocationId;
	
	@Column(name = "approx_distance")
	private Double distance;
	
	@Column(name = "approx_time")
	private Double ApproxTime;
	
	@Column(name = "comp_id")
	private Long companyId;
	
	public Long getFromLocationId() {
		return fromLocationId;
	}

	public void setFromLocationId(Long fromLocationId) {
		this.fromLocationId = fromLocationId;
	}

	public Long getToLocationId() {
		return toLocationId;
	}

	public void setToLocationId(Long toLocationId) {
		this.toLocationId = toLocationId;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getApproxTime() {
		return ApproxTime;
	}

	public void setApproxTime(Double approxTime) {
		ApproxTime = approxTime;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	
}


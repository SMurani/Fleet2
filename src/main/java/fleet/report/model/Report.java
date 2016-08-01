package fleet.report.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "report_reports")
public class Report {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Column(name = "report_name")
	private String reportName;

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }


    @Column(name = "report_description")
    private String reportDescription;

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }


    @Column(name = "report_manager")
    private String reportManager;

    public String getReportManager() {
        return reportManager;
    }

    public void setReportManager(String reportManager) {
        this.reportManager = reportManager;
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

	
}


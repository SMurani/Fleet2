package fleet.report.api;



import javax.ws.rs.Path;

import fleet.report.bean.ReportBeanI;
import fleet.report.model.Report;

@Path("/report")
public class ReportApi {
	
	private ReportBeanI reportBean;
	
	@Path("/add")
	public String add(Report report){
		reportBean.add(report);
		
		return "{success : true}";
	}
	

}


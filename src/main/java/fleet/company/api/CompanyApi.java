/*package fleet.company.api;
import javax.ws.rs.Path;

import fleet.company.bean.CompanyBeanI;
import fleet.company.model.Company;



@Path("/company")
public class CompanyApi {
	
	private CompanyBeanI companyBean;
	
	@Path("/add")
	public String add(Company company){
		
		companyBean.add(company);
		
		return "{success: true}";
	}

}*/

package fleet.company.api;
import javax.ws.rs.Path;

import fleet.company.bean.CompanyBeanI;
import fleet.company.model.Company;



@Path("/company")
public class CompanyApi {

	private CompanyBeanI companyBean;

	@Path("/add")
	public String add(Company company){

		companyBean.add(company);

		return "{success: true}";
	}

}


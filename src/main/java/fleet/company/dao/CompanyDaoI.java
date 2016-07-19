/*
package fleet.company.dao;

import java.util.List;

import javax.persistence.EntityManager;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDaoI;

public interface CompanyDaoI extends GenericDaoI<Company, Long>{
	

	Company add(Company company);
	
	Company load(Company company);
	
	*/
/*List<Company> list(Company filter);
	
	void delete(Long companyId);

	void setEm(EntityManager em);
*//*


}
*/

package fleet.company.dao;

import java.util.List;

import fleet.company.model.Company;
import fleet.generic.dao.GenericDaoI;

public interface CompanyDaoI extends GenericDaoI<Company, Long>{

	List<Company> active();

	List<Company> active2();

	Company findByIdNq(Long id);

	List<Company> sqlList();
}

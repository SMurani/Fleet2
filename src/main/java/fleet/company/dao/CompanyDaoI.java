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

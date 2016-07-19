/*
package fleet.company.bean;

import java.util.List;

import fleet.company.model.Company;

public interface CompanyBeanI {

	void add(Company company);

	List<Company> list();
	
	boolean delete(Long id);

}
*/

package fleet.company.bean;

import java.util.List;

import fleet.company.model.Company;

public interface CompanyBeanI {

	void add(Company company);

	String load(Long id);

	List<Company> list();

	boolean delete(Long id);

	String listInJson();

}

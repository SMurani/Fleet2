package fleet.report.dao;



import java.util.List;

import javax.persistence.EntityManager;

import fleet.generic.dao.GenericDaoI;
import fleet.report.model.Report;
import fleet.vendor.model.Vendor;

public interface ReportDaoI{


    EntityManager getEm();
	
	Report add(Report report);
	
	Report load(Report report);
	
	List<Report> list(Report filter);
	
	void delete(Long reportId);

	void setEm(EntityManager em);

}


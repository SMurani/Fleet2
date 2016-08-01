package fleet.report.bean;



import java.util.List;

import fleet.report.model.Report;;

public interface ReportBeanI {
	
	void add(Report report);
	
	List<Report> list();

	boolean delete(Long id);

}

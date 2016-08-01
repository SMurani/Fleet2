package fleet.report.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fleet.report.dao.ReportDaoI;
import fleet.report.model.Report;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ReportBean implements ReportBeanI{

	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private ReportDaoI reportDao;
	
	@PostConstruct
	public void init(){
		reportDao.setEm(em);
	}

	public void add(Report report) {
		if(report == null || report.getReportName() == null)
			return;
		reportDao.add(report);
		
	}

	public List<Report> list() {
		return reportDao.list(new Report());
	}

	public boolean delete(Long id) {
		reportDao.delete(id);

		return true;
	}

}


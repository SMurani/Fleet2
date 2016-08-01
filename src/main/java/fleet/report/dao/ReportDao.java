package fleet.report.dao;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

;
import fleet.generic.dao.GenericDao;
import fleet.report.model.Report;
import org.hibernate.Session;;
import org.hibernate.criterion.Restrictions;

public class ReportDao implements ReportDaoI{
	
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
		
	}

	public EntityManager getEm() {
		return null;
	}

	public Report add(Report report) {
		return em.merge(report);
	}

	public Report load(Report report) {
		// TODO Auto-generated method stub
		return null;
	}



	/*public List<Report> list(Report filter) {
		return em.createQuery("from Report r").getResultList();

	}
*/
	public List<Report> list(Report filter)  {
/*		Session session = (Session) getEm().getDelegate();

		List<Report> reports = new ArrayList<Report>();

		List<Object []> results = session.createSQLQuery("select id, name from report_reports")
				.list();

		Report report;
		for(Object [] result : results){
			report = new Report();
			if(result[0] != null)report.setId( ((BigInteger) result[0]).longValue());
			if(result[1] != null)report.setReportName( (String) result[1]);
			reports.add(report);


		}

		return reports;*/
		return em.createQuery("from Report r").getResultList();
	}
	public void delete(Long reportId)
	{
		em.remove(em.find(Report.class, reportId));
	}

	
}


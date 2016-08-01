package fleet.dispatch.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fleet.dispatch.dao.DispatchDaoI;
import fleet.dispatch.model.Dispatch;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DispatchBean implements DispatchBeanI{

	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private DispatchDaoI dispatchDao;
	
	@PostConstruct
	public void init(){
		dispatchDao.setEm(em);
	}

	public void add(Dispatch dispatch) {
		if(dispatch == null || dispatch.getClient() == null)
			return;
		dispatchDao.add(dispatch);
		
	}

	public List<Dispatch> list() {
		return dispatchDao.list(new Dispatch());
	}

	public boolean delete(Long id) {
		dispatchDao.delete(id);

		return true;
	}

}


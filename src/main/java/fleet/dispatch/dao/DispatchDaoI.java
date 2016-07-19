package fleet.dispatch.dao;



import java.util.List;

import javax.persistence.EntityManager;

import fleet.dispatch.model.Dispatch;

public interface DispatchDaoI {
	
	Dispatch add(Dispatch dispatch);
	
	Dispatch load(Dispatch dispatch);
	
	List<Dispatch> list(Dispatch filter);
	
	void delete(Long dispatchId);

	void setEm(EntityManager em);

}


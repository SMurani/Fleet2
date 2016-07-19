package fleet.dispatch.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import fleet.dispatch.model.Dispatch;;

public class DispatchDao implements DispatchDaoI{
	
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
		
	}

	public Dispatch add(Dispatch dispatch) {
		return em.merge(dispatch);
	}

	public Dispatch load(Dispatch dispatch) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Dispatch> list(Dispatch filter) {
		return em.createQuery("from Dispatch r").getResultList();
	}


	public void delete(Long dispatchId)
	{
		em.remove(em.find(Dispatch.class, dispatchId));
	}

	
}


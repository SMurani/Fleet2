package fleet.dispatch.bean;



import java.util.List;

import fleet.dispatch.model.Dispatch;;

public interface DispatchBeanI {
	
	void add(Dispatch dispatch);
	
	List<Dispatch> list();

	boolean delete(Long id);

}

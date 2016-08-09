package fleet.booking.bean;



import java.util.List;

import fleet.booking.model.Booking;;

public interface BookingBeanI {
	
	void add(Booking booking);
	
	List<Booking> list();

	boolean delete(Long id);
	boolean update (Long id);

	List<Booking> UserBook(String id);
	int countBooking();
	int countApproved();

}

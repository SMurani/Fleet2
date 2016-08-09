package fleet.booking.dao;



import java.util.List;

import javax.persistence.EntityManager;

import fleet.booking.model.Booking;

public interface BookingDaoI {
	
	Booking add(Booking booking);
	
	Booking load(Booking booking);
	
	List<Booking> list(Booking filter);

	void delete(Long bookingId);

	void setEm(EntityManager em);

	List<Booking> UserBook(String id);
	void update (Long id);
	int countBooking();
	int countApproved();

}


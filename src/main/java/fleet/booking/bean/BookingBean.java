package fleet.booking.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fleet.booking.dao.BookingDaoI;
import fleet.booking.model.Booking;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class BookingBean implements BookingBeanI{

	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private BookingDaoI bookingDao;
	
	@PostConstruct
	public void init(){
		bookingDao.setEm(em);
	}

	public void add(Booking booking) {
		if(booking == null || booking.getReturnDate() == null)
			return;
		bookingDao.add(booking);
		
	}

	public List<Booking> list() {
		return bookingDao.list(new Booking());
	}

	public boolean delete(Long id) {
		bookingDao.delete(id);

		return true;
	}

	public List<Booking> UserBook(String id) {

		return bookingDao.UserBook(id);
	}

	public int countBooking() {
		return bookingDao.countBooking();
	}

	public int countApproved() {
		return bookingDao.countApproved();
	}

	public boolean update(Long id) {
		bookingDao.update(id);
		return true;
	}


}


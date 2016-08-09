package fleet.booking.dao;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import fleet.booking.model.Booking;;

public class BookingDao implements BookingDaoI{
	
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
		
	}

	public Booking add(Booking booking) {
		return em.merge(booking);
	}

	public Booking load(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> list(Booking filter) {
		return em.createQuery("from Booking b").getResultList();
	}


	public void delete(Long bookingId)
	{
		em.remove(em.find(Booking.class, bookingId));
	}

	public List <Booking> UserBook (String id) {
		return em.createQuery("from Booking b where b.userId=:id").setParameter("id", id).getResultList();

	}

	public void update(Long id) {
		String hql1 = "UPDATE Booking b set b.status = '1' "  +
				"WHERE b.id = :id";


		Query query = em.createQuery(hql1).setParameter("id", id);
		query.executeUpdate();


	}
	public int countBooking() {
		List <BigInteger> result = em.createNativeQuery("select count(*) from booking_bookings").getResultList();
		return (result.get(0)).intValue();

	}
	public int countApproved() {
		List <BigInteger> result = em.createNativeQuery("select count(status) from booking_bookings b where b.status='2'").getResultList();
		return (result.get(0)).intValue();
	}



}


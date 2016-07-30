package com.indasil.springwork;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.indasil.springwork.domain.Reservation;
import com.indasil.springwork.hibernate.ReservationHibernateService;


@RunWith(SpringJUnit4ClassRunner.class)
//Multiple locations can be specified with comma delimited values
@ContextConfiguration(locations = {
     "/context-hibernate.xml"
     
})
@Transactional
public class ReservationHibernateTest {

	@Autowired
	private ReservationHibernateService reservationHibernateService;
	
	@Test
	@Rollback(false)
	public void reserve() {
		Reservation r = new Reservation();
		r.setName("Aditya");
		
		reservationHibernateService.reserve(r);
	}
	
	@Test
	@Rollback(false)
	public void update() {
		Reservation r = reservationHibernateService.getReservation(4L);
		r.setName("Nourish");
		
		reservationHibernateService.update(r);
	}
	
}

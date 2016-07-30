package com.indasil.springwork.hibernate;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indasil.springwork.domain.Reservation;

@Service
@Transactional
public class ReservationHibernateService  {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void reserve(Reservation r) {
		
		sessionFactory.getCurrentSession().save(r);
	}
	
 	public Reservation getReservation(Long id) {
 		return (Reservation) sessionFactory.getCurrentSession().load(Reservation.class, id);
 	}
	
	public void update(Reservation r) {
		sessionFactory.getCurrentSession().update(r);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Hibernate service ready!");
	}

}

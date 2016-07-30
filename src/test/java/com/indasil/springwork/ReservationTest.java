package com.indasil.springwork;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.indasil.springwork.domain.Reservation;
import com.indasil.springwork.mybatis.ReservationService;

@RunWith(SpringJUnit4ClassRunner.class)
//Multiple locations can be specified with comma delimited values
@ContextConfiguration(locations = {
     "/context.xml"
     
})
public class ReservationTest {

	@Autowired
	private ReservationService reservationService;
	
	@Test
	public void reserve() {
		Reservation r = new Reservation();
		r.setName("Aditya");
		
		reservationService.doReserve(r);
	}
	
}

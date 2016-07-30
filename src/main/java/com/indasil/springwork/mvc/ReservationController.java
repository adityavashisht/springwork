package com.indasil.springwork.mvc;

import com.indasil.springwork.hibernate.ReservationHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.indasil.springwork.domain.Reservation;

@Controller
@RequestMapping(value="/reservation")
public class ReservationController {

	@Autowired
	private ReservationHibernateService reservationHibernateService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String show(Model model) {
		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		
		return "reservation";
		
	}


	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<Reservation> save(@ModelAttribute Reservation reservation) {

		reservationHibernateService.reserve(reservation);
		return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
	}

}

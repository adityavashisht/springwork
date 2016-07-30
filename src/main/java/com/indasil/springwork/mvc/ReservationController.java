package com.indasil.springwork.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.indasil.springwork.domain.Reservation;

@Controller
@RequestMapping(value="/reservation")
public class ReservationController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String show(Model model) {
		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		
		return "reservation";
		
	}

}

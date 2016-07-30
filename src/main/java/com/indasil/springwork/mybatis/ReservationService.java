package com.indasil.springwork.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indasil.springwork.domain.Reservation;

@Service
@Transactional
public class ReservationService {
	
	@Autowired
	private ReservationMapper reservationMapper;
	
	public void doReserve(Reservation reservation) {
		reservationMapper.reserve(reservation);
	}

}

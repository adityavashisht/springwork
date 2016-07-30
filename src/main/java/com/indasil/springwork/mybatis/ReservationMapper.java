package com.indasil.springwork.mybatis;

import org.apache.ibatis.annotations.Param;

import com.indasil.springwork.domain.Reservation;

public interface ReservationMapper {
	
	void reserve(@Param("reservation") Reservation reservation);

}

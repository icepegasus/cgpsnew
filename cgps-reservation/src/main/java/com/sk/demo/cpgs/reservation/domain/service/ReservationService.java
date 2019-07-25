package com.sk.demo.cpgs.reservation.domain.service;

import com.sk.demo.cpgs.reservation.domain.model.Reservation;

public interface ReservationService {
	void reservate(Long restaurantId, Reservation reservation);
}

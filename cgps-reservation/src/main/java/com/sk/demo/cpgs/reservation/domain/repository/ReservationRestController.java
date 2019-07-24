package com.sk.demo.cpgs.reservation.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.demo.cpgs.reservation.domain.service.ReservationService;

@RestController
@RequestMapping("/v1/reservation")
public class ReservationRestController implements ReservationService {
	@Autowired
	private ReservationService reservationService;
	
	@Override
	@PutMapping("/{id}/reservated")
	public void reservate(@PathVariable("restaurantId") Long restaurantId) {
		reservationService.reservate(restaurantId);
	}

}

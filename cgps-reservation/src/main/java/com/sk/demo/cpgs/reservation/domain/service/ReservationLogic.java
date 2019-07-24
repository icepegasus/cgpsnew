package com.sk.demo.cpgs.reservation.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.demo.cpgs.reservation.application.proxy.feign.MenuProxy;
import com.sk.demo.cpgs.reservation.application.proxy.feign.dto.menu.Menu;
import com.sk.demo.cpgs.reservation.domain.model.Reservation;
import com.sk.demo.cpgs.reservation.domain.repository.ReservationRepository;

@Service("reservationLogic")
public class ReservationLogic implements ReservationService {
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Autowired
	private MenuProxy menuProxy;
		
	public void reservate(Long restaurantId) {
		Reservation reservaion = reservationRepository.findOne(restaurantId);
		
		if(reservaion == null) {
			System.err.println("no reservaion");
			return;
		}
		
		System.out.println("reservaion: " + reservaion.toString());
		
		if(reservaion.getReservated() == true) {
			System.err.println("already purchased");
			return;
		}
		
		//Menu menu = menuProxy.findById(reservaion.getRestaurantId());
		Menu menu = menuProxy.findByRestaurantName(reservaion.getRestaurantName());
		System.out.println("Buyer: " + menu.toString());
						
		//reservaion.setTotalPrice(order.getProductCount() * product.getPrice().getValue());
		reservaion.setCompleted(true);
		reservaion.setReservated(true);
		System.out.println("reservaion: " + reservaion.toString());
			
		reservationRepository.save(reservaion);
	}
}

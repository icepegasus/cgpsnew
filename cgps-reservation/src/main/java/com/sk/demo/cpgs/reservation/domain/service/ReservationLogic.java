package com.sk.demo.cpgs.reservation.domain.service;

import java.util.Date;

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
		
	public void reservate(Long restaurantId, Reservation reservation) {
//		Reservation reservaion = reservationRepository.findOne(restaurantId);
//		
//		if(reservaion == null) {
//			System.err.println("no reservaion");
//			return;
//		}
//		
//		System.out.println("reservaion: " + reservaion.toString());
//		
//		if(reservaion.getReservated() == true) {
//			System.err.println("already purchased");
//			return;
//		}
		
		
		Menu menu = menuProxy.findById(restaurantId);
		
		if(menu == null) {
			System.err.println("no menu");
			return;
		}
		//Menu menu = menuProxy.findByRestaurantName(reservaion.getRestaurantName());
		System.out.println("Menu: " + menu.toString());
						
		//reservaion.setTotalPrice(order.getProductCount() * product.getPrice().getValue());
		reservation.setCompleted(true);
		reservation.setReservated(true);
		reservation.setRegDate(new Date());
		reservation.setMenuId(menu.getMenuId());
		reservation.setRestaurantId(menu.getRestaurantId());
		reservation.setRestaurantName(menu.getRestaurantName());
		reservation.setMenuName(menu.getMenuName());
		reservation.setRestaurntAddress(menu.getRestaurntAddress());
		
		System.out.println("reservaion: " + reservation.toString());
			
		reservationRepository.save(reservation);
	}
}

package com.sk.demo.cpgs.reservation.domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sk.demo.cgps.reservation.shared.Address;
import com.sk.demo.cpgs.reservation.domain.base.AbstractEntity;
import com.sk.demo.cpgs.reservation.domain.base.AggregateRoot;

import lombok.Data;

@Data
@Entity
@Table(name = "reservation")
public class Reservation extends AbstractEntity implements AggregateRoot {
	private Long userId;
	private Long menuId;
	private String menuName;
	private Long restaurantId;
	private String restaurantName;
	private Address restaurntAddress;
	
	private Boolean completed = false;
	private Boolean reservated = false;
	private Date regDate;
	
	public Reservation(Long userId, Long menuId, String menuName, Long restaurantId, String restaurantName, Boolean completed , Date regDate) {
		this.userId = userId;
		this.menuId = menuId;
		this.menuName = menuName;
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.completed = completed;
		this.regDate = regDate;
	}
}

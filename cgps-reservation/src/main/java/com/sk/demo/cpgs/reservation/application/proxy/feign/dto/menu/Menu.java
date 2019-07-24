package com.sk.demo.cpgs.reservation.application.proxy.feign.dto.menu;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.sk.demo.cgps.reservation.shared.Address;
import com.sk.demo.cgps.reservation.shared.AbstractEntity;
import com.sk.sample.mall.shared.base.AggregateRoot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Menu extends AbstractEntity implements AggregateRoot {
	private Long restaurantId;
	private String restaurantName;
	private Long menuId;
	private String menuName;
	private Integer menuAmt;
	private Date regDate;	
	private Address restaurntAddress;
	
	public Menu(Long restaurantId, String restaurantName, Long menuId, String menuName, Integer menuAmt,Date regDateInteger) {
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuAmt = menuAmt;
		this.regDate = new Date();
	}
}


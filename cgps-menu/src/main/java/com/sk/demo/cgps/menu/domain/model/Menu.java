package com.sk.demo.cgps.menu.domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sk.demo.cgps.menu.domain.shared.AbstractEntity;
import com.sk.demo.cgps.menu.domain.shared.AggregateRoot;
import com.sk.demo.cgps.menu.domain.shared.Address;

import lombok.Data;

@Data
@Entity
@Table(name = "Menu")
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

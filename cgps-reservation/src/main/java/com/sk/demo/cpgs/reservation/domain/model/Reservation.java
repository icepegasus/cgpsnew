package com.sk.demo.cpgs.reservation.domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sk.demo.cpgs.reservation.domain.base.AbstractEntity;
import com.sk.demo.cpgs.reservation.domain.base.AggregateRoot;

import lombok.Data;

@Data
@Entity
@Table(name = "reservation")
public class Reservation extends AbstractEntity implements AggregateRoot {
	private Long userId;
	private Long menuId;
	
	private Boolean completed = false;
	private Date regDate;
	
	public Reservation(Long userId, Long menuId, Boolean completed , Date regDate) {
		this.userId = userId;
		this.menuId = menuId;
		this.completed = completed;
		this.regDate = regDate;
	}
}

package com.sk.demo.cpgs.score.domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sk.demo.cpgs.score.domain.base.AbstractEntity;
import com.sk.demo.cpgs.score.domain.base.AggregateRoot;

import lombok.Data;

@Data
@Entity
@Table(name = "score")
public class Score extends AbstractEntity implements AggregateRoot {
	private Long userId;
	private Long menuId;
	private Long Star;
	private Date regDate;
	
	public Score(Long userId, Long menuId, Long Star, Date regDate) {
		this.userId = userId;
		this.menuId = menuId;
		this.Star = Star;
		this.regDate = regDate;
	}
}

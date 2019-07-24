package com.sk.demo.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sk.demo.domain.base.AbstractEntity;
import com.sk.demo.domain.base.AggregateRoot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name = "usertable")
public class User   extends AbstractEntity implements AggregateRoot  {
	
	private String userid;
	private String password;
	private String name;
	private String phone;
	
	public User(String userid, String password, String name, String phone) {
		
		this.password = password;
		this.name = name;
		this.userid = userid;
		this.phone = phone;
	}
}

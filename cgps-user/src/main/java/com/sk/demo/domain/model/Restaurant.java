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
@Table(name = "restaurant")
public class Restaurant  extends AbstractEntity implements AggregateRoot {

	private String ceoid;
	private String password;
	private String name;
	private String phone;
	private Address address;
	
	public Restaurant(String ceoid, String password,String name, Address address) {
		this.ceoid = ceoid;
		this.password = password;
		this.name = name;
		this.address = address;
	}
}

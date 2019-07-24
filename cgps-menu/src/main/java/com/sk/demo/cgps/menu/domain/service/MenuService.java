package com.sk.demo.cgps.menu.domain.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sk.demo.cgps.menu.domain.model.Menu;

public interface MenuService {
	Menu findById(Long restaurantId);
	List<Menu> findAll();
	Page<Menu> findAll(Pageable pageable);
	
	List<Menu> findByRestaurantNameLike(String restaurantName);
	Menu findByRestaurantName(String restaurantName);
	Menu findByMenuName(String menuName);
	
	Menu register(Menu menu);
	Menu update(Long restaurantId, Menu menu);

	void delete(Long restaurantId);
}

package com.sk.demo.cpgs.reservation.application.proxy.feign;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.feign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.demo.cpgs.reservation.application.proxy.feign.dto.menu.Menu;

@Service
public class MenuProxy {
	@Autowired
	private MenuClient menuClient;
	
	public Menu findById(Long restaurantId) {
		return menuClient.findById(restaurantId).getContent();
	}

	public Collection<Menu> findAll() {
		return menuClient.findAll().getContent();
	}
	
	public Menu findByRestaurantName(String restaurantName) {
		return menuClient.findByRestaurantName(restaurantName);
	}
	
	public Menu findByMenuName(String restaurantName) {
		return menuClient.findByMenuName(restaurantName);
	}

	@FeignClient(name="menu", url="http://cgps-menu:8080", configuration=FeignClientConfiguration.class)
	interface MenuClient {
		@GetMapping("/v1/menu/{restaurantId}")
		Resource<Menu> findById(@PathVariable("restaurantId") Long restaurantId);
		
		@GetMapping("/v1/menu")
		Resources<Menu> findAll();
				
		@GetMapping("/v1/menu/search/findByRestaurantName")
		Menu findByRestaurantName(@RequestParam(value="restaurantName", required=true) String restaurantName);
		
		@GetMapping("/v1/menu/search/menu")
		Menu findByMenuName(@RequestParam(value="menuName", required=true) String menuName);
	}
}


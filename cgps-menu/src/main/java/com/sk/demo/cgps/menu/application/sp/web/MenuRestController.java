package com.sk.demo.cgps.menu.application.sp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sk.demo.cgps.menu.domain.model.Menu;
import com.sk.demo.cgps.menu.domain.service.MenuService;

@RestController
@RequestMapping("/v1/menu")
public class MenuRestController implements MenuService {
	@Autowired
	private MenuService menuService;

	@Override
	@GetMapping
	public List<Menu> findAll() {
		return menuService.findAll(); 
	}
	
	@Override
	@GetMapping("/{id}")
	public Menu findById(@PathVariable("restaurantId") Long restaurantId) {
		return menuService.findById(restaurantId);
	}

	@Override
	@PostMapping
	public Menu register(@RequestBody Menu menu) {
		return menuService.register(menu);
	}

	@Override
	@PutMapping("/{id}")
	public Menu update(@PathVariable("restaurantId") Long restaurantId, @RequestBody Menu menu) {
		return menuService.update(restaurantId, menu);
	}

	@Override
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("restaurantId") Long restaurantId) {
		menuService.delete(restaurantId);
	}
	
	@Override
	@GetMapping("/search/restaurant")
	public List<Menu> findByRestaurantNameLike(@RequestParam("restaurantName") String restaurantName) {
		return menuService.findByRestaurantNameLike(restaurantName);
	}
	
	@Override
	@GetMapping("/search/menu")
	public Menu findByMenuName(@RequestParam("menuName") String menuName) {
		return menuService.findByMenuName(menuName);
	}

	@Override
	//@GetMapping
	public Page<Menu> findAll(Pageable pageable) {
		return menuService.findAll(pageable); 
	}


}

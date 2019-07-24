package com.sk.demo.cgps.menu.domain.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sk.demo.cgps.menu.domain.model.Menu;
import com.sk.demo.cgps.menu.domain.repository.MenuRepository;

@Service("menuLogic")
public class MenuLogic implements MenuService {
	@Autowired
	private MenuRepository menuRepository;

	@Override
	@Transactional(readOnly=true)
	public Menu findById(Long restaurantId) {
		return menuRepository.findOne(restaurantId);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Menu> findByRestaurantNameLike(String restaurantName) {
		return menuRepository.findByRestaurantNameLike(restaurantName);
	}

	@Override
	@Transactional(readOnly=true)
	public Menu findByMenuName(String menuName) {
		return menuRepository.findByMenuName(menuName);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Menu> findAll() {
		return menuRepository.findAll();
	}

	
	@Override
	@Transactional(readOnly=true)
	public Page<Menu> findAll(Pageable pageable) {
		return menuRepository.findAll(pageable);
	}

	@Override
	@Transactional
	public Menu register(Menu account) {
		return menuRepository.save(account);
	}

	@Override
	@Transactional
	public Menu update(Long restaurantId, Menu newMenu) {
		Menu oldMenu = menuRepository.findOne(restaurantId);
		if(oldMenu != null) {
			BeanUtils.copyProperties(newMenu,  oldMenu, "restaurantId");
			return menuRepository.save(oldMenu);
		} else {
			return null;
		}
	}

	@Override
	@Transactional
	public void delete(Long restaurantId) {
		menuRepository.delete(restaurantId);
	}
}

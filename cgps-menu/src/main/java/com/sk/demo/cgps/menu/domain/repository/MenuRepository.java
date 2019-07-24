package com.sk.demo.cgps.menu.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.Predicate;
import com.sk.demo.cgps.menu.domain.model.Menu;

@RepositoryRestResource
public interface MenuRepository extends PagingAndSortingRepository<Menu, Long>,
											QueryDslPredicateExecutor<Menu> {
	
	
	Menu findByMenuName(@Param("menuName") String menuName);
	Menu findByRestaurantName(@Param("restaurantName") String restaurantName);
	List<Menu> findByRestaurantNameLike(@Param("restaurantName") String restaurantName);
	List<Menu> findAll();
		

	List<Menu> findAll(Predicate predicate); 
	//@Override
	//@RestResource(exported=false)
	//void delete(Menu menu);

}

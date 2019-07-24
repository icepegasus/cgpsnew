package com.sk.demo.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.demo.domain.model.Restaurant;

@RepositoryRestResource
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long> {

	Restaurant findByUserid(@Param("ceoid") String ceoid);
}

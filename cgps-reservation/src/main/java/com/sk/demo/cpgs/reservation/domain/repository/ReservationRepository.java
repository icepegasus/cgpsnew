package com.sk.demo.cpgs.reservation.domain.repository;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.Predicate;
import com.sk.demo.cpgs.reservation.domain.model.Reservation;


@RepositoryRestResource
public interface ReservationRepository extends PagingAndSortingRepository<Reservation, Long>,
                                           QueryDslPredicateExecutor<Reservation> {
	List<Reservation> findAll(Predicate predicate); 
	
	/*
	Reservation findByName(@Param("name") String name);
	List<Reservation> findByReservationDescriptionSizeType(@Param("sizeType") SizeType sizeType);
	List<Reservation> findByReservationDescriptionColorType(@Param("colorType") ColorType colorType);
	List<Reservation> findByPriceValueGreaterThanEqual(@Param("value") Integer value);
	List<Reservation> findByPriceValueLessThanEqual(@Param("value") Integer value);
	List<Reservation> findByPriceValueGreaterThanAndPriceValueLessThan(@Param("value1") Integer value1, @Param("value2") Integer value2);
	*/
}

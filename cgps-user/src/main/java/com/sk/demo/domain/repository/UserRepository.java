package com.sk.demo.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.demo.domain.model.User;

@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	User findByUserid(@Param("userid") String userid);
}

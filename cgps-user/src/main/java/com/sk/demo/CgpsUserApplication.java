package com.sk.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sk.demo.domain.model.Address;
import com.sk.demo.domain.model.Restaurant;
import com.sk.demo.domain.model.User;
import com.sk.demo.domain.repository.RestaurantRepository;
import com.sk.demo.domain.repository.UserRepository;

@SpringBootApplication
public class CgpsUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgpsUserApplication.class, args);
	}

	

	@Bean
	public CommandLineRunner createSampleData(UserRepository userRepository, RestaurantRepository restaurantRepository) {	
		return (args) -> {
			User user = new User("first", "one", "hello", "01012341234");
			userRepository.save(user);
			
			Address address = new Address(123,"경기도 고양시");
			Restaurant rest = new Restaurant("steak123", "one", "outback", address);
			restaurantRepository.save(rest);
			
			execute1(userRepository);
			execute2(restaurantRepository);
		};
	}
	
	public void displayUsers(UserRepository userRepository) {
		System.out.println("***************************************************************");
		
		Iterable<User> userList = userRepository.findAll();
		for(User user : userList) {
			System.out.println(user.toString());	
		}
		
		System.out.println("***************************************************************");
	}
	
	public void displayRestaurants(RestaurantRepository restaurantRepository) {
		System.out.println("***************************************************************");
		
		Iterable<Restaurant> restaurantList = restaurantRepository.findAll();
		for(Restaurant restaurant : restaurantList) {
			System.out.println(restaurant.toString());	
		}
		
		System.out.println("***************************************************************");
	}
	
	public void execute1(UserRepository userRepository) {
			
		User user = userRepository.findByUserid("first");
		user.setName("wonjae");
		
		userRepository.save(user);
		
		displayUsers(userRepository);	
	}
	
	public void execute2(RestaurantRepository restaurantRepository) {
		
		Restaurant restaurant = restaurantRepository.findByUserid("steak123");
		restaurant.setName("vips");
		
		restaurantRepository.save(restaurant);
		
		displayRestaurants(restaurantRepository);	
	}
}

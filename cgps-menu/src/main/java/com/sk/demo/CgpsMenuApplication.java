package com.sk.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sk.demo.cgps.menu.domain.model.Menu;
import com.sk.demo.cgps.menu.domain.repository.MenuRepository;
import com.sk.demo.cgps.menu.domain.shared.Address;

@SpringBootApplication
public class CgpsMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgpsMenuApplication.class, args);
	}
	/*
	@Bean
	public CommandLineRunner execSampleCode(MenuRepository menuRepository) {	
		return (args) -> {
			//insertAccounts(accountRepository);
			//displayAccounts(accountRepository);
			
			//executeExample1(accountRepository);
		};
	}
		
	public void insertAccounts(MenuRepository menuRepository) {
		
		Account account1 = new Account("hong@sk.com", "홍길동", MemberType.BUYER);
		accountRepository.save(account1);
		
		Account account2 = new Account("kang@sk.com", "강호동", MemberType.BUYER, MembershipLevelType.VIP);
		account2.setAddress(new Address(12345, "서울시 강남구"));
		accountRepository.save(account2);
		
		Account account3 = new Account("yu@gmail.com", "유재석", MemberType.SELLER);
		account3.setAddress(new Address(10000, "경기도 성남시"));
		accountRepository.save(account3);
		
		Account account4 = new Account("shin@sk.com", "신동엽", MemberType.BUYER, MembershipLevelType.GOLD);
		account4.setAddress(new Address(12345, "서울시 강남구"));
		accountRepository.save(account4);
	}
*/
}

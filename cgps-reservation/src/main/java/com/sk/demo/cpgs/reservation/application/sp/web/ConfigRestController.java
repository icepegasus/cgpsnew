package com.sk.demo.cpgs.reservation.application.sp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v1/config")
public class ConfigRestController  {


	
	@GetMapping
	public String config(@RequestParam(value="config") String config) {
		String configValue = System.getenv().getOrDefault(config,"");
        
        if (configValue == null) {
        	configValue = "";
        }
        
        return config+" :  "+configValue;
		
		
		
	}
}

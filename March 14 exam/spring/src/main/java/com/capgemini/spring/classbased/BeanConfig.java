package com.capgemini.spring.classbased;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.capgemini.spring")
public class BeanConfig {
	
	@Bean
	public List<Integer> listProvider(){
		return List.of(1,2,3,4);
	}
	
	@Bean(name = "hero")
	public Bike bikeProvider() {
		Bike bike = new Bike();
		bike.setBikeId(12);
		bike.setBikeName("Hero xtreem");
		bike.setColor("White");
		return bike;
	}
	
}

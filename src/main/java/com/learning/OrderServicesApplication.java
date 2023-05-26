package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.learning.repostiory.OrderRepository;

@SpringBootApplication
@EnableFeignClients
public class OrderServicesApplication implements CommandLineRunner{

	@Autowired
	private OrderRepository orderRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OrderServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 //System.out.println(orderRepository.findByName("candy"));
	// System.out.println(orderRepository.findByTotalPriceLessThan(5000d));
		System.out.println(orderRepository.getAllOrders());
	}
}

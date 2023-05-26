package com.learning.repostiory;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.learning.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
	
	List<OrderEntity> findByName(String name);
	List<OrderEntity> findByDate(LocalDate localDate);
	List<OrderEntity> findByTotalPriceLessThan(Double totalPrice);
	
	@Query("select entity from OrderEntity entity")//JPQL(Java Persistence Query Language)
	List<OrderEntity> getAllOrders();
}

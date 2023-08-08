package com.brunosouza.webservice_example.repositories;

import com.brunosouza.webservice_example.entities.OrderItem;
import com.brunosouza.webservice_example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

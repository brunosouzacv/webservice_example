package com.brunosouza.webservice_example.repositories;

import com.brunosouza.webservice_example.entities.Order;
import com.brunosouza.webservice_example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}

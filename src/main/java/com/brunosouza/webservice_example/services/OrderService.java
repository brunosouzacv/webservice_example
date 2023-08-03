package com.brunosouza.webservice_example.services;

import com.brunosouza.webservice_example.entities.Order;
import com.brunosouza.webservice_example.entities.User;
import com.brunosouza.webservice_example.repositories.OrderRepository;
import com.brunosouza.webservice_example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    public List<Order> findAll(){
        return repository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

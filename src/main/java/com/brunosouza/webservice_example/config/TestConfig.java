package com.brunosouza.webservice_example.config;

import com.brunosouza.webservice_example.entities.Order;
import com.brunosouza.webservice_example.entities.User;
import com.brunosouza.webservice_example.enums.OrderStatus;
import com.brunosouza.webservice_example.repositories.OrderRepository;
import com.brunosouza.webservice_example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user2, OrderStatus.CANCELED);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user1, OrderStatus.DELIVERED);
        userRepository.saveAll(Arrays.asList(user1,user2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}

package com.brunosouza.webservice_example.repositories;

import com.brunosouza.webservice_example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

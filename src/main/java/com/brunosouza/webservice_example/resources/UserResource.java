package com.brunosouza.webservice_example.resources;

import com.brunosouza.webservice_example.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Veronica", "veronica@gmail.com", "3599999999", "12345");
        return ResponseEntity.ok().body(user);
    }

}

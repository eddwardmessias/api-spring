package br.com.eddjava.api.controllers;

import br.com.eddjava.api.domain.User;
import br.com.eddjava.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        System.out.println("oii");
        System.out.println(id);
        User user = service.findById(id);
        System.out.println(user);
        return ResponseEntity.ok().body(service.findById(id));
    }
}
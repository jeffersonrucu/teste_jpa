package com.studiostg.artigos.controller;

import com.studiostg.artigos.model.bean.User;
import com.studiostg.artigos.model.dto.user.UserCreateDTO;
import com.studiostg.artigos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping
    public ResponseEntity index() {
        List<User> users = service.index();
        return ResponseEntity.ok().body(users);
    }

    @PostMapping()
    public ResponseEntity create(@RequestBody UserCreateDTO userDTO, UriComponentsBuilder uriBuilder) {
        User user = service.create(userDTO);
        URI uri = uriBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);
    }
    public void read() {}
    public void update() {}
    public void delete() {}
}

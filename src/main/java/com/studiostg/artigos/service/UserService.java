package com.studiostg.artigos.service;

import com.studiostg.artigos.model.bean.User;
import com.studiostg.artigos.model.dao.UserRepository;
import com.studiostg.artigos.model.dto.user.UserCreateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> index() {
        return repository.findAll();
    }

    public User create(UserCreateDTO userDTO) {
        User user = new User(userDTO.id_person(), userDTO.username(), userDTO.password(), userDTO.permission(), userDTO.inactive());
        repository.save(user);
        return user;
    }
    public void read() {}
    public void update() {}
    public void delete() {}
}

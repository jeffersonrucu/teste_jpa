package com.studiostg.artigos.model.dao;

import com.studiostg.artigos.model.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {}

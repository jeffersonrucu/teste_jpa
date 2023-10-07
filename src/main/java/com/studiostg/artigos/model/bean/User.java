package com.studiostg.artigos.model.bean;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity(name = "User")
@Table(name = "user")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long idPerson;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private Integer permission;

    @NotNull
    private Boolean inactive;

    public User() {}

    public User(Long idPerson, String username, String password, Integer permission, Boolean inactive) {
        this.idPerson = idPerson;
        this.username = username;
        this.password = password;
        this.permission = permission;
        this.inactive = inactive;
    }

    public User(Long id, Long idPerson, String username, String password, Integer permission, Boolean inactive) {
        this.id = id;
        this.idPerson = idPerson;
        this.username = username;
        this.password = password;
        this.permission = permission;
        this.inactive = inactive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }
}

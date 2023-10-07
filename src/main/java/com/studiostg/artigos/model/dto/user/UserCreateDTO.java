package com.studiostg.artigos.model.dto.user;

public record UserCreateDTO(
        String username,
        String password,
        Integer permission,
        Boolean inactive,
        Long id_person
) {}
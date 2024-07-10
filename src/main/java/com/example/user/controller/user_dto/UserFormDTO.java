package com.example.user.controller.user_dto;


import com.example.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Representa os dados de um usuário a serem recebidos no corpo da requisição.
 */
@Getter
@AllArgsConstructor
public class UserFormDTO {

    private long id;
    private String name;
    private int age;
    private String email;
    private Integer cpf;

    /**
     * Converte os dados do formulário em um objeto User.
     *
     * @return Objeto User criado a partir dos dados do formulário.
     */
    public User converter() {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        user.setCpf(cpf);
        return user;
    }
}

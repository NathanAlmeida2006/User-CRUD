package com.example.user.controller.user_dto;

import com.example.user.entity.User;

import lombok.Getter;

/**
 * Representa os dados de atualização de um usuário.
 */
@Getter
public class UptadeUserFormDTO {

    private long id;
    private String name;
    private String email;
    private Integer cpf;

    /**
     * Construtor que recebe um objeto User e extrai os dados relevantes para atualização.
     *
     * @param user Objeto User contendo os dados do usuário.
     */
    public UptadeUserFormDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        cpf = user.getCpf();

    }
}

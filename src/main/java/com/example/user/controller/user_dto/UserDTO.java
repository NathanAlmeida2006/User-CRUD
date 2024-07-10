package com.example.user.controller.user_dto;

import lombok.Getter;
import java.util.List;
import java.util.stream.Collectors;

import com.example.user.entity.User;

/**
 * Representa os dados de um usuário a serem enviados como resposta.
 */
@Getter
public class UserDTO {

    private long id;
    private String name;
    private String email;
    private Integer cpf;

    /**
     * Construtor que recebe um objeto User e extrai os dados relevantes.
     *
     * @param user Objeto User contendo os dados do usuário.
     */
    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        cpf = user.getCpf();
    }

    /**
     * Converte uma lista de objetos User em uma lista de objetos UserDTO.
     *
     * @param users Lista de usuários.
     * @return Lista de UserDTO contendo os dados dos usuários.
     */
    public static List<UserDTO> converter(List<User> users) {
        return users.stream().map(UserDTO::new).collect(Collectors.toList());
    }
}

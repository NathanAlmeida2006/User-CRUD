package com.example.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.user.controller.user_dto.UptadeUserFormDTO;
import com.example.user.controller.user_dto.UserDTO;
import com.example.user.controller.user_dto.UserFormDTO;
import com.example.user.entity.User;
import com.example.user.repository.UserRepository;

import jakarta.transaction.Transactional;

/**
 * Controlador REST para gerenciar usuários.
 */
@RestController // Indica que a classe é um controlador REST.
@RequestMapping("/users") // Define o caminho base para as rotas deste controlador.
public class ControllerUser {

    @Autowired // Injeta uma instância do UserRepository.
    private UserRepository userRepository;

    /**
     * Salva um novo usuário no banco de dados.
     *
     * @param form Dados do usuário no corpo da requisição.
     * @return Dados do usuário salvo.
     */
    @Transactional // Indica que o método deve ser executado dentro de uma transação.
    @PostMapping // Mapeia requisições POST para este método.
    public UserDTO toSave(@RequestBody UserFormDTO form) {
        User user = form.converter();
        userRepository.save(user); // Salva o usuário no banco de dados.
        return new UserDTO(user); // Retorna os dados do usuário como resposta.
    }

    /**
     * Retorna uma lista de todos os usuários.
     *
     * @return Lista de usuários.
     */
    @GetMapping // Mapeia requisições GET para este método.
    public List<UserDTO> toList() {
        List<User> users = userRepository.findAll();
        return UserDTO.converter(users);
    }

    /**
     * Atualiza os dados de um usuário com o ID especificado.
     *
     * @param id ID do usuário a ser atualizado.
     * @return Dados atualizados do usuário.
     */
    @Transactional // Indica que o método deve ser executado dentro de uma transação.
    @PutMapping("/{id}") // Mapeia requisições PUT para este método. O ID do usuário é passado como parâmetro na URL.
    public UptadeUserFormDTO toUpdate(@PathVariable Long id) {
        final Optional<User> optUser = userRepository.findById(id);
        if (optUser.isPresent()) {
            User user = optUser.get();
            userRepository.save(user); // Atualiza o usuário no banco de dados.
            return new UptadeUserFormDTO(user); // Retorna os dados atualizados do usuário como resposta.
        }

        System.out.println("User not found!"); // Se o usuário não for encontrado, imprime uma mensagem de erro.
        return null;
    }

    /**
     * Deleta o usuário com o ID especificado.
     *
     * @param id ID do usuário a ser deletado.
     */
    @Transactional // Indica que o método deve ser executado dentro de uma transação.
    @DeleteMapping("/{id}") // Mapeia requisições DELETE para este método. O ID do usuário é passado como parâmetro na URL.
    public void toDelete(@PathVariable Long id) {
        final Optional<User> optUser = userRepository.findById(id);

        if (optUser.isPresent()) {
            userRepository.deleteById(id); // Deleta o usuário do banco de dados.
        }
    }
}

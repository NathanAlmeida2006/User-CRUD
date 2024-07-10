package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.entity.User;

/**
 * Interface UserRepository.
 * <p>
 * Esta interface é um repositório Spring Data JPA para a entidade User.
 * </p>
 * <p>
 * Fornece métodos CRUD e consultas padrão para a entidade User.
 * </p>
 * 
 * @Repository Anotação que indica que esta interface é um componente Spring de repositório.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

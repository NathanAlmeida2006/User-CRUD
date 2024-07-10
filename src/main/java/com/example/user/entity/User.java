package com.example.user.entity;

import jakarta.persistence.Entity; 
import jakarta.persistence.Id; 
import lombok.*; 

/**
 * Classe que representa a entidade User no sistema.
 * <p>
 * Esta classe é uma entidade JPA que mapeia para uma tabela no banco de dados.
 * Utiliza anotações do Lombok para geração automática de métodos comuns como getters, setters,
 * toString, equals e hashCode, além de construtores.
 * </p>
 * <p>
 * As propriedades incluem um identificador único, nome, email e CPF do usuário.
 * </p>
 * 
 * @Entity Anotação que indica que esta classe é uma entidade JPA.
 * @Getter Anotação do Lombok que gera automaticamente os métodos getter para todos os campos da classe.
 * @Setter Anotação do Lombok que gera automaticamente os métodos setter para todos os campos da classe.
 * @ToString Anotação do Lombok que gera automaticamente o método toString para a classe.
 * @NoArgsConstructor Anotação do Lombok que gera automaticamente um construtor sem argumentos.
 * @AllArgsConstructor Anotação do Lombok que gera automaticamente um construtor com argumentos para todos os campos da classe.
 * @EqualsAndHashCode Anotação do Lombok que gera os métodos equals(), hashCode() e também um método canEqual() para verificar se o objeto comparado é uma instância da mesma classe.
 * 
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {

  /**
   * Identificador único do usuário.
   * <p>
   * Este campo é a chave primária da entidade.
   * </p>
   * 
   * @Id Anotação que indica que o campo 'id' é a chave primária da entidade.
   */
  @Id
  private long id; 

  /**
   * Nome do usuário.
   * <p>
   * Este campo não pode ser nulo.
   * </p>
   * 
   * @NonNull Anotação que indica que o campo não pode ser nulo.
   */
  @NonNull
  private String name; 

  /**
   * Email do usuário.
   * <p>
   * Este campo não pode ser nulo.
   * </p>
   * 
   * @NonNull Anotação que indica que o campo não pode ser nulo.
   */
  @NonNull
  private String email; 

  /**
   * CPF do usuário.
   * <p>
   * Este campo não pode ser nulo.
   * </p>
   * 
   * @NonNull Anotação que indica que o campo não pode ser nulo.
   */
  @NonNull
  private Integer cpf; 
}

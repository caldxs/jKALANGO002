package com.jcalango.api.jogadores;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="jogador")
@Entity(name="jogador")
@Getter
@NoArgsConstructor  //JPA - solicita um constrututor vazio
@EqualsAndHashCode( of = "id") //comparar objetos, collections
public class Jogador {
    //única, imutável, universal
    //auto - flexibidade
 
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String nickNome;
    private String email;
    private String telefone;
    private String senha;
}
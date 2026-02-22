package com.example.api.domain.usuario;

import jakarta.persistence.*;
import lombok.*;

@Table(name="usuarios")
@Entity(name="usuarios")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String nome;

    private String email;

    private String senha;

    private String tipo;

    public Usuario(ResquestUsers resquestUsers){
        this.nome = resquestUsers.nome();
        this.email = resquestUsers.email();
        this.senha = resquestUsers.senha();
        this.tipo = resquestUsers.tipo();
    }
}

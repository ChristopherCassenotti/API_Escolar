package com.example.api.controllers;

import com.example.api.domain.usuario.ResquestUsers;
import com.example.api.domain.usuario.Usuario;
import com.example.api.domain.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsersController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public ResponseEntity getAllUsers(){
        var allUsers = repository.findAll();
        return ResponseEntity.ok(allUsers);
    }

    @PostMapping
    public ResponseEntity registerNewUsers(@RequestBody @Valid ResquestUsers data){
        Usuario newUser = new Usuario(data);
        repository.save(newUser);
        return ResponseEntity.ok().build();
    }
}

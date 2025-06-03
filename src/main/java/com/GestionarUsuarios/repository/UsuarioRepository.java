package com.GestionarUsuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionarUsuarios.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}


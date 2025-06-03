package com.GestionarUsuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionarUsuarios.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
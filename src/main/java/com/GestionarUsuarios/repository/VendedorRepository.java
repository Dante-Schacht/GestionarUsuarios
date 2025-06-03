package com.GestionarUsuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionarUsuarios.models.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}

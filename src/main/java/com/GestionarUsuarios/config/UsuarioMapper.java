package com.GestionarUsuarios.config;

import org.springframework.stereotype.Component;

import com.GestionarUsuarios.dto.UsuarioDTO;
import com.GestionarUsuarios.models.Usuario;

@Component
public class UsuarioMapper {
    public UsuarioDTO usuarioToDto(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setIdUsuario(usuario.getIdUsuario());
        dto.setNombreUsuario(usuario.getNombreUsuario());
        dto.setEmail(usuario.getEmail());
        dto.setRol(usuario.getRol());
        dto.setEstado(usuario.getEstado());
        return dto;
    }
}
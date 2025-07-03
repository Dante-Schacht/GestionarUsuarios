package com.GestionarUsuarios.assembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.GestionarUsuarios.controllers.UsuarioController;
import com.GestionarUsuarios.dto.UsuarioDTO;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class UsuarioAssembler implements RepresentationModelAssembler<UsuarioDTO, EntityModel<UsuarioDTO>> {

    @Override
    public EntityModel<UsuarioDTO> toModel(UsuarioDTO usuario) {
        return EntityModel.of(usuario,
                linkTo(methodOn(UsuarioController.class).getById(usuario.getIdUsuario())).withSelfRel(),
                linkTo(methodOn(UsuarioController.class).getAll()).withRel("usuarios"));
    }
}

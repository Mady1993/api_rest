package com.foro.hub.api_rest.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
/*
    UserDetails findByLogin(String username);
 */
}
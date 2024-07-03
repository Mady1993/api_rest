package com.foro.hub.api_rest.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {


    Page<Topico> findBySinRespuestaTrue(Pageable paginacion);
}
package com.foro.hub.api_rest.domain.topico;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        Curso curso
) {
}

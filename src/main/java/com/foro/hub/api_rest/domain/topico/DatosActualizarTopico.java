package com.foro.hub.api_rest.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(

        @NotNull
        Long id,
        String titulo,
        String mensaje,
        String autor,
        Curso curso
) {
}

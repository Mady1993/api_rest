package com.foro.hub.api_rest.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(

        @NotBlank(message = "El titulo no puede estar vacío")
        String titulo,

        @NotBlank(message = "El mensaje puede estar vacio")
        String mensaje,

        @NotBlank(message = "El autor no puede estar vacio")
        String autor,

        @NotNull(message = "El curso no puede estar vacio")
        Curso curso

) {
}

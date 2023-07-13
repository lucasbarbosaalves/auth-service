package com.lucasalves.authservice.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegisterDTO(
        @NotNull(message = "O campo 'firstName' não pode estar em branco")
        @Size(min = 4, max = 24)
        String firstName,

        @NotNull(message = "O campo 'lastName' não pode estar em branco")
        @Size(min = 4, max = 24)
        String lastName,

        @NotNull(message = "O campo 'login' não pode estar em branco")
        String login,

        @NotNull(message = "O campo 'password' não pode estar em branco")
        @Size(min = 8, max = 64)
        //@Pattern(regexp = "/^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$/\r\n")
        String password,

        @NotNull(message = "O campo 'role' não pode ser nulo")
        UserRole role
) {

}


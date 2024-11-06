package com.example.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    private String firstname;
    @NotEmpty(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    private String lastname;
    @Email(message = "Email is not formatted")
    @NotEmpty(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    private String email;
    @NotEmpty(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 8, message = "Size should be 8 characters")
    private String password;
}

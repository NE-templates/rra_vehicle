package com.trex.rra_vehicle.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "Name is required")
    private String names;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(
            regexp = "^(\\+250|250|07)[0-9]{9}$",
            message = "Phone must start with +2507, 2507 or 07"
    )
    private String phone;

    @NotBlank(message = "National ID is required")
    @Pattern(
            regexp = "^[0-9]{16}$",
            message = "National ID must be exactly 16 digits"
    )
    private String nationalId;

    @NotBlank(message = "Address is required")
    @Pattern(
            regexp = "^[A-Za-z0-9\\s,.'-]{3,}$",
            message = "Invalid address format"
    )
    private String address;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*]).{6,}$",
            message = "Password must contain at least one letter, one number, and one special character"
    )
    private String password;
}

package com.martins.eduinvest.dto.requestdto;

import com.martins.eduinvest.enums.AdminRole;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserInviteDto {

    @NotBlank(message = "First Name is required")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    private String lastName;


    @Size(max = 100)
    @NotBlank(message = "Email Name is required")
    @Email(message = "A valid email is required")
    @Column(unique = true)
    private String email;

    @NotNull
    @NotBlank(message = "Password Name is required")
    @Size(max = 20, message = "Password must be less than or equal to 20 characters")
    @Size(min = 8, message = "Password must be more than or equal to 8 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+=]).{8,}$", message = "Password must contain at least 8 characters, one digit, one lowercase letter, one uppercase letter, and one special character")
    private String password;

    private String phoneNumber;

    @Enumerated
    private AdminRole adminRole;
}
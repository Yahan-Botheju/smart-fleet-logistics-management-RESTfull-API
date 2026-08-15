package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.web.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserRequestDTO {
    @NotBlank(message = "Username cannot be empty")
    private String username;
    @Email
    @NotBlank(message = "Email cannot be empty")
    private String email;
    @NotBlank(message = "Password cannot be empty")
    private String password;

    private Roles role;
}

package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.models;

import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.enums.Roles;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {
    private UUID userId;
    private String username;
    private String email;
    private String passwordHashed;
    private Roles role;
    private boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public User(UUID userId, String username, String email, String passwordHashed, Roles role, boolean isActive, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.passwordHashed = passwordHashed;
        this.role = role;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /* __DOMAIN_BUSINESS_LOGICS__ */

    //user activate
    public void activate() {
        this.isActive = true;
        this.updatedAt = LocalDateTime.now();
    }

    //deactivate user
    public  void deActivate() {
        this.isActive = false;
        this.updatedAt = LocalDateTime.now();
    }

    /* __GETTERS_SETTERS__ */

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHashed() {
        return passwordHashed;
    }

    public void setPasswordHashed(String passwordHashed) {
        this.passwordHashed = passwordHashed;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}

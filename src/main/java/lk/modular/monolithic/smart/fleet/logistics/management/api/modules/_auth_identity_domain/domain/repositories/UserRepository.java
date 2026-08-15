package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.repositories;

import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository{

    //user find by id
    Optional<User> findById(UUID userId);

    //user find by email
    Optional<User> findByEmail(String email);

    //check user existence
    Boolean existsByEmail(String email);

    //save user
    User save(User user);
}

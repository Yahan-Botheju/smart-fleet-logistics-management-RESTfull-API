package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.repositories;

import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository{

    //user find by id
    Optional<User> findById(UUID userId);

    //save user
    User save(User user);
}

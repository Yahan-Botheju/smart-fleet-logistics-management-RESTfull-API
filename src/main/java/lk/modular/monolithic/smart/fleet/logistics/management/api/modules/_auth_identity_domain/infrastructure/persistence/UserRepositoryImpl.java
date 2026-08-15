package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence;

import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.repositories.UserRepository;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.jpa.JpaUserRepository;

public class UserRepositoryImpl implements UserRepository {

    //inject required dependencies
    private final JpaUserRepository jpaUserRepository;
    private final UserRepository userRepository;

    public UserRepositoryImpl(
            JpaUserRepository jpaUserRepository,
            UserRepository userRepository
    ) {
        this.jpaUserRepository = jpaUserRepository;
        this.userRepository = userRepository;
    }
}

package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence;

import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.models.User;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.repositories.UserRepository;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.entities.UserEntity;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.jpa.JpaUserRepository;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.persistenceMapper.UserPersistenceMapper;

import java.util.Optional;
import java.util.UUID;

public class UserRepositoryImpl implements UserRepository {

    //inject required dependencies
    private final JpaUserRepository jpaUserRepository;
    private final UserPersistenceMapper userPersistenceMapper;

    public UserRepositoryImpl(
            JpaUserRepository jpaUserRepository,
            UserPersistenceMapper userPersistenceMapper
    ) {
        this.jpaUserRepository = jpaUserRepository;
        this.userPersistenceMapper = userPersistenceMapper ;
    }

    /* __HELPER_METHODS__ */

    //user find by id
    @Override
    public Optional<User> findById(UUID userId) {
        return jpaUserRepository.findById(userId)
                .map(userPersistenceMapper::toDomainModel);
    }

    //user find by email
    @Override
    public Optional<User> findByEmail(String email) {
        return jpaUserRepository.findByEmail(email)
                .map(userPersistenceMapper::toDomainModel);
    }

    //check user existence by email
    @Override
    public Boolean existsByEmail(String email) {
        return jpaUserRepository.existsByEmail(email);
    }




    /* __PUBLIC_METHODS__ */


    //save user
    @Override
    public User save(User user) {
        UserEntity convertEntity = userPersistenceMapper.toEntity(user);
        UserEntity savedEntity = jpaUserRepository.save(convertEntity);

        return userPersistenceMapper.toDomainModel(savedEntity);
    }
}

package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure._configs.persistenceBeanConfigs;

import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.repositories.UserRepositoryPort;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.UserRepositoryPortImpl;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.jpa.JpaUserRepository;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.persistenceMapper.UserPersistenceMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceBeanConfigs {

    //user persistence bean config
    @Bean
    public UserRepositoryPort userRepository(
            JpaUserRepository jpaUserRepository,
            UserPersistenceMapper userPersistenceMapper
    ){
        return new UserRepositoryPortImpl(jpaUserRepository, userPersistenceMapper);
    }
}

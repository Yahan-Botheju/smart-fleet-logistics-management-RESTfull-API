package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure._configs.persistenceBeanConfigs;

import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.repositories.UserRepository;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.UserRepositoryImpl;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.jpa.JpaUserRepository;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.persistenceMapper.UserPersistenceMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceBeanConfigs {

    //user persistence bean config
    @Bean
    public UserRepository userRepository(
            JpaUserRepository jpaUserRepository,
            UserPersistenceMapper userPersistenceMapper
    ){
        return new UserRepositoryImpl(jpaUserRepository, userPersistenceMapper);
    }
}

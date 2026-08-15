package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.persistenceMapper;

import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.models.User;
import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.infrastructure.persistence.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserPersistenceMapper {
    //domain model to entity
    UserEntity toEntity(User user);

    //entity to domain model
    User toDomainModel(UserEntity userEntity);
}

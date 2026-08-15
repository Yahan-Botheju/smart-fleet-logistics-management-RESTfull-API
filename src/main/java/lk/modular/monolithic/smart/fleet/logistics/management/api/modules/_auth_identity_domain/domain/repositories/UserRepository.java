package lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.repositories;

import lk.modular.monolithic.smart.fleet.logistics.management.api.modules._auth_identity_domain.domain.models.User;

public interface UserRepository{

    //save user
    User save(User user);
}

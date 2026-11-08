package low_level_design.inventory_update_service.repository;


import low_level_design.inventory_update_service.entity.User;

import java.util.Optional;

public interface UserRepository {
    void save(User user);
    Optional<User> findById(String userId);
}
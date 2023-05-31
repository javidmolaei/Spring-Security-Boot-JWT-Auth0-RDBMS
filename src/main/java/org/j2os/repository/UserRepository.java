package org.j2os.repository;

import org.j2os.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Javid Molaei
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}

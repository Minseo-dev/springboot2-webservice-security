package io.wisoft.springsecurity.persistence;

import io.wisoft.springsecurity.domain.posts.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    UserEntity findByEmail(String email);

}

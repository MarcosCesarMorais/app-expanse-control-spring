package br.com.mcm.app_expanse_control.infrastructure.repositories;

import br.com.mcm.app_expanse_control.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CustomJpaRepository <UserEntity, String>{

    Optional<UserEntity> findByEmail(String email);
}

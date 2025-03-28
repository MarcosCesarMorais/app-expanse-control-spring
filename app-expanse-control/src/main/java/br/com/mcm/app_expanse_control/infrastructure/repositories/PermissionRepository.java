package br.com.mcm.app_expanse_control.infrastructure.repositories;

import br.com.mcm.app_expanse_control.domain.entities.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<PermissionEntity, String> {
}

package br.com.mcm.app_expanse_control.applications;

import br.com.mcm.app_expanse_control.domain.entities.GroupEntity;
import br.com.mcm.app_expanse_control.domain.entities.PermissionEntity;
import br.com.mcm.app_expanse_control.domain.exceptions.NotFoundException;
import br.com.mcm.app_expanse_control.infrastructure.repositories.PermissionRepository;

public class PermissionService {

    private PermissionRepository permissionRepository;

    public PermissionEntity searchOrFail(String permissionId) {
        return permissionRepository.findById(permissionId)
                .orElseThrow(() -> NotFoundException.with(permissionId,"teste"));
    }

}

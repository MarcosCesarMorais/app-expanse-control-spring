package br.com.mcm.app_expanse_control.applications;

import br.com.mcm.app_expanse_control.domain.entities.GroupEntity;
import br.com.mcm.app_expanse_control.domain.exceptions.NotFoundException;
import br.com.mcm.app_expanse_control.infrastructure.repositories.GroupRepository;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    private GroupRepository groupRepository;

    public GroupEntity searchOrFail(String groupId) {
        return groupRepository.findById(groupId)
                .orElseThrow(() -> NotFoundException.with(groupId,"teste"));
    }
}

package br.com.mcm.app_expanse_control.applications;

import br.com.mcm.app_expanse_control.domain.entities.GroupEntity;
import br.com.mcm.app_expanse_control.domain.entities.UserEntity;
import br.com.mcm.app_expanse_control.domain.exceptions.NotFoundException;
import br.com.mcm.app_expanse_control.infrastructure.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Logger;

@Service
public class UserService  {

    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());
    private final String FINE = "Usuário cadastrado com sucesso";
    private final String WARNING = "Erro ao cadastrar o usuario";

    private UserRepository userRepository;
    private GroupService groupService;

    public UserService(UserRepository userRepository, GroupService groupService) {
        this.userRepository = userRepository;
        this.groupService = groupService;
    }

    @Transactional
    public UserEntity save(UserEntity userEntity) {
        userRepository.detach(userEntity);

        Optional<UserEntity> existingUser = userRepository.findByEmail(userEntity.getEmail());

        if (existingUser.isPresent() && !existingUser.get().equals(userEntity)) {
            LOGGER.warning(WARNING + "Já existe um usuário cadastrado com o e-mail -> " +userEntity.getEmail());
            throw NotFoundException.with("Já existe um usuário cadastrado com o e-mail %s", userEntity.getEmail());
        }

        LOGGER.fine(FINE + userEntity.getUserId());
        return userRepository.save(userEntity);
    }

    @Transactional
    public void disassociateGroup(String userId, String groupId) {
        UserEntity userEntity = searchOrFail(userId);
        GroupEntity groupEntity = groupService.searchOrFail(groupId);

        userEntity.removeGroup(groupEntity);
    }

    @Transactional
    public void associateGroup(String userId, String groupId) {
        UserEntity userEntity = searchOrFail(userId);
        GroupEntity groupEntity = groupService.searchOrFail(groupId);

        userEntity.addGroup(groupEntity);
    }

    public UserEntity searchOrFail(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> NotFoundException.with(userId,"teste"));
    }

}

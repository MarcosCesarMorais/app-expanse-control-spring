package br.com.mcm.app_expanse_control.infrastructure.persistence.persistence.mapper;

import br.com.mcm.app_expanse_control.domain.models.user.User;
import br.com.mcm.app_expanse_control.domain.entities.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserPersistenceMapper {

    UserEntity toUserEntity(User user);

    User toUser(UserEntity entity);

    List<User> toUsertList(List<UserEntity> entityList);

}

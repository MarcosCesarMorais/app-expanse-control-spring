package br.com.mcm.app_expanse_control.infrastructure.controllers.dto.mapper;


import br.com.mcm.app_expanse_control.domain.entities.UserEntity;
import br.com.mcm.app_expanse_control.infrastructure.controllers.dto.request.UserCreateRequest;
import br.com.mcm.app_expanse_control.infrastructure.controllers.dto.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserRestMapper {

    UserEntity toUser(UserCreateRequest request);

    UserResponse toUserResponse(UserEntity user);

    List<UserResponse> toUserResponseList(List<UserEntity> UserList);
}

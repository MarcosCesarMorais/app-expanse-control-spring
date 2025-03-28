package br.com.mcm.app_expanse_control.infrastructure.controllers;

import br.com.mcm.app_expanse_control.infrastructure.controllers.dto.request.UserCreateRequest;
import br.com.mcm.app_expanse_control.infrastructure.controllers.dto.response.UserResponse;
import br.com.mcm.app_expanse_control.infrastructure.controllers.dto.mapper.UserRestMapper;
import br.com.mcm.app_expanse_control.infrastructure.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;
    private final UserRestMapper userRestMapper;

    public UserController(UserRepository repository, UserRestMapper userRestMapper) {
        this.repository = repository;
        this.userRestMapper = userRestMapper;
    }

    @PostMapping("/v1/api")
    public ResponseEntity<UserResponse> save(@Valid @RequestBody UserCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userRestMapper.toUserResponse(
                        repository.save(userRestMapper.toUser(request))));
    }
}

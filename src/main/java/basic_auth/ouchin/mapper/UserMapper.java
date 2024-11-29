package basic_auth.ouchin.mapper;

import basic_auth.ouchin.dao.request.UserCreateRequest;
import basic_auth.ouchin.dao.response.UserResponse;
import basic_auth.ouchin.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Mapper(componentModel = "spring",
        uses = {PasswordEncoder.class},
        imports = {Set.class})
public interface UserMapper {
    @Mapping(target = "password",
            expression = "java(passwordEncoder.encode(request.getPassword()))")
    User toEntity(UserCreateRequest request);

    UserResponse toResponse(User user);

    @Mapping(target = "roles",
            expression = "java(user.getRoles() != null ? user.getRoles() : Set.of())")
    UserResponse mapToResponse(User user);
}

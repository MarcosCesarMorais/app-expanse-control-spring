package br.com.mcm.app_expanse_control.user;

import br.com.mcm.app_expanse_control.UnitTest;
import br.com.mcm.app_expanse_control.domain.models.group.Group;
import br.com.mcm.app_expanse_control.domain.models.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class UserTest extends UnitTest {

    @Test
    public void givenAValidParams_whenCallNewUser_thenInstantiateAUser() {
        final var expectedName = "Fabricio";
        final var expectedEmail = "fabricio@gmail.com";
        final var expectedPassword = "123";
        Set<Group> groups = new HashSet<>();

        final var actualUser =
                User.newUser(expectedEmail,expectedPassword,expectedName,groups);

        Assertions.assertNotNull(actualUser);
        Assertions.assertNotNull(actualUser.getUserId());
        Assertions.assertEquals(expectedName, actualUser.getName());
        Assertions.assertEquals(expectedEmail, actualUser.getEmail());
        Assertions.assertNotNull(actualUser.getCreatedAt());
        Assertions.assertNotNull(actualUser.getUpdatedAt());
    }
}
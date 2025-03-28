package br.com.mcm.app_expanse_control.infrastructure.controllers.dto.request;

import java.util.Objects;

public class UserCreateRequest {

    private String email;

    private String name;

    public UserCreateRequest(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserCreateRequest that = (UserCreateRequest) o;
        return Objects.equals(email, that.email) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name);
    }
}

package br.com.mcm.app_expanse_control.domain.entities;

import br.com.mcm.app_expanse_control.utils.IdUtils;
import br.com.mcm.app_expanse_control.utils.InstantUtils;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Users")
public class UserEntity {

    @Id
    @Column(name = "user_id",nullable = false)
    private String userId;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    @ManyToMany
    @JoinTable(
            name = "user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<GroupEntity> groups = new HashSet<>();

    private UserEntity(final String userId, final String email, final String password, final String name, final Instant createdAt, final Instant updatedAt, final Set<GroupEntity> groups) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.groups = groups;
    }

    public static UserEntity with(UserEntity userEntity){
        return UserEntity.with(
                userEntity.getUserId(), userEntity.getEmail(), userEntity.getPassword(), userEntity.getName(), userEntity.getCreatedAt(),userEntity.getUpdatedAt(),userEntity.getGroups()
        );
    }

    public static UserEntity with(final String userId, final String email, final String password, final String name, final Instant createdAt, final Instant updatedAt, final Set<GroupEntity> groups){
        return new UserEntity(userId,email,password,name,createdAt,updatedAt,groups);
    }

    public static UserEntity newUser(String email, String password, String name, Set<GroupEntity> groups){
        String userId = IdUtils.uuid();
        Instant now = InstantUtils.now();

        return UserEntity.with(userId, email, password, name, now, now,groups);

    }

    public boolean removeGroup(GroupEntity groupEntity) {
        return getGroups().remove(groupEntity);
    }

    public boolean addGroup(GroupEntity groupEntity) {
        return getGroups().add(groupEntity);
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Set<GroupEntity> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity user = (UserEntity) o;
        return Objects.equals(userId, user.userId) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(name, user.name) && Objects.equals(createdAt, user.createdAt) && Objects.equals(updatedAt, user.updatedAt) && Objects.equals(groups, user.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, email, password, name, createdAt, updatedAt, groups);
    }
}

package io.wisoft.springsecurity.domain.user.entity;

import io.wisoft.springsecurity.domain.user.Role;
import io.wisoft.springsecurity.domain.posts.entity.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public User(String name,String email, String image, Role role){

        this.name = name;
        this.email = email;
        this.image = image;
        this.role = role;

    }
    public User update(String name, String image){

        this.name = name;
        this.image = image;

        return this;
    }

    public String getRoleKey(){
        return this.role.getKey();
    }
}

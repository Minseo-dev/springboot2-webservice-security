package io.wisoft.springsecurity.config.auth.dto;

import io.wisoft.springsecurity.domain.user.entity.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String image;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.image = user.getImage();
    }
}

package io.wisoft.springsecurity.web.dto;

import io.wisoft.springsecurity.domain.posts.entity.UserEntity;
import lombok.*;

import java.io.Serializable;



@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
public class SessionUserDto implements Serializable {

    private String name;
    private String email;
    private String image;

    public SessionUserDto(UserEntity user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.image = user.getImage();
    }
}

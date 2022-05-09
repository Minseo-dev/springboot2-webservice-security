package io.wisoft.springsecurity.dto;

import io.wisoft.springsecurity.model.UserEntity;
import lombok.*;

import java.io.Serializable;



@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
public class SessionUserDTO implements Serializable {

    private String name;
    private String email;
    private String image;

    public SessionUserDTO(UserEntity user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.image = user.getImage();
    }
}

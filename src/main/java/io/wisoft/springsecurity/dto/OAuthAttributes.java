package io.wisoft.springsecurity.dto;

import io.wisoft.springsecurity.domain.Role;
import io.wisoft.springsecurity.model.UserEntity;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
@Data
public class OAuthAttributes {

    private Map<String, Object> attributes; // OAuth2 반환하는 유저 정보 Map
    private String nameAttributeKey;
    private String name;
    private String email;
    private String image;

    public static OAuthAttributes of(String registrationId, String userNameAttributeName, Map<String, Object> attributes){
        // 여기서 네이버와 카카오 등 구분 (ofNaver, ofKakao)

        return ofGoogle(userNameAttributeName, attributes);
    }

    private static OAuthAttributes ofGoogle(String userNameAttributeName, Map<String, Object> attributes) {
        return OAuthAttributes.builder()
                .name((String) attributes.get("name"))
                .email((String) attributes.get("email"))
                .image((String) attributes.get("picture"))
                .attributes(attributes)
                .nameAttributeKey(userNameAttributeName)
                .build();
    }

    public UserEntity toEntity(){
        return UserEntity.builder()
                .name(name)
                .email(email)
                .image(image)
                .role(Role.GUEST) // 기본 권한 GUEST
                .build();
    }


}

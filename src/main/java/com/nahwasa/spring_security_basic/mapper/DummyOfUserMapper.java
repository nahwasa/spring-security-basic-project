package com.nahwasa.spring_security_basic.mapper;

import com.nahwasa.spring_security_basic.config.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class DummyOfUserMapper {
    public UserInfo getUserInfo(String insertedId) {
        if (insertedId.equals("dev")) {
            return UserInfo.builder()
                    .id("dev")
                    .pw("d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db")
                    .roles("USER")
                    .build();
        }
        return null;
    }
}

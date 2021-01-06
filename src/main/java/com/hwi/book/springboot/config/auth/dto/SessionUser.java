package com.hwi.book.springboot.config.auth.dto;

import com.hwi.book.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.name = user.getEmail();
        this.picture = user.getPicture();
    }
}

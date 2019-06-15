package org.ammigo.newsearch.api.controller.dto;

import lombok.Getter;
import org.ammigo.newsearch.core.user.model.User;

@Getter
public class UserDto {
    private Long id;
    private String name;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }
}
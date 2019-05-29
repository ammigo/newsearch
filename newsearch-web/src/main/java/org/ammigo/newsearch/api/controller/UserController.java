package org.ammigo.newsearch.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.ammigo.newsearch.api.controller.dto.UserDto;
import org.ammigo.newsearch.core.user.model.User;
import org.ammigo.newsearch.service.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Slf4j
@RequestMapping("/users")
@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<UserDto> test() {
        log.info("컨트롤러 진입 성공");

        List<User> users = userService.test();
        return users.stream().map(UserDto::new).collect(toList());
    }
}
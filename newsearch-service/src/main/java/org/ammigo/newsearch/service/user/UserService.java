package org.ammigo.newsearch.service.user;

import lombok.extern.slf4j.Slf4j;
import org.ammigo.newsearch.core.user.model.User;
import org.ammigo.newsearch.core.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
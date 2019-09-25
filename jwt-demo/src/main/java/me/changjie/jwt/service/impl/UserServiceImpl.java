package me.changjie.jwt.service.impl;

import me.changjie.jwt.domain.User;
import me.changjie.jwt.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by ChangJie on 2019-09-25.
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public User findUserById(String userId) {
        User user = new User();
        user.setId(userId);
        user.setUsername("changjie");
        user.setPassword("123456");
        return user;
    }
}

package me.changjie.jwt.service;

import me.changjie.jwt.domain.User;

/**
 * Created by ChangJie on 2019-09-25.
 */
public interface UserService {

    User findUserById(String userId);
}

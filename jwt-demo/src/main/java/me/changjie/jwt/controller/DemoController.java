package me.changjie.jwt.controller;

import com.google.common.collect.ImmutableMap;
import me.changjie.jwt.annotation.UserLoginToken;
import me.changjie.jwt.domain.User;
import me.changjie.jwt.util.TokenUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChangJie on 2019-09-25.
 */
@RestController
public class DemoController {

    @PostMapping("/login")
    public Object login(@RequestBody User user){

        if(!user.getPassword().equals("123456")){
            return "密码错误";
        }

        String token = TokenUtil.genarateToken(user);

        return ImmutableMap.of("token", token);
    }

    @GetMapping("/getMessage")
    @UserLoginToken
    public String getMessage(){
        return "通过认证";
    }
}

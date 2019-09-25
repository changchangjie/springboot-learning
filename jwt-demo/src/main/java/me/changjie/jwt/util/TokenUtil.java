package me.changjie.jwt.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import me.changjie.jwt.domain.User;

/**
 * Created by ChangJie on 2019-09-25.
 */
public class TokenUtil {

    /**
     * withAudience()存入需要保存在token的信息，这里我把用户ID存入token中
     * Algorithm.HMAC256():使用HS256生成token,密钥则是用户的密码，唯一密钥的话可以保存在服务端
     * @param user
     * @return
     */
    public static String genarateToken(User user){
        return JWT.create().withAudience(user.getId()).sign(Algorithm.HMAC256(user.getPassword()));
    }

    /**
     * eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxIn0.qfd0G-elhE1aGr15LrnYlIZ_3UToaOM5HeMcXrmDGBM
     * @param args
     */
    public static void main(String[] args) {
        User user = new User();
        user.setId("1");
        user.setPassword("123456");
        System.out.println(genarateToken(user));
    }
}

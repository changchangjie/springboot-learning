package me.changjie.redis.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.changjie.redis.service.RedisService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChangJie on 2019-09-25.
 */
@Api(tags = "DemoController", description = "demoController")
@RestController
public class DemoController {

    @Autowired
    private RedisService redisService;

    @ApiOperation(value = "redis测试")
    @GetMapping(value = "/demo")
    public String demo(String key){
        String value = redisService.get(key);
        return ObjectUtils.defaultIfNull(value, "缓存中未查到");
    }
}

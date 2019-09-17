package me.changjie.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChangJie on 2019-09-17.
 */
@RestController
public class DemoController {

    /**
     * 构建镜像：mvn package docker:build
     * 运行容器：docker run -p 8080:8080 -t springboot/docker-demo
     * @return
     */
    @GetMapping(value = "hello")
    public String hello(){
        return "hello,docker";
    }
}

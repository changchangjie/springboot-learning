package me.changjie.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ChangJie on 2019-09-25.
 */
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@RestController
public class DemoController {

    /**
     * ["aaa","bbb"]
     * @param tagNameList
     * @return
     */
    @ApiOperation("请求参数传list")
    @PostMapping(value = "list")
    public String hello(@RequestBody List<String> tagNameList){
        System.out.println(Arrays.toString(tagNameList.toArray()));
        return "hello,list";
    }


}

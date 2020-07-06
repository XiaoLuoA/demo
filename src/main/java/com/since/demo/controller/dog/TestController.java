package com.since.demo.controller.dog;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.*;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;



@Api(tags = "狗API接口")
@RestController
@RequestMapping("/test")
public class TestController{
    @Data
    @ApiModel("狗")
    class Dog{
        @ApiModelProperty("名字")
        String name;
        @ApiModelProperty("腿")
        String legs;
    }

    @ApiOperation(value="测试获取一条狗", notes="返回一条狗", produces="application/json")
    @ApiImplicitParam(name = "word", value = "单词", paramType = "query", required = true, dataType = "String")
    @GetMapping("/a")
    @ResponseBody
    public Dog test(String word){
        Dog dog = new Dog();
        dog.legs = "4";
        dog.name = "123";
        return dog;
    }
}

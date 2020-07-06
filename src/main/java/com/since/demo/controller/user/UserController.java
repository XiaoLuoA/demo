package com.since.demo.controller.user;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.*;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Api(tags = "用户API接口")
@RestController
@RequestMapping("/user")
public class UserController {
    @Data
    @ApiModel("用户实体类")
    static class User{
        @ApiModelProperty("用户名")
        String name;
        @ApiModelProperty("腿数")
        String legs;
    }


    @ApiOperation(value="返回一个用户", produces="application/json")
    @ApiImplicitParam(name = "id", value = "id",  required = true, dataType = "String" ,dataTypeClass=String.class)
    @GetMapping("/{id}")
    @ResponseBody
    public User get(@PathVariable String id){
        User dog = new User();
        dog.legs =id;
        dog.name = "123";
        return dog;
    }

    @ApiOperation(value="增加一个用户", produces="application/json")
    @PostMapping("/test")
    @ResponseBody
    public User test(@RequestBody User user){
        User dog = new User();
        dog.legs = "4";
        dog.name = "123";
        return dog;
    }

    @ApiOperation(value="返回多个用户", produces="application/json")
    @GetMapping("/")
    @ResponseBody
    public List<User> test(){
        User dog = new User();
        dog.legs = "4";
        dog.name = "123";
        ArrayList arr = new ArrayList();
        arr.add(dog);
        arr.add(dog);
        System.out.println(arr);
        return arr;
    }
}

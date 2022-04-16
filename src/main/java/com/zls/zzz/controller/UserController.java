package com.zls.zzz.controller;

import com.zls.zzz.entity.User;
import com.zls.zzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {

    @Autowired
    private UserService userService;

    //新增
    @PostMapping("/add")
    public Boolean add(User user) {
        return userService.add(user);
    }

    //删除
    @GetMapping("del/{id}")
    public Boolean del(@PathVariable int id) {
        return userService.del(id);
    }

    //修改
    @PostMapping("edit")
    public Boolean edit(User user){
        return userService.edit(user);
    }

    //查询所有
    @GetMapping("findAll")
    public User findAll(){
        return userService.findAll();
    }

    //查询单条
    @GetMapping("findOne/{id}")
    public User findOne(@PathVariable int id){
        return userService.findOne(id);
    }
}

package com.zls.zzz.service;

import com.zls.zzz.entity.User;
import com.zls.zzz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //新增
    public Boolean add(User user) {
        return userMapper.add(user);
    }

    //删除
    public Boolean del(int id) {
        return userMapper.del(id);
    }

    //修改
    public Boolean edit(User user) {
        return userMapper.edit(user);
    }

    //查询所有
    public User findAll(){
        return userMapper.findAll();
    }

    //查询单条
    public User findOne(int id){
        return userMapper.findOne(id);
    }
}

package com.zls.zzz.mapper;

import com.zls.zzz.entity.User;
import org.springframework.stereotype.Repository;

@Repository //让Spring自动装配
public interface UserMapper {

    //新增
    public Boolean add(User user);

    //删除
    public Boolean del(int id);

    //修改
    public Boolean edit(User user);

    //查询所有
    public User findAll();

    //查询单条
    public User findOne(int id);

}

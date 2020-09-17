package com.cn.thread.admin.biz;

import com.cn.thread.admin.dto.User;
import com.cn.thread.admin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserBiz {

    @Autowired
    private UserMapper userMapper;

    public void saveUser() {
        User u = new User();
        u.setName("小明");
        userMapper.insert(u);
    }
}

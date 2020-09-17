package com.cn.thread.admin.dto;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class User {

    @Id
    @Column(name = "user_id")
    @KeySql(genId = UUIdGenId.class)
    private String userId;

    private String name;
}

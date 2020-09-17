package com.cn.thread.admin.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserDto {
    private Integer age;
    private String name;
    private String phone;
    @NotNull(message = "证件号不能为空")
    private Integer CardId;
}

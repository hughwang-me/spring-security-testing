package com.uwjx.springsecuritytesting.domain.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class UserDto {

    @NotNull(message = "id不可以为空 NotNull")
    @NotBlank(message = "id不可以为空 NotBlank")
    @Positive(message = "id 必须为正数")
    private Long id;
    @NotNull(message = "用户名不可以为空 NotNull")
    @NotBlank(message = "用户名不可以为空 NotBlank")
    private String username;
    private String password;

    @NotNull(message = "邮箱不可以为空 NotNull")
    @NotBlank(message = "邮箱不可以为空 NotBlank")
    @Email(message = "邮箱不符合格式")
    private String email;
    private String phone;

}

package com.yuzhe.user.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer user_id;
    private String user_name;
    private String password;
    private Integer user_age;
    private Integer sex;
    private String school;
    private Integer grade;
    private Integer admin;

}

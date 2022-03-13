package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-13 下午 23:21
 * @program security
 * @Version 1.0
 * @ClassName User
 * @Description 类方法说明：$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    public static final long serialVersionUID = -5225431454635670L;
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String useravatar;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", useravatar='" + useravatar + '\'' +
                '}';
    }

}

package com.xiaobai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

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
@TableName(value = "sys_user")
public class User implements Serializable {
    public static final long serialVersionUID = -5225431454635670L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String userName;
    private String nickName;
    private String password;
    private String status;
    private String email;
    private String phonenumber;
    private String sex;
    private String avatar;
    private String userType;
    private Integer createBy;
    private Date createTime;
    private Integer updateBy;
    private Date updateTime;
    private Integer delFlag;


}

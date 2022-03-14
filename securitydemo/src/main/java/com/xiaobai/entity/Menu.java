package com.xiaobai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-14 下午 15:28
 * @program security
 * @Version 1.0
 * @ClassName Menu
 * @Description 类方法说明：$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "sys_menu")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Menu implements Serializable {
    public static final long serialVersionUID = -1543545645321L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String menuName;
    private String path;
    private String component;
    private String visible;
    private String status;
    private String perms;
    private String icon;
    private Integer createBy;
    private Date createTime;
    private Integer updateBy;
    private Date updateTime;
    private Integer delFlag;
    private String remark;
}

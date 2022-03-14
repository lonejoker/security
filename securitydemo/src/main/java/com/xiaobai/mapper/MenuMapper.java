package com.xiaobai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaobai.entity.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectByUserId(Integer userid);

}

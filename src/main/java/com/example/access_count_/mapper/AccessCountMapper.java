package com.example.access_count_.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.access_count_.pojo.AccessCount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccessCountMapper extends BaseMapper<AccessCount>{
    public String login();
    public

}

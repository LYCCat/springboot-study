package com.example.access_count_.mapper;


import com.example.access_count_.pojo.AccessCount;
import com.example.access_count_.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccessCountMapper {
    public  void save(User user);

}

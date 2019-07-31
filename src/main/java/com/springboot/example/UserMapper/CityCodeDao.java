package com.springboot.example.UserMapper;


import com.springboot.example.model.citycode;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityCodeDao{

    String findcityname(String citycode);

}

package com.springboot.example.UserMapper;


import com.springboot.example.model.citycode;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CityCodeDao{


    String findcityname(String citycode);

    citycode findByid(Integer id);

}

package com.springboot.example.service.Impl;

import com.springboot.example.UserMapper.CityCodeDao;
import com.springboot.example.model.citycode;
import com.springboot.example.service.CitycodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityCodeIpl  implements CitycodeService {

    @Autowired
    private CityCodeDao citycode;

    @Override
    public String findcityname(String code) {
        String cityname = citycode.findcityname(code);
        return cityname;
    }
}

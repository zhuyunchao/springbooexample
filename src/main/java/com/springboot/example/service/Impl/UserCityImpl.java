package com.springboot.example.service.Impl;


import com.springboot.example.UserMapper.UserDao;
import com.springboot.example.dto.UserCity;
import com.springboot.example.service.UserCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCityImpl  implements UserCityService {


    @Autowired
    private UserDao userdto;
    @Override
    public List<UserCity> User_City() {
        return userdto.User_City();
    }
}

package com.springboot.example.service;

import com.springboot.example.model.citycode;

public interface CitycodeService {
    public String findcityname(String code);
    public  citycode findByid(Integer id);
}

package com.springboot.example.Contorller;

import com.springboot.example.service.CitycodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Citycontorller {

    @Autowired
    private CitycodeService citycodeService;
    @RequestMapping("/getcityname")
    public String GetcityName(String code){
        String cityname=citycodeService.findcityname("110000");
        return  cityname;
    }

}

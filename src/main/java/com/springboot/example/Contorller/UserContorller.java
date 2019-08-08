package com.springboot.example.Contorller;

import com.springboot.example.dto.UserCity;
import com.springboot.example.model.User;
import com.springboot.example.service.UserCityService;
import com.springboot.example.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
//@ComponentScan({"com.springboot.example.service"})
//@MapperScan({"com.springboot.example.UserMapper"})
public class UserContorller {

    @Autowired
    private UserService userService;
    @Autowired
    private UserCityService userCityService;

    @RequestMapping("/insert")
    public void insert(){
        User user = new User();
        user.setId(2);
        user.setUsername("张张张");
        user.setAge(10);
        user.setAddrss("上海");

        userService.insert(user);
        System.out.println("插入成功");
    }
    @RequestMapping("/find")
    public User find() {

        User user = userService.find(2);
        return user;
    }

    @RequestMapping("/delete")
    public void delete(){
        userService.delete(5);

    }
    @RequestMapping("/update")
    public void update(){
        User user1 = new User();
        user1.setId(100);
        user1.setAge(50);
        user1.setUsername("不一样的springboot");
        user1.setAddrss("北京将台路地铁口将台普天实业10号院自如总部");
        userService.update(user1);
    }
    @RequestMapping("/findall")
    public List<User> findall() {
        return userService.findall();
    }

    @RequestMapping("/usercity")
    public List<UserCity> usercity() {
        return userCityService.User_City();
    }










    @RequestMapping("/string")
    public @ResponseBody Map<String, Object> string(){
        Map<String,Object> map = new HashMap<>();
        map.put("1","zhu");
        map.put("age","13");
        map.put("addr","海淀");
        map.put("籍贯","河北");
        map.put("sex","男");
        Map<String,String> map2 = new HashMap<>();
        map2.put("1","zhang");
        map2.put("age","53");
        map2.put("addr","青岛");
        map2.put("籍贯","山西");
        map2.put("sex","女");
        map.put("abc",map2);
        List<String>  list =new ArrayList<String>();
        list.add("1234567890");
        list.add("niajjnnnnnnnnnnnnn");
        list.add("ssssssssssssss");
        int arr[]=new  int[5];
        arr[0]=1;
        arr[1]=2222;
        arr[2]=3333;
        arr[3]=44444;
        arr[4]=5555555;

        map.put("LIST",list);
        map.put("arr",arr);
        return  map;

    }

}

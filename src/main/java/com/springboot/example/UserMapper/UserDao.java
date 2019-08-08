package com.springboot.example.UserMapper;

import com.springboot.example.dto.UserCity;
import com.springboot.example.model.User;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDao {
    void insert (User user);
   void   update (User user);
   void delete (Integer id);
   User    find   (Integer  id);
   List<User> findall();
    List<UserCity>  User_City ();
    void updatepost(Integer  id , String username);
}

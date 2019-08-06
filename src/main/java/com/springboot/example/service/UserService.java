package com.springboot.example.service;

import com.springboot.example.dto.UserCity;
import com.springboot.example.model.User;

import java.util.List;


public interface UserService {

    public void insert(User user);
   public void update(User user);
   public void delete(Integer id);

     public User find(Integer id);
    public List<User> findall();


}

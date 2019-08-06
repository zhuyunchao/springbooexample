package com.springboot.example.service.Impl;

import com.springboot.example.UserMapper.UserDao;
import com.springboot.example.model.User;
import com.springboot.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@ComponentScan({"com.springboot.example.UserMapper"})
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserDao  userDao ;


    @Override
   public  void insert(User user){

        userDao.insert(user);
    }


    @Override
   public void update(User user){
        userDao.update(user);

   };

    @Override
    public void delete(Integer id){
        userDao.delete(id);

    }

    @Override
    public User find(Integer id){
        User user =userDao.find(id);
        return user;

    }

    @Override
    public List<User> findall() {
        return  userDao.findall();
    }
}

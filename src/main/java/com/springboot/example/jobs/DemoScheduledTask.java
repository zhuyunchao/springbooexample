package com.springboot.example.jobs;

import com.springboot.example.model.User;
import com.springboot.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
@Slf4j
public class DemoScheduledTask {
       // @Scheduled(cron="0 0/5 * * * ?")
    @Autowired
    private UserService  userService;


        @Scheduled(cron="0/5 * * * * ?")
        public void test1() {
            System.out.println("每5秒执行一次");
        }

        @Scheduled(cron="0 0 23 * * ?")
        public void test2() {
            System.out.println("每天23点执行一次");
        }

        @Scheduled(fixedRate=30000)
        public void test3() {
            System.out.println("每30秒执行一次");
        }

    @Scheduled(cron="0/20 * * * * ?")
    public void autoInsert() {
        System.out.println("每20秒插入数据库中一条数据执行一次");
        User user = new User();
        user.setUsername("维修部门");
        user.setAge(100);
        user.setAddrss("云南");
        userService.insertw(user);
        log.info("插入成功");


    }

}

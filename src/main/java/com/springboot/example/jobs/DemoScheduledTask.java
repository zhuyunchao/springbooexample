package com.springboot.example.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class DemoScheduledTask {
       // @Scheduled(cron="0 0/5 * * * ?")


        @Scheduled(cron="0/5 * * * * ?")
        public void test1() {
            System.out.println("每5分钟执行一次");
        }

        @Scheduled(cron="0 0 23 * * ?")
        public void test2() {
            System.out.println("每天23点执行一次");
        }

        @Scheduled(fixedRate=30000)
        public void test3() {
            System.out.println("每30秒执行一次");
        }




}

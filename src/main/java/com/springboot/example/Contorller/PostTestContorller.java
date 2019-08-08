package com.springboot.example.Contorller;

import com.springboot.example.dto.PostDto;
import com.springboot.example.model.User;
import com.springboot.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PostTestContorller {
    @Autowired
    private UserService userService;

    @PostMapping("/postdto")
    @ResponseBody
    public   Map<String, Object> post( @RequestBody PostDto  postDto) {


        Map<String, Object> map = new HashMap<>();
            String   P=postDto.getPost();

            System.out.println(P);
            String addr= postDto.getAddr();
            System.out.println(addr);

            userService.updatepost(P,2);
        //if(P.equals("zhu")&&addr.equals("海淀"))
            if(P.equals("zhu111")){
            map.put("1", "zhu");
            map.put("age", "13");
            map.put("addr", "海淀");
            map.put("籍贯", "河北");
            map.put("sex", "男");
            Map<String, String> map2 = new HashMap<>();
            map2.put("1", "zhang");
            map2.put("age", "53");
            map2.put("addr", "青岛");
            map2.put("籍贯", "山西");
            map2.put("sex", "女");
            map.put("abc", map2);
            List<String> list = new ArrayList<String>();
            list.add("44444444444444444");
            list.add("niajjnnnnnnnnnnnnn");
            list.add("ssssssssssssss");
            int arr[] = new int[5];
            arr[0] = 1;
            arr[1] = 2222;
            arr[2] = 3333;
            arr[3] = 44444;
            arr[4] = 5555555;
            map.put("LIST", list);
            map.put("arr", arr);
        }
            return map;
        }
}

package com.springboot.example.Contorller;

import com.springboot.example.service.CitycodeService;

import me.joshlarson.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Citycontorller {

    @Autowired
    private CitycodeService citycodeService;
    @RequestMapping("/getcityname/{code}")
    public String GetcityName(@PathVariable  String code){
        //String cityname=citycodeService.findcityname("110000");
        String cityname=citycodeService.findcityname(code);
        return  cityname;
    }
    @PostMapping("/postcity")
    @ResponseBody
    public   Map<String, Object> Post( @RequestBody JSONObject jsom) {//这里有疑难？出入进来的到底是json串还是json对象

        Map<String, Object> map = new HashMap<>();

        String code1=jsom.getString("code");
        String name=jsom.getString("name");

        if (code1.equals("110000") && name.equals("上海")){
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

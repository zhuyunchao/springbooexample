package com.springboot.example.Contorller;

import com.springboot.example.service.CitycodeService;
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
    @PostMapping("postcity")
    public  @ResponseBody Map<String, Object> post(@RequestBody String code ,String name) {

        String code1 = code;
        String name1 = name;
        Map<String, Object> map = new HashMap<>();
        if (code1 == "110000" && name1 == "北京") {

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
            list.add("lllllllllllllllllll");
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

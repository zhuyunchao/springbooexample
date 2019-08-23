package com.springboot.example.Contorller;

import com.springboot.example.dto.UserCity;
import com.springboot.example.model.User;
import com.springboot.example.service.CitycodeService;
import com.springboot.example.service.UserCityService;
import com.springboot.example.service.UserService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FreeMarkertestContorllor{


    @Autowired
    private CitycodeService citycodeService;
    @Autowired
    private UserCityService userCityService;
    @RequestMapping("/wel")
    public String hello(Map<String,Object> map){
        map.put("name", "[Angel -- 守护天使]");
        System.out.println(map);
        return  "hello";
    }

    @RequestMapping("/hel")
    public String hello(Model model){
        model.addAttribute("name", "[- 守护天使- 守护天使- 守护天使- 守护天使Angel -]");
        System.out.println(model);

        return  "hello";
    }
    @RequestMapping("/wel1")
    public ModelAndView hello1(){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name","zhuyunhcao to");
        return  mv;
    }
    @RequestMapping("/haha")
    public String haha(ModelMap map){
        //List<UserCity> list=userCityService.User_City();
       // map.addAttribute(list);
        List<String> lists=new ArrayList<String>();
        lists.add("aaa");
        lists.add("bbbfffffff");
        lists.add("ccc");
        lists.add("ddd");
        for(String list : lists){
            System.out.println(list);
        }
        Map<String,Object> map1 = new HashMap<>();
        map1.put("ni","zhu");
        map1.put("age","13");
        map1.put("addr","海淀");
        //map.addAttribute("name","ajsjajsjajsajjsa to");
        map.addAttribute("listqq",lists);
       // map.put("listqq",lists);
        map.addAttribute("mp",map1);
        //map.put("map1","map1");

        return  "hello";
    }

    @RequestMapping("/string1")
    @ResponseBody
    public  Map<String, Object> string(){
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




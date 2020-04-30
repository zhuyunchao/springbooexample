package com.springboot.example.Contorller;

import com.springboot.example.model.citycode;
import com.springboot.example.service.CitycodeService;
import com.springboot.example.service.UserCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class FreeMarkertestContorllor{

    @Autowired
    private CitycodeService citycodeService;
    @Autowired
    private UserCityService userCityService;
    @RequestMapping("/test1")
    public String test1(Map<String,Object> map){
        map.put("testname", "nihao");
        System.out.println(map);
        return "hello.ftl";
    }
    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("test2name", "第一个freemarker例子one_1");
        System.out.println(model);
        return  "test2";
    }
    @RequestMapping("/test3")
    public ModelAndView test3(){
        ModelAndView mv = new ModelAndView("test3");
        List<String> lists=new ArrayList<String>();
        lists.add("aaa");
        lists.add("bbbfffffff");
        lists.add("ccc");
        lists.add("ddd");
        mv.addObject("listqq",lists);
        return  mv;
    }
    @RequestMapping("/test4")
    public ModelAndView test4(){
        ModelAndView mv = new ModelAndView("test4");
        Map<String,Object> map1 = new HashMap<>();
        map1.put("ni","zhu");
        map1.put("age","13");
        map1.put("addr","海淀");
        mv.addObject("mp",map1);
        return  mv;
    }
    @RequestMapping("/test5")
    public ModelAndView test5(){

        citycode cityCode =new citycode();
        cityCode.setId(11);
        cityCode.setCitycode("550000");
        cityCode.setCityname("吉林");

        ModelAndView mv = new ModelAndView("test5");
        List<Object> lists=new ArrayList<Object>();

        lists.add(cityCode);
        mv.addObject("LIstq",lists);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("CY",cityCode);
        mv.addObject("mp",map1);
        return  mv;
    }
    @RequestMapping("/test6")
    public ModelAndView test6(){
        citycode cityCode=citycodeService.findByid(110000);
        ModelAndView mv = new ModelAndView("test6");
        List<Object> lists=new ArrayList<Object>();
        lists.add(cityCode);
        mv.addObject("LIstq",lists);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("CY",cityCode);
        mv.addObject("mp",map1);
        mv.addObject("date",new Date());
        return  mv;
    }
    @RequestMapping("/base")
    public ModelAndView base(){
        ModelAndView mv = new ModelAndView("base");
        mv.addObject("name","aaaaaa");
        return  mv;
    }

    @RequestMapping("/child")
    public ModelAndView child(){
        ModelAndView mv = new ModelAndView("child");
        mv.addObject("name","aaaaaa");

        return  mv;
    }
    @RequestMapping("/test7")
    public ModelAndView test7(){
        ModelAndView mv = new ModelAndView("test7");
        //mv.addObject("name","zhuyunhcao to");
        List<String> lists=new ArrayList<String>();
        lists.add("aaa");
        lists.add("bbbfffffff");
        lists.add("ccc");
        lists.add("ddd");
        mv.addObject("LIstq",lists);

        return  mv;
    }
    @RequestMapping("/test8")
    public ModelAndView test8(){
        ModelAndView mv = new ModelAndView("test8");
        //mv.addObject("name","zhuyunhcao to");
        List<String> lists=new ArrayList<String>();
        lists.add("aaa");
        lists.add("bbbfffffff");
        lists.add("ccc");
        lists.add("ddd");
        mv.addObject("listqq",lists);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("ni","zhu");
        map1.put("age","13");
        map1.put("addr","海淀");
        mv.addObject("mp",map1);
        return  mv;
    }





    @RequestMapping("/test10")
    public ModelAndView test10(){
        ModelAndView mv = new ModelAndView("test10");
        //mv.addObject("name","zhuyunhcao to");
        List<String> lists=new ArrayList<String>();
        lists.add("aaa");
        lists.add("bbbfffffff");
        lists.add("ccc");
        lists.add("ddd");
        mv.addObject("listqq",lists);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("ni","zhu");
        map1.put("age","13");
        map1.put("addr","海淀");
        mv.addObject("mp",map1);
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

        return "hello";
    }




























    //封装对象方法
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




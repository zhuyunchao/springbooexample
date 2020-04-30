package com.springboot.example.util;




import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * json对象和json字符串之间的转换
 *
 */
public class jsonString {
    public  void jsonObject() {
        Map<String, Object> map = new HashMap<>();
        map.put("1", "zhuyunhao");
        map.put("age", 13);
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
        list.add("1234567890");
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

        //String  Js=JSONObject.toJSONString(map);
      //  System.out.println(Js);
        JSONObject Js = new JSONObject(map);
        System.out.println(Js);

        System.out.println(Js.getClass().toString());


//        JSONObject JSS=JSONObject.parseObject(Js);
//
//        System.out.println(JSS.getClass().toString());
//        String a=JSS.getString("arr").toString();
//        System.out.println(a);
//        System.out.println(a.getClass().toString());
    }
    public static void main (String[]args){
        jsonString js =new jsonString();
        js.jsonObject();
    }
}



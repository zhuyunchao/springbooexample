package com.springboot.example.dto;

import java.util.List;

public class PostDto {
    private String post;
    private  String sex;
    private String addr;
    private   String jiguan;
    private Integer age;
    private  List<String>  LIST;
    private UserCity abc;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getLIST() {
        return LIST;
    }

    public void setLIST(List<String> LIST) {
        this.LIST = LIST;
    }

    public UserCity getAbc() {
        return abc;
    }

    public void setAbc(UserCity abc) {
        this.abc = abc;
    }
}

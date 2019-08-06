package com.springboot.example.model;

public class citycode {
    private  Integer id;
    private String citycode;
    private String cityname;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }





    @Override
    public String toString() {
        return "citycode{" +
                "id=" + id +
                ", citycode='" + citycode + '\'' +
                ", cityname='" + cityname + '\'' +
                '}';
    }
}

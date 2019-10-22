package com.springboot.example.eunm;

public enum Addess{

    ADDESS_INFO_1("10","北京是长安街天安门"),
    ADDESS_INFO_2("30","上海外滩");



    private String code;
    private String name;

    Addess(String code, String name){
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(String code) {
        for (Addess addess : Addess.values()) {
            if (addess.getCode().equals(code)) {
                return addess.getName();
            }
        }
        return null;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

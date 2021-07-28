package com.xdclass.springboot.xdclass;


import lombok.*;
import lombok.extern.java.Log;


@Value
public class User {


    private String name;
    private String sex;
    private String birth;
    private String nickname;
    private String age;

    public static void main(String[] args) {
        //language=JSON

        String data = "{\n" +
                "  \"userName\":\"xdclass\",\n" +
                "  \"sex\":\"male\",\n" +
                "  \"birth\":\"1991-11-11\"\n" +
                "}\n";

        String msg = "";
    }


}

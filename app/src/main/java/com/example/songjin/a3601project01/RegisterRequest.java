package com.example.songjin.a3601project01;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;


public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://localhost:8080/gettingstartedwithrest/Register.php";
    private Map<String,String> params;


    public RegisterRequest(String name, String username, int age, String password,Response.Listener<String> listener ){


        super(Method.POST,REGISTER_REQUEST_URL,listener,null );
        params = new HashMap<>();
        params.put("name",name);
        params.put("username",username);
        params.put("password",password);
        params.put("age",age+"");


    }

    @Override
    public  Map<String, String> getParams(){


        return params;
    }

}

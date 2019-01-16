package com.example.auri.android_login_api_4;


import java.util.Map;
import java.util.HashMap;


public class Post {

    public String name;
    public String email;
    public String occu;
    public String desig;
    public String phone;
    public String spec;
    public String year;
    public String cert;
    public String reg;

    public Post() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)

    }

    public Post(String name,String email,String occu, String desig, String spec, String year, String cert, String reg, String phone) {
       // this.uid = uid;
        this.name = name;
        this.email = email;
        this.occu = occu;
        this.desig = desig;
        this.phone = phone;
        this.spec = spec;
        this.year = year;
        this.cert = cert;
        this.reg = reg;
        //this.designation = designation;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        //result.put("uid", uid);
        result.put("name", name);
        result.put("email", email);
        result.put("occupation", occu);
        result.put("designation", desig);
        result.put("specialization", spec);
        result.put("year", year);
        result.put("certification", cert);
        result.put("registration", reg);
        result.put("phone_no", phone);

        return result;
    }

}


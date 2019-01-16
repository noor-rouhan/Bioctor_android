package com.example.auri.android_login_api_4;

import java.util.HashMap;
import java.util.Map;




public class post_chamber {

    public String chamber_name;
    public String address;
    public String visiting_hour;
    public String visiting_day;
    public String chamber_phone;
    public String assistant_phone;
    public String visiting_charge;
    //public Map<String, Boolean> stars = new HashMap<>();


    public post_chamber() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)

    }

    public post_chamber (String chamber_name,String address,String visiting_hour, String visiting_day, String chamber_phone, String assistant_phone, String visiting_charge) {
        // this.uid = uid;
        this.chamber_name = chamber_name;
        this.address = address;
        this.visiting_hour = visiting_hour;
        this.visiting_day = visiting_day;
        this.chamber_phone = chamber_phone;
        this.assistant_phone = assistant_phone;
        this.visiting_charge = visiting_charge;
        //this.designation = designation;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        //result.put("uid", uid);
        result.put("chamber_name", chamber_name);
        result.put("address", address);
        result.put("visiting_hour", visiting_hour);
        result.put("visiting_day", visiting_day);
        result.put("chamber_phone", chamber_phone);
        result.put("assistant_phone", assistant_phone);
        result.put("visiting_charge", visiting_hour);


        return result;
    }

}






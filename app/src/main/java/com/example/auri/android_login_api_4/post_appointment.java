package com.example.auri.android_login_api_4;

import java.util.HashMap;
import java.util.Map;



public class post_appointment {

    public String date;
    public String time;
    public String chamber_id;
    public String patient_name;
    public String patient_phone_number;
    public String reason_of_visits;
    //  public String visiting_charge;
    //public Map<String, Boolean> stars = new HashMap<>();


    public post_appointment() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)

    }

    public post_appointment(String date,String time,String chamber_id, String patient_name, String patient_phone_number, String reason_of_visits) {
        // this.uid = uid;
        this.date = date;
        this.time = time;
        this.chamber_id = chamber_id;
        this.patient_name = patient_name;
        this.patient_phone_number = patient_phone_number;
        this.reason_of_visits = reason_of_visits;
        // this.visiting_charge = visiting_charge;
        //this.designation = designation;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        //result.put("uid", uid);
        result.put("date", date);
        result.put("time", time);
        result.put("chamber_id", chamber_id);
        result.put("patient_name", patient_name);
        result.put("patient_phone_number", patient_phone_number);
        // result.put("assistant_phone", assistant_phone);
        result.put("reason_of_visits", reason_of_visits);
        return result;
    }

}



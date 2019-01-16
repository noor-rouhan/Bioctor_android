package com.example.auri.android_login_api_4;

import java.util.HashMap;
import java.util.Map;

public class post_prescription {


    public String pres_date;
    public String patient_name;
    public String patient_phone;
    public String doctor_uid;
    public String appointment_id;
    public String patient_uid;
    public String pres_details;
    public String pres_image_url;
    public String pres_title;



    public post_prescription() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)

    }

    public post_prescription(String pres_title,String pres_date,String pres_details, String patient_name, String patient_phone, String appointment_id, String doctor_uid,String patient_uid) {

        this.pres_date = pres_date;
        this.patient_name = patient_name;
        this.patient_phone = patient_phone;
        this.doctor_uid = doctor_uid;
        this.appointment_id = appointment_id;
        this.patient_uid = patient_uid;
        this.pres_details = pres_details;
        this.pres_title = pres_title;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("pres_date", pres_date);
        result.put("patient_name", patient_name);
        result.put("patient_phone", patient_phone);
        result.put("doctor_uid", doctor_uid);
        result.put("appointment_id", appointment_id);
        result.put("patient_uid", patient_uid);
        result.put("pres_details", pres_details);
        result.put("pres_title", pres_title);

        return result;
    }
}


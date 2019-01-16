package com.example.auri.android_login_api_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.HashMap;
import java.util.Map;

public class main_landingActivity extends AppCompatActivity{


   // private TextView docname = findViewById(R.id.patien)



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_landing);

        Button patient_list  =findViewById(R.id.Patient_list_button_id);
       // Button appoint_list = findViewById(R.id.appoint_list_button_id);
       // final Button new_appoint  = findViewById(R.id.add_appointment_id);
        Button add_pres = findViewById(R.id.add_prescription_id);


        patient_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(main_landingActivity.this, doctor_dashboardActivty.class);
                startActivity(intent);
            }
        });

        add_pres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_landingActivity.this,wacom_main_activity.class);
                startActivity(intent);
            }
        });

        /*appoint_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_landingActivity.this, doctor_dashboardActivty.class);
                startActivity(intent);
            }
        });*/
        /*new_appoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_landingActivity.this, new_appointment_activity.class);
                startActivity(intent);
            }
        });*/
    }
}

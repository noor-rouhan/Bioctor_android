/*
package com.example.auri.android_login_api_4;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import java.text.DateFormat;

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


import java.util.Calendar;

public class new_appointment_activity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private EditText datePicker;

    */
/*private Button mPickDate;
    private EditText datePicker;
    private Calendar c;

    private FirebaseUser user_id;
    private DatabaseReference dataRef;

*//*


    private DatabaseReference dataRef;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_appointment);

        Button mPickDate;
      //  EditText datePicker;
        final Calendar c;

        FirebaseUser user_id;



        /////firebase

        user_id = FirebaseAuth.getInstance().getCurrentUser();
        final String uid = user_id.getUid();
        final String phone_no = user_id.getPhoneNumber();




        //final Calendar calendar = Calendar.getInstance();
        c= Calendar.getInstance();
        datePicker = findViewById(R.id.date_pciker_id);;
        mPickDate = findViewById(R.id.new_appointment_add_id);
        final Button save = findViewById(R.id.appoint_save_id);
        final Button cancel = findViewById(R.id.cancel_button_id);
        final EditText time = findViewById(R.id.time_edit_id);
        final EditText details = findViewById(R.id.edit_appointment_details_id);
        final TextInputLayout phone_num = findViewById(R.id.patient_phone_no_id);
        final TextInputLayout patient_name = findViewById(R.id.Patient_name_id);

        final Button vistin_time=findViewById(R.id.visiting_button_id);

        vistin_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // calendar = Calendar.getInstance();
                int mHour = c.get(Calendar.HOUR_OF_DAY);
                int mMinute = c.get(Calendar.MINUTE);

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(new_appointment_activity.this, doctor_dashboardActivty.class);
                        startActivity(intent);
                    }
                });


                save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String date = "18/5/17";
                        String times = "8:30";
                        String reason = "fesefsfefsef";
                        String phone = "6464654654";
                        String name = "ami";

                        date = datePicker.getText().toString();
                        times = time.getText().toString();

                        reason = details.getText().toString();
                        phone = phone_num.getEditText().getText().toString().trim();
                        name = patient_name.getEditText().getText().toString().trim();



                        Intent intent = new Intent(new_appointment_activity.this,doctor_dashboardActivty.class);

                        startActivity(intent);


                        dataRef =  FirebaseDatabase.getInstance().getReference().child("doctor_appointment_table").child(uid);


                        post_appointment post = new post_appointment(date,times,"test",name,phone,reason);

                        String key =  dataRef.child(uid).push().getKey();
                        dataRef.child(key).setValue(post);
                    }
                });




                TimePickerDialog timePickerDialog = new TimePickerDialog(new_appointment_activity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                                time.setText(hourOfDay+":"+minute);
                            }
                        },mHour,mMinute,false);
                timePickerDialog.show();

            }
        });


       mPickDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // calendar = Calendar.getInstance();
                DialogFragment datepicker = new DatepickerFragment();
                datepicker.show(getSupportFragmentManager(),"date picker");

            }
        });

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
        String df = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
        datePicker.setText(df);

    }

}
*/

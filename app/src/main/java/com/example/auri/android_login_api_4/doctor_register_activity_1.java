
package com.example.auri.android_login_api_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class doctor_register_activity_1 extends AppCompatActivity{

    private Button button;
    private EditText edit_name;
    private EditText edit_email;
    private EditText edit_occu;
    private EditText edit_desig;
    private EditText edit_spec;
    private TextView test_txt_user_id;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_doctor_registration);

        button = findViewById(R.id.profile_button_1);
        edit_name = findViewById(R.id.doctor_name_edit_id);
        edit_email = findViewById(R.id.doctor_email_id);
        edit_occu = findViewById(R.id.doctor_occupation_id);
        edit_desig = findViewById(R.id.doctor_designation_id);
        edit_spec = findViewById(R.id.doctor_specialization_id);
        test_txt_user_id = findViewById(R.id.test_text_user_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Bundle extras = new Bundle();
                String name = edit_name.getText().toString();
                String email = edit_email.getText().toString();
                String occu = edit_occu.getText().toString();
                String desig = edit_desig.getText().toString();
                String spec = edit_spec.getText().toString();

                Intent intent = new Intent(doctor_register_activity_1.this, doctor_register_activity_2.class);
                //intent.putExtra("profile_1",extras);
                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("occu",occu);
                intent.putExtra("desig",desig);
                intent.putExtra("spec",spec);
                startActivity(intent);

            }
        });


    }
}


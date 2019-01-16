package com.example.auri.android_login_api_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneauthActivity extends AppCompatActivity{
    private Button phone_next;
    private EditText mobile_input;
    private String phone_no;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phoneauth);
        phone_next = findViewById(R.id.button_mobile_auth_next);
        mobile_input = findViewById(R.id.mobileedit_id);
        phone_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone_no = mobile_input.getText().toString();
                Intent front_intent = new Intent( PhoneauthActivity.this, phoneauthcodeActivity.class);
                front_intent.putExtra("phone_number", phone_no);
                startActivity(front_intent);
            }
        });
    }
}

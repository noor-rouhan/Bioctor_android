package com.example.auri.android_login_api_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FrontpageActivity extends AppCompatActivity {
    private Button btn_sign_phone, btn_sign_google,btn_sign_facebook;
   // private Button test = findViewById(R.id.test_button_id);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        btn_sign_phone = findViewById(R.id.register_button);
        btn_sign_facebook = findViewById(R.id.signin_facebook);
        btn_sign_google = findViewById(R.id.signin_google);


        /*test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(FrontpageActivity.this, new_appointment_activity.class);
                startActivity(intent);

            }
        });*/
        btn_sign_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent front_intent = new Intent(FrontpageActivity.this, PhoneauthActivity.class);
                startActivity(front_intent);
                finish();
            }
        });

    }

}

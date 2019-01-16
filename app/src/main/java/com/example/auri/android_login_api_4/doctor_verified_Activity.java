package com.example.auri.android_login_api_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ActionProvider;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.concurrent.TimeUnit;

public class doctor_verified_Activity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView textView;
    private Button button;
    private Bundle bun = getIntent().getExtras();
    private String mobile_string;
    private FirebaseUser user_id;
    private String message;
    private FirebaseAuth mAuth;
    private boolean user_flags;
    private DatabaseReference storeUserToDatabase;






    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_verified);

        mAuth  = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressbar_verified_id);
        textView = findViewById(R.id.verified_text_id);
        button = findViewById(R.id.next_reg_id);

        mobile_string = bun.getString("phone_no");



        user_id = FirebaseAuth.getInstance().getCurrentUser();


        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser == null){
            user_flags = false;
        } else{
            user_flags = true;
            String uid = user_id.getUid();
            String mobile = user_id.getPhoneNumber();
            message = mobile_string + " " + uid;
            textView.setText(message);
            writeNewUser(uid,mobile_string);

        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    Intent intent = new Intent(doctor_verified_Activity.this, doctor_register_activity_1.class);
                    //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    //  finish();


            }
        });


    }
    private void writeNewUser(String userId, String phone) {
        User user = new User(phone);

        storeUserToDatabase = FirebaseDatabase.getInstance().getReference();

        storeUserToDatabase.child("users").child(userId).setValue(user);
    }


}

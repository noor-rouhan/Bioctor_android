
package com.example.auri.android_login_api_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.Map;
import java.util.HashMap;


public class doctor_register_activity_3 extends AppCompatActivity{

    private TextView all_done;
    private Button next_button;
    private ProgressBar progressBar;
    private FirebaseUser user_id;
    private DatabaseReference dataRef;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_registration_3);

        all_done =findViewById(R.id.all_done_text_id);
        progressBar=findViewById(R.id.all_done_progress_id);
        next_button = findViewById(R.id.all_done_button_id);

        user_id = FirebaseAuth.getInstance().getCurrentUser();
        String uid = user_id.getUid();
        String phone_no = user_id.getPhoneNumber();

        Bundle bun = getIntent().getExtras();

        String name = bun.getString("name");
        String email = bun.getString("email");
        String occu = bun.getString("occu");
        String desig = bun.getString("desig");
        String spec = bun.getString("spec");
        String year = bun.getString("year");
        String cert = bun.getString("cert");
        String reg = bun.getString("reg");

        //store all doctor's data


        Map<String, Object> childUpdates = new HashMap<>();
        dataRef =  FirebaseDatabase.getInstance()
                .getReference("/users");
        dataRef.child(uid).push();
        Post post = new Post(name,email,occu,desig,spec,year,cert,reg,phone_no);
        Map<String, Object> postValues = post.toMap();

        childUpdates.put(uid,postValues);
        dataRef.updateChildren(childUpdates);

        progressBar.setVisibility(View.INVISIBLE);

        String message = "Almost done!";

        all_done.setText(message);


        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(doctor_register_activity_3.this,main_landingActivity.class );
                startActivity(intent);
                finish();
            }
        });


    }


}


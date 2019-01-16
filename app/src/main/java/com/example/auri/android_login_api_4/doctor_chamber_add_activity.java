
/*package com.example.auri.android_login_api_4;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.support.design.widget.TextInputLayout;
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

        import org.w3c.dom.Text;

        import java.util.HashMap;
        import java.util.Map;

public class doctor_chamber_add_activity extends AppCompatActivity{



    private Button add_cham = findViewById(R.id.chamber_add_id);
    // private Button done_cham = findViewById(R.id.chamber_done_button_id);
    // private Button delete_cham = findViewById(R.id.chamber_delete_button_id);


    private TextInputLayout name = findViewById(R.id.chamber_name_id);
    private TextInputLayout address = findViewById(R.id.chamber_add_id);
    private TextInputLayout hour = findViewById(R.id.cham_hour);
    private TextInputLayout day = findViewById(R.id.cham_day);
    private TextInputLayout phone = findViewById(R.id.cham_phone_no);
    private TextInputLayout assis_phone = findViewById(R.id.cham_assis_phone_id);
    // private Button next_button = findViewById(R.id.chamber_done_button_id);
    private TextInputLayout visiting_charge = findViewById(R.id.visiting_charge_id);*//*

    private DatabaseReference dataRef;
    private FirebaseUser user_id;
    // private String cnam;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamber_add_update);


        user_id = FirebaseAuth.getInstance().getCurrentUser();
        final String uid = user_id.getUid();
        final String phone_no = user_id.getPhoneNumber();


      /*  done_cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(doctor_chamber_add_activity.this,doctor_dashboardActivty.class);
                startActivity(intent);
                finish();
            }
        });*/

       /* add_cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String cnam = name.getEditText().getText().toString();
                String caddress = address.getEditText().getText().toString();
                String chour = hour.getEditText().getText().toString();
                String cday = day.getEditText().getText().toString();
                String cphone = phone.getEditText().getText().toString();
                String ca_phone = assis_phone.getEditText().getText().toString();
                String cvisit = visiting_charge.getEditText().getText().toString();



                Map<String, Object> childUpdates = new HashMap<>();
                dataRef =  FirebaseDatabase.getInstance()
                        .getReference("/chambers_data");
                DatabaseReference data = dataRef.child(uid).push();
                String key = data.push().getKey();


                post_chamber post = new post_chamber(cnam,caddress,chour,cday,cphone,ca_phone,cvisit);
                Map<String, Object> postValues = post.toMap();

                // Map<String, Object> childUpdates = new HashMap<>();
                childUpdates.put("/chamber_data/" + uid + "/2/" ,postValues);
                // childUpdates.put("/user-posts/" + userId + "/" + key, postValues);

                // childUpdates.put(key,postValues);
                data.updateChildren(childUpdates);*//*


                ////posting data to database




                Intent intent = new Intent(doctor_chamber_add_activity.this, storeupdate_delete_chamberActivity.class);

                startActivity(intent);


                user_id = FirebaseAuth.getInstance().getCurrentUser();
                String uid = user_id.getUid();
                String phone_no = user_id.getPhoneNumber();



                Map<String, Object> childUpdates = new HashMap<>();
                dataRef =  FirebaseDatabase.getInstance().getReference().child("chamber").child(uid);




                // String key = dataRef.push().getKey();


                post_chamber post = new post_chamber("fdfdfdf","test","test","test","test","test","test");
                //  Map<String, Object> postValues = post_chamber.toMap();

                //  childUpdates.put("/"+key,postValues);
                // dataRef.updateChildren(childUpdates);

                //dataRef.child(uid).setValue(post);
                String key =  dataRef.child(uid).push().getKey();
                dataRef.child(key).setValue(post);







            }
        });



    }*/


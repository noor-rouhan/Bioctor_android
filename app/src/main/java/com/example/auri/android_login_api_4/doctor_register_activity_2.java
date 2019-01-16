
package com.example.auri.android_login_api_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class doctor_register_activity_2 extends AppCompatActivity{

    private EditText edit_cert;
    private EditText edit_year;
    private EditText edit_doc_reg;
    private Button reg_button_2;
   // private TextView test_text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_doctor_registration_2);

        //test_text = findViewById(R.id.test_id);
        edit_cert = findViewById(R.id.doctor_certification_id);
        edit_year = findViewById(R.id.doctor_year_id);
        edit_doc_reg = findViewById(R.id.doctor_reg_id);
        reg_button_2 = findViewById(R.id.chem_button_id);

        final Bundle bundle = getIntent().getExtras();
        final String name = bundle.getString("name");
        final String email = bundle.getString("email");
        final String occu = bundle.getString("occu");
        final String desig = bundle.getString("desig");
        final String spec = bundle.getString("spec");

       // String test_message = "name email " + name + " " + email;

       // test_text.setText(test_message);

        reg_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(doctor_register_activity_2.this,doctor_register_activity_3.class);

                String cert = edit_cert.getText().toString();
                intent.putExtra("cert", cert);

                String reg = edit_doc_reg.getText().toString();
                intent.putExtra("reg", reg);

                String year = edit_year.getText().toString();
                intent.putExtra("year", year);

                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("occu",occu);
                intent.putExtra("desig",desig);
                intent.putExtra("spec",spec);

                startActivity(intent);
                finish();

            }
        });



    }
}


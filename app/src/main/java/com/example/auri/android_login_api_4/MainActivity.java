package com.example.auri.android_login_api_4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import android.Manifest;
import android.content.res.AssetManager;
import android.support.v4.app.ActivityCompat;

import android.widget.ArrayAdapter;
import com.wacom.bootstrap.lib.LicenseBootstrap;
import com.wacom.bootstrap.lib.LicenseTokenException;
import com.wacom.cdl.InkDeviceScanner;
import com.wacom.cdl.InkDeviceInfo;
import com.wacom.cdl.InkDevice;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private boolean user_flags;

    private static int SPLASH_TIME_OUT = 2000;


    ///////////////////////////////////////////////


    private final static int STATE_SCANNING = 0;
    private final static int STATE_CONNECTING = 1;
    private final static int STATE_CONNECTED = 2;

    private InkDevice inkDevice;
    private ArrayList<InkDeviceInfo> devicesData = new ArrayList<>();
    private ArrayList<String> devicesNames = new ArrayList<>();
    private ArrayAdapter<String> devicesAdapter;
    private ArrayList<String> deviceProperties = new ArrayList<>();
    private int state;
    private byte[] appId = new byte[]{(byte) 0x11, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x88, (byte) 0x05};
   // private ListView scanListView;
    //private Button scanBtn;
   // private Button transferFilesBtn;
   // private Button liveMode;
    private InkDeviceScanner inkDeviceScanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
      //  int theme = getTHemeFrom
        setContentView(R.layout.activity_main);

        mAuth  = FirebaseAuth.getInstance();

        //////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////

        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);

        AssetManager assetManager = getAssets();
        try {
            InputStream ims = assetManager.open("license.lic");
            LicenseBootstrap.initLicense(this.getApplicationContext(), LicenseBootstrap.readFully(ims));
        } catch (IOException | LicenseTokenException e) {
            e.printStackTrace();
        }



    }

    @Override
    protected void onStart() {

        super.onStart();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ///check if user is signed
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser == null){
            user_flags = false;
        } else{
            user_flags = true;
        }
        // do thing
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (user_flags == false){
                    Intent front_intent = new Intent(MainActivity.this, FrontpageActivity.class);
                    startActivity(front_intent);
                    finish();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,main_landingActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        },SPLASH_TIME_OUT);

    }
}

package com.example.paul14.qmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.paul14.qmedic.GoogleMap.MainActivity;

public class HomeActivity extends AppCompatActivity {

    private ListView docs;

    private static final String TAG = "HomeActivity";

    private static final int ERROR_DIALOG_REQUEST = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

          //DoctorlistvActivity
//        Intent intent = new Intent(HomeActivity.this, DoctorlistvActivity.class);
//        startActivity(intent);

          //CenterlistvActivity
//        Intent intent = new Intent(HomeActivity.this, CenterlistvActivity.class);
//        startActivity(intent);

          //DoctorProfile
//        Intent intent2 = new Intent(HomeActivity.this, DoctorProfile.class);
//        startActivity(intent2);

         //McenterProfile
//        Intent intent2 = new Intent(HomeActivity.this, McenterProfile.class);
//        startActivity(intent2);

        //Google Maps
        // Old Google map fixed code here........

//        Intent intent3 = new Intent(HomeActivity.this, GmapsActivity.class);
//        startActivity(intent3);

        Intent intent4 = new Intent(HomeActivity.this, MainActivity.class); //GoogleMapActivity
        startActivity(intent4);
    }

}

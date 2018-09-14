package com.example.paul14.qmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.paul14.qmedic.center.McenterProfile;
import com.example.paul14.qmedic.doctor.DoctorProfile;

public class HomeActivity extends AppCompatActivity {

    private ListView docs;

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
        Intent intent3 = new Intent(HomeActivity.this, GmapsActivity.class);
        startActivity(intent3);
    }

}

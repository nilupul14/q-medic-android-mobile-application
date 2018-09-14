package com.example.paul14.qmedic.doctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.paul14.qmedic.R;

public class DoctorlistvActivity extends AppCompatActivity {

    ListView lst;
    String[] doctorname = {"Jhone Doy", "Paul Sank", "Alex Watson", "Robin Peterson", "Leesa Vaniz", "Jazz Peter", "Justine Beber "};
    String[] desc = {"Geriatric Medicine Specialists", "Family Physicians", "Emergency Medicine Specialists", "Gastroenterologists ", "Colon and Rectal Surgeons", "Dermatologists ", "Geriatric Medicine Specialists "};
    String[] center = {"Geriatric Medicine Specialists", "Family Physicians", "Emergency Medicine Specialists", "Gastroenterologists ", "Colon and Rectal Surgeons", "Dermatologists ", "Geriatric Medicine Specialists "};
    Integer[] imgid = {R.drawable.profile01, R.drawable.mg1, R.drawable.mg4, R.drawable.mg3, R.drawable.mg2, R.drawable.mg6, R.drawable.mg3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorlistv);

        lst = findViewById(R.id.dlistview);
        DoctorCustomListView customListview = new DoctorCustomListView(this, doctorname, desc, center, imgid);
        lst.setAdapter((customListview));

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(DoctorlistvActivity.this,DoctorProfile.class);
                i.putExtra("position",position);
                startActivity(i);
            }
        });
    }

}

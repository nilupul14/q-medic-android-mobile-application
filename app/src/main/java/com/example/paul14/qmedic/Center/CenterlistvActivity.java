package com.example.paul14.qmedic.Center;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.paul14.qmedic.R;

public class CenterlistvActivity extends AppCompatActivity {

    ListView lstc;

    String[] centername = {"ASIRI Hospital", "Hemas Hospital", "Applo Hospital", "Medi House", " Healthy Life", "Nawaloka Hospital", "Centerl Hospital "};
    String[] tpno = {"0112345643", "+940323786549", "0114097624", " 0417659821 ", "03384556782", "+94753876547 ", "0772677548"};
    String[] address = {"Borella, Colombo 10", "Dalugama, Kiribathgoda", "Waththala, Gampaha", "No23, Kadwatha, Mahara ", " No45/2 Bambalapitiya", "Wellawatta, Colombo 07", "Maradana,Colombo 14"};
    Integer[] imgid = {R.drawable.center1,R.drawable.center2,R.drawable.center3,R.drawable.center4,R.drawable.center6,R.drawable.center7};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centerlistv);

        lstc = findViewById(R.id.mlistview);
        CenterCustomListView centerCustomListView = new CenterCustomListView(this, centername, tpno, address, imgid);
        lstc.setAdapter((centerCustomListView));

    }

    //
}

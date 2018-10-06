package com.example.paul14.qmedic.Appointment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.paul14.qmedic.HomeActivity;
import com.example.paul14.qmedic.R;

import static com.example.paul14.qmedic.R.id.spinner_doctors;

public class AppointmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        Spinner doctorSpinner = (Spinner) findViewById(R.id.spinner_doctors);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(AppointmentActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.doctors_name));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        doctorSpinner.setAdapter(myAdapter);
    }
}

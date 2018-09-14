package com.example.paul14.qmedic.doctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paul14.qmedic.R;

public class DoctorProfile extends AppCompatActivity {

    private TextView name;
    private TextView address;
    private TextView email;
    private TextView phone;
    private TextView twitter;
    private TextView appointment;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_profile);


        name = findViewById(R.id.tv_name);
        address = findViewById(R.id.tv_address);
        email = findViewById(R.id.email2);
        phone = findViewById(R.id.phone2);
        twitter = findViewById(R.id.twitter2);
//        image = findViewById(R.id.userImage);

        Intent intent = getIntent();

        int pos = intent.getIntExtra("position",0);

        switch (pos) {
            case 0: {

                setData("Jhone Doy","Kelaniya, Sri Lanka","a@a.com","1234567898","jd@twiiter.com");
                break;

            }

            case 1: {

                setData("Paul Sank","Kiribathgoda, Sri Lanka","paul@a.com","2589632587","paul@twiiter.com");
                break;

            }

            case 2: {

                setData("Alex Watson","Kadawatha, Sri Lanka","alex@a.com","4565658526","alex@twiiter.com");
                break;

            }

            default: {

                setData("Jhone Doy","Kelaniya, Sri Lanka","a@a.com","1234567898","jd@twiiter.com");
                break;

            }
        }
    }

    private void setData(String name, String address, String email,String phone,String twitter) {

        this.name.setText(name);
        this.address.setText(address);
        this.email.setText(email);
        this.phone.setText(phone);
        this.twitter.setText(twitter);
    }
}

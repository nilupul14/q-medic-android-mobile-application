package com.example.paul14.qmedic.AccountActivity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.example.paul14.qmedic.R;
import com.example.paul14.qmedic.SidemenuActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText loginEmail;
    private EditText loginPassword;
    private Button login_btn;
    private Button singup_btn;
    private Button forgotPassword_btn;

    RelativeLayout rellay1, rellay2;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rellay1 = (RelativeLayout) findViewById(R.id.rellayl);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);

        loginEmail = (EditText) findViewById(R.id.loginEmail);
        loginPassword = (EditText) findViewById(R.id.loginPassword);
        login_btn = (Button) findViewById(R.id.login_btn);
        singup_btn = (Button) findViewById(R.id.singup_btn);
        forgotPassword_btn = (Button) findViewById(R.id.forgotPassword_btn);

        long delayMillis;
        handler.postDelayed(runnable, 2000);

        findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SidemenuActivity.class));
            }
        });

        findViewById(R.id.singup_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
            }
        });

    }
}

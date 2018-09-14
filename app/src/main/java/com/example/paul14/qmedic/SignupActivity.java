package com.example.paul14.qmedic;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignupActivity extends AppCompatActivity {

    private EditText fname;
    private EditText lname;
    private EditText email;
    private EditText pword;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        email = findViewById(R.id.email_reg);
        pword = findViewById(R.id.pword_reg);
        mAuth = FirebaseAuth.getInstance();
        findViewById(R.id.signup2_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstname = fname.getText().toString();
                String lastname = lname.getText().toString();
                String Email = email.getText().toString();
                String pw = pword.getText().toString();

//                mAuth.createUserWithEmailAndPassword(Email, pw)
//                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if (task.isSuccessful()) {
//                                    // Sign in success, update UI with the signed-in user's information
//                                    Log.d(TAG, "createUserWithEmail:success");
//                                    FirebaseUser user = mAuth.getCurrentUser();
////                                    updateUI(user);
//                                } else {
//                                    // If sign in fails, display a message to the user.
////                                    Log.w(TAG, "createUserWithEmail:failure", task.getException());
//                                    Toast.makeText(getApplicationContext(), "Authentication failed.",
//                                            Toast.LENGTH_SHORT).show();
////                                    updateUI(null);
//                                }
//
//                                // ...
//                            }
//                        });

            //    startActivity(new Intent(SignupActivity.this, LoginActivity.class));
            }
        });
    }

}

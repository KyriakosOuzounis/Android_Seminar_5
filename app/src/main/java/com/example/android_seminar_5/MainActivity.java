package com.example.android_seminar_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_submit = findViewById(R.id.btn_submit);
        final EditText ed_name = findViewById(R.id.ed_name);
        final EditText ed_lastname = findViewById(R.id.ed_lastname);
        final EditText ed_email = findViewById(R.id.ed_email);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameText = ed_name.getText().toString();
                String lastnameText = ed_lastname.getText().toString();
                String emailText = ed_email.getText().toString();

                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("nameText", nameText);
                intent.putExtra("lastnameText" , lastnameText);
                intent.putExtra("emailText", emailText);

                startActivity(intent);
            }
        });
    }
}

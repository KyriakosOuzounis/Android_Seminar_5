package com.example.android_seminar_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText ed_name_2 = findViewById(R.id.ed_name_2);
        EditText ed_lastname_2 = findViewById(R.id.ed_lastname_2);
        EditText ed_email_2 = findViewById(R.id.ed_email_2);

        String ed_strname_2 = getIntent().getExtras().getString("nameText" , "");
        String ed_strlastname_2 = getIntent().getExtras().getString("lastnameText" , "");
        String ed_stremail_2 = getIntent().getExtras().getString("emailText" , "");

        ed_name_2.setText(ed_strname_2);
        ed_lastname_2.setText(ed_strlastname_2);
        ed_email_2.setText(ed_stremail_2);
    }
}

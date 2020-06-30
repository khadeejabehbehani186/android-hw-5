package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();

         TextView name  = findViewById(R.id.textView2);
         TextView age  = findViewById(R.id.textView3);
         TextView  job = findViewById(R.id.textView4);
         TextView number  = findViewById(R.id.textView5);
         TextView email = findViewById(R.id.textView6);

       name.setText(b.getString ("name"));
       age.setText(b.getString ( "age"));
       job.setText(b.getString ( "job"));
       number.setText(b.getString ( "number"));
       email.setText(b.getString ( "email"));





    }

    private void getString(String key2) {
    }
}
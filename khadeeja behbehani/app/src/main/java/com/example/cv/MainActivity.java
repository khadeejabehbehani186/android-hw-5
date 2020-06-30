package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public abstract class MainActivity extends AppCompatActivity {

    private Object EditText;
    private Object Button;

    Intent sendemail = new (Intent.ACTION_SEND);
     sendemail.setData(Uri.parse("mailto:"));
     sendemail.setType("message\rfc822");
     sendemail.putExtra(Intent.EXTRA_EMAIL , "kuwaitkwt30@gmail.com")
     startActivity(sendemail);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name  = findViewById(R.id.name);
        final EditText age  = findViewById(R.id.age);
        final EditText  job = findViewById(R.id.job);
        final EditText number  = findViewById(R.id.number);
        final EditText email = findViewById(R.id.email);
        Button Next  =  findViewById(R.id.button);


        textViewEmail

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cv = new Intent(MainActivity.this,MainActivity2.class);
                cv.putExtra("name" , name.getText().toString());
                cv.putExtra("age" , age.getText().toString());
                cv.putExtra("job" , job.getText().toString());
                cv.putExtra("number" , number.getText().toString());
                cv.putExtra("email" , email.getText().toString());
                startActivity(cv);



            }
        });

    }
}
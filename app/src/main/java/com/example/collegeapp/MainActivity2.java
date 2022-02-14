package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
AppCompatButton b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed1=findViewById(R.id.p_name);
        ed2=findViewById(R.id.ph_no);
        ed3=findViewById(R.id.mail_id);
        ed4=findViewById(R.id.pass_id2);
        ed5=findViewById(R.id.pass_id1);
        b3=findViewById(R.id.sbt3);
        b4=findViewById(R.id.sbt4);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,mail,pass1,pass2,ph;
                pass1=ed4.getText().toString();
                pass2=ed5.getText().toString();
                mail=ed1.getText().toString();
                name=ed3.getText().toString();
                ph=ed2.getText().toString();
                if(pass1.equals(pass2)){

                    Toast.makeText(getApplicationContext(), "succesfully registered ", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), mail, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), ph, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "password and confirm password doesn't matches  ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(g);
            }
        });

    }
}
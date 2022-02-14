package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.mailid);
        ed2=findViewById(R.id.pswd);
        b1=findViewById(R.id.sbt1);
        b2=findViewById(R.id.sbt2);
        String mail_Id,pass_Word;
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(u);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail_Id,pass_Word;
                mail_Id=ed1.getText().toString();
                pass_Word=ed2.getText().toString();
               if(mail_Id.equals("admin@gmail.com")&& pass_Word.equals("12345"))
               {
                   Intent g=new Intent(MainActivity.this,DashboardActivity.class);
                   startActivity(g);
               }
               else
               {
                   Toast.makeText(getApplicationContext(), "id or pasword is not correct", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}
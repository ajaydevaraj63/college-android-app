package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    String mail_Id,pass_Word,prefvalue;
    SharedPreferences mypreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1=findViewById(R.id.mailid);
        ed2=findViewById(R.id.pswd);
        b1=findViewById(R.id.sbt1);
        b2=findViewById(R.id.sbt2);
        mypreferences=getSharedPreferences("login",MODE_PRIVATE);
        prefvalue=mypreferences.getString("email",null);

        if(prefvalue!= null){
            Intent i =new Intent(getApplicationContext(),DashboardActivity.class);
            startActivity(i);
        }

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
                mail_Id=ed1.getText().toString();
                pass_Word=ed2.getText().toString();
               if(mail_Id.equals("admin@gmail.com")&& pass_Word.equals("12345"))
               {
                   SharedPreferences.Editor MyEdit= mypreferences.edit();
                   MyEdit.putString("email",mail_Id);
                   MyEdit.commit();

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
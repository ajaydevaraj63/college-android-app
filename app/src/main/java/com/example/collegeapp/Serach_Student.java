package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Serach_Student extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serach_student);
        ed1=findViewById(R.id.search_std_adsn_no);
        b1=findViewById(R.id.search_std_btn1);
        b2=findViewById(R.id.search_std_btn2);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent(Serach_Student.this,DashboardActivity.class);
                startActivity(h);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String std_adsn;
                std_adsn=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),std_adsn, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
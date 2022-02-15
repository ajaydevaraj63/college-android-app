package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
   AppCompatButton b1,b2,b3,b4,b5,b6;
   SharedPreferences mypreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    b1=findViewById(R.id.dasgBoardbtn1);
    b2=findViewById(R.id.dasgBoardbtn2);
    b3=findViewById(R.id.dasgBoardbtn3);
    b4=findViewById(R.id.dasgBoardbtn4);
    b5=findViewById(R.id.dasgBoardbtn5);
    b6=findViewById(R.id.dasgBoardbtn6);
    mypreferences=getSharedPreferences("login",MODE_PRIVATE);
    b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(DashboardActivity.this,Add_Student.class);
                startActivity(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(DashboardActivity.this,Add_Faculty.class);
                startActivity(a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(DashboardActivity.this,Serach_Student.class);
                startActivity(a);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(DashboardActivity.this,Search_Faculty.class);
                startActivity(a);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(DashboardActivity.this,View_Website.class);
                startActivity(a);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor MyEdit= mypreferences.edit();
                MyEdit.clear();
                MyEdit.commit();
                Intent a=new Intent(DashboardActivity.this,MainActivity.class);
                startActivity(a);
            }
        });
    }

}
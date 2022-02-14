package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Search_Faculty extends AppCompatActivity {
EditText ed1;
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_faculty);
    ed1=findViewById(R.id.search_fclt_name);
    b1=findViewById(R.id.search_fclt_btn1);
    b2=findViewById(R.id.search_fclt_btn2);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String fclt_name;
            fclt_name=ed1.getText().toString();
            Toast.makeText(getApplicationContext(),fclt_name, Toast.LENGTH_SHORT).show();
        }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent(Search_Faculty.this,DashboardActivity.class);
                startActivity(h);
            }
        });


    }


}
package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Add_Student extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=findViewById(R.id.std_name);
        ed2=findViewById(R.id.std_roll_no);
        ed3=findViewById(R.id.std_addmn_no);
        ed4=findViewById(R.id.std_clg_name);
        b1=findViewById(R.id.std_sub_btn1);
        b2=findViewById(R.id.std_sub_btn2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_name,s_roll,s_adn,s_clg;
                s_name=ed1.getText().toString();
                s_roll=ed2.getText().toString();
                s_adn=ed3.getText().toString();
                s_clg=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),s_name, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s_roll, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s_adn, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s_clg, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent(Add_Student.this,DashboardActivity.class);
                startActivity(h);
            }
        });
    }
}
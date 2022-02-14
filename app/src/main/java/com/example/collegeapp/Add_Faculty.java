package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Add_Faculty extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
    ed1=findViewById(R.id.fclt_name);
    ed2=findViewById(R.id.fclt_dpmt);
    ed3=findViewById(R.id.fclt_qlf);
    ed4=findViewById(R.id.fclt_num);
    ed5=findViewById(R.id.fclt_mail);
    b1=findViewById(R.id.fclt_sub_btn1);
    b2=findViewById(R.id.fclt_sub_btn2);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name,dp_tno,qlf,num,mail,std_details;
            name=ed1.getText().toString();
            dp_tno=ed2.getText().toString();
            qlf=ed3.getText().toString();
            num=ed4.getText().toString();
            mail=ed5.getText().toString();
            Toast.makeText(getApplicationContext(),name, Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),dp_tno, Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),qlf, Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),num, Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),mail, Toast.LENGTH_SHORT).show();
        }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent(Add_Faculty.this,DashboardActivity.class);
                startActivity(h);
            }
        });
    }

}
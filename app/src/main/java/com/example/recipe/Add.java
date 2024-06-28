package com.example.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Add extends AppCompatActivity {
    EditText et1,et2,et3;
    AppCompatButton res,bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        et1=(EditText) findViewById(R.id.addet1);
        et2=(EditText) findViewById(R.id.addet2);
        et3=(EditText) findViewById(R.id.addet3);
        res=(AppCompatButton) findViewById(R.id.addsub);
        bck=(AppCompatButton) findViewById(R.id.addbck);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EnteredTitle=et1.getText().toString();
                String EnteredDesc=et2.getText().toString();
                String EnteredPname=et3.getText().toString();
                Toast.makeText(getApplicationContext(),EnteredTitle+" "+EnteredDesc+" "+EnteredPname,Toast.LENGTH_LONG).show();
            }
        });
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
            }
        });

    }
}
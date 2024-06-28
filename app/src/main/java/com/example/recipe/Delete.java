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

public class Delete extends AppCompatActivity {
    EditText et1;
    AppCompatButton res,bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_delete);
        et1=(EditText) findViewById(R.id.delet);
        res=(AppCompatButton) findViewById(R.id.delbtn);
        bck=(AppCompatButton) findViewById(R.id.delbck);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EnteredTitle=et1.getText().toString();
                Toast.makeText(getApplicationContext(),"Deleted:"+EnteredTitle,Toast.LENGTH_LONG).show();
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
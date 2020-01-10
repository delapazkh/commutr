package com.delapazkh.commutr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView regtxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    regtxt = findViewById(R.id.regtxt);
    regtxt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                openRegister();
            }

        });
    }

    public  void  openRegister(){

        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
}
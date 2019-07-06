package com.example.extensivecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Trapesium extends AppCompatActivity {
    private EditText height;
    private EditText roof;
    private EditText base;
    private TextView result;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trapesium);
        height = (EditText) findViewById(R.id.height);
        roof = (EditText)findViewById(R.id.roof);
        base = (EditText) findViewById(R.id.base);
        result = (TextView)findViewById(R.id.result1);
    }
    public void back (View v){
        Intent intent= new Intent(Trapesium.this, MainActivity.class);
        startActivity (intent);

    }

    public void count (View v){
        String heights = height.getText().toString();
        String bases = base.getText().toString();
        String roofs = roof.getText().toString();
        if (heights.equals("") || bases.equals("") || roofs.equals("")){
            Toast.makeText(Trapesium.this, "dont fill it empty", Toast.LENGTH_LONG).show();

        }
        else {
            int height = Integer.parseInt(heights);
            int base = Integer.parseInt(bases);
            int roof = Integer.parseInt (roofs);
            result.setText(String.valueOf((height*base*roof)/2));
        }
    }

}

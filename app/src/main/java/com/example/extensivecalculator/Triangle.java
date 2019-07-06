package com.example.extensivecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Triangle extends AppCompatActivity {
    private EditText base;
    private EditText height;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle);
        base = (EditText) findViewById(R.id.base);
        height = (EditText)findViewById(R.id.height);
        result = (TextView)findViewById(R.id.result1);
    }

    public void back (View v){
        Intent intent= new Intent(Triangle.this, MainActivity.class);
        startActivity (intent);

    }

    public void count (View v){
        String bases = base.getText().toString();
        String heights = height.getText().toString();
        if (bases.equals("") || heights.equals("")){
            Toast.makeText(Triangle.this, "dont fill it empty", Toast.LENGTH_LONG).show();
        }else {
            int bsae = Integer.parseInt(bases);
            int height = Integer.parseInt(heights);
            result.setText(String.valueOf((bsae*height)/2));
        }
    }

}

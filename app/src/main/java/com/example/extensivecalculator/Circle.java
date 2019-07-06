package com.example.extensivecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Circle extends AppCompatActivity {
    protected TextView result;
    protected EditText radius;
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);
        radius = (EditText) findViewById(R.id.radius);
        result = (TextView)findViewById(R.id.result1);
    }

    public void count (View v ){
        String radiuss = radius.getText().toString();
        if(radiuss.equals("")){
            Toast.makeText(Circle.this, "dont fill it empty", Toast.LENGTH_LONG).show();
        }
        else {
            double radius = Double.parseDouble(radiuss);
            result.setText(String.valueOf((22/7)*radius));
        }
    }
    public void back (View v){
        Intent intent= new Intent(Circle.this, MainActivity.class);
        startActivity (intent);

    }
}

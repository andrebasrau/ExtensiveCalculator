package com.example.extensivecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.function.IntConsumer;

public class Square extends AppCompatActivity {

    private TextView result;
    private EditText side;
//    private String sides;
//    private Button count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square);
        result = (TextView)findViewById(R.id.result1);
        side = (EditText) findViewById(R.id.side);
//        count = (Button)findViewById(R.id.count);
//        count.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String sides = side.getText().toString();
//                if (sides.equals("")){
//                    Toast.makeText(Square.this, "dont fill it empty", Toast.LENGTH_SHORT).show();
//                }else {
//                    int extensive;
//                    int value = Integer.parseInt(sides);
//                    extensive = value*value;
//                    result.setText(String.valueOf(extensive));
//                }
//            }
//        });

    }

    public void back (View v){
        Intent intent= new Intent(Square.this, MainActivity.class);
        startActivity (intent);

    }

    public void count (View v){
        String sides = side.getText().toString();
        if (sides.equals("")){
            Toast.makeText(Square.this, "dont fill it empty", Toast.LENGTH_SHORT).show();
        }else {
            int extensive;
            int value = Integer.parseInt(sides);
            extensive = value*value;
            result.setText(String.valueOf(extensive));
        }
    }
}

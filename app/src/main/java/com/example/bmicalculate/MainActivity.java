    package com.example.bmicalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enter = (Button) findViewById(R.id.enter);
        EditText htet = (EditText) findViewById(R.id.htet);
        EditText wtet = (EditText) findViewById(R.id.wtet);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float wt = Float.parseFloat(wtet.getEditableText().toString());
                float ht = Float.parseFloat(htet.getEditableText().toString());
                float BMI;
                ht=ht/100;
                ht=ht*ht;
                BMI=wt/ht;

                TextView result = (TextView) findViewById(R.id.result);
                result.setText("使用者為"+ BMI) ;
            }
        });
    }
}
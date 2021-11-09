package com.example.bmicalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        Float text = bundle.getFloat("text");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("你的BMI為:" + text);
        if(text<18.5){
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            textView3.setText("你的體重過輕");
        }else if(text>=18.5 & text<24){
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            textView3.setText("你的體重正常");
        }else if(text >= 24 & text < 27){
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            textView3.setText("你的體重過重");
        }else if(text >= 27 & text < 30 ){
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            textView3.setText("你的體重輕度肥胖");
        }else if(text >=30 & text < 35){
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            textView3.setText("你的體重中度肥胖");
        }else if(text >= 35){
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            textView3.setText("你的體重重度肥胖");
        }
    }
}
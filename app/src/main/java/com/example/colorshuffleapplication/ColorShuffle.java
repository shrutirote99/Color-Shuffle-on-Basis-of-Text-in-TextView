package com.example.colorshuffleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ColorShuffle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shuffle_color);

        TextView textView1,textView2,textView3;
        EditText EdtTxt1;
        Button BtnPress;

        textView1 = findViewById(R.id.TxtVw1);
        textView2 = findViewById(R.id.TxtVw2);
        textView3 = findViewById(R.id.TxtVw3);
        EdtTxt1 = findViewById(R.id.EdtTxt1);
        BtnPress = findViewById(R.id.BtnClr);

        BtnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = EdtTxt1.getText().toString();

                if(s.equals("One")) {
                    textView1.setBackgroundColor(getResources().getColor(R.color.yellow));
                    textView2.setBackgroundColor(getResources().getColor(R.color.green));
                    textView3.setBackgroundColor(getResources().getColor(R.color.green));
                }else if (s.equals("Two")) {
                    textView1.setBackgroundColor(getResources().getColor(R.color.green));
                    textView2.setBackgroundColor(getResources().getColor(R.color.yellow));
                    textView3.setBackgroundColor(getResources().getColor(R.color.green));
                }else if(s.equals("Three")) {
                    textView1.setBackgroundColor(getResources().getColor(R.color.green));
                    textView2.setBackgroundColor(getResources().getColor(R.color.green));
                    textView3.setBackgroundColor(getResources().getColor(R.color.yellow));
                }else{
                    textView1.setBackgroundColor(getResources().getColor(R.color.red));
                    textView2.setBackgroundColor(getResources().getColor(R.color.red));
                    textView3.setBackgroundColor(getResources().getColor(R.color.red));
                }
            }
        });

    }
}
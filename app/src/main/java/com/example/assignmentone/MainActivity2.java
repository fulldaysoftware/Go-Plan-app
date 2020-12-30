package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


TextView ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent inte = getIntent();
        int x = inte.getExtras().getInt("rec");
        ts= findViewById(R.id.textView2);
        ts.setText(String.valueOf(x));
    }
}
package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public int a=0;
int x;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t= (TextView) findViewById(R.id.textView);

    }

    public void count(View view) {
        a++;
        x= a;
        t.setText(String.valueOf(a));
    }

    public void calls(View view) {
        Intent intent= new Intent(this, MainActivity2.class);
        intent.putExtra("rec", x);
        startActivity(intent);

    }
}
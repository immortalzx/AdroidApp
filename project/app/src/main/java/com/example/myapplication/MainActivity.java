package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText edt = findViewById(R.id.textView);
        Button btn = findViewById(R.id.btnpush);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pushdata();
            }
        });
    }

    private void pushdata() {
    }
}
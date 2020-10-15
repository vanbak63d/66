package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = findViewById(R.id.et_name);
        getWindow().getDecorView().getSystemUiVisibility() = View.SYSTEM_UI_FLAG_FULLSCREEN;
        Button btn_start = (Button) findViewById(R.id.btn_start);

        btn_start.setOnClickListener(){
            if(et_name.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
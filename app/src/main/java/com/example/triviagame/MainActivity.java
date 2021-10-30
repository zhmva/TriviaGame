package com.example.triviagame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.user);
    }

    public void sendResultClick(View view) {
            Intent intent = new Intent(MainActivity.this, Register.class);
            String data = next.getText().toString();
            intent.putExtra("textKey", data);
            startActivity(intent);

        }
}
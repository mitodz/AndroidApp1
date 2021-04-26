package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMain:
                Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMain = findViewById(R.id.btnMain);
        btnMain.setOnClickListener(this);
        btnMain.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Loooong", Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }


}
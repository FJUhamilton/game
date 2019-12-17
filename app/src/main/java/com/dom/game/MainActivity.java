package com.dom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();

    }
    public void findview(){
        findViewById(R.id.arrowup).setOnClickListener(this);
        findViewById(R.id.arrowdown).setOnClickListener(this);
        findViewById(R.id.arrowleft).setOnClickListener(this);
        findViewById(R.id.arrowright).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrowup:
                Log.d("MainActivity","onClick:UP");
                break;
            case R.id.arrowdown:
                Log.d("MainActivity","onClick:DOWN");
                break;
            case R.id.arrowleft:
                Log.d("MainActivity","onClick:LEFT");
                break;
            case R.id.arrowright:
                Log.d("MainActivity","onClick:RIGHT");
                break;

        }

    }
}

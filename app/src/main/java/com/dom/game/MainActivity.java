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
        findViewById(R.id.button_up).setOnClickListener(this);
        findViewById(R.id.button_down).setOnClickListener(this);
        findViewById(R.id.button_left).setOnClickListener(this);
        findViewById(R.id.button_right).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_up:
                Log.d("MainActivity","onClick:UP");
                break;
            case R.id.button_down:
                Log.d("MainActivity","onClick:DOWN");
                break;
            case R.id.button_left:
                Log.d("MainActivity","onClick:LEFT");
                break;
            case R.id.button_right:
                Log.d("MainActivity","onClick:RIGHT");
                break;

        }

    }
}
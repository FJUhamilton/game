package com.dom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private GameView gameview;

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
        gameview = findViewById(R.id.game);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrowup:
                Log.d("MainActivity","onClick:UP");
                if(gameview.posY>150)
                gameview.posY=gameview.posY-50;
                gameview.invalidate();
                break;
            case R.id.arrowdown:
                Log.d("MainActivity","onClick:DOWN");
                if(gameview.posY<1400)
                gameview.posY=gameview.posY+50;
                gameview.invalidate();
                break;
            case R.id.arrowleft:
                Log.d("MainActivity","onClick:LEFT");
                if(gameview.posX>10)
                    gameview.posX=gameview.posX-50;
                gameview.invalidate();
                break;
            case R.id.arrowright:
                Log.d("MainActivity","onClick:RIGHT");
                if(gameview.posX<1300)
                    gameview.posX=gameview.posX+50;
                gameview.invalidate();
                break;

        }

    }
}

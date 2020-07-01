package com.example.tg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView yojana1, yojana2,yojana3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      yojana1 = findViewById(R.id.yojana1);
      yojana2 = findViewById(R.id.yojana2);
      yojana3 = findViewById(R.id.yojana3);

      yojana1.setOnClickListener(this);
      yojana2.setOnClickListener(this);
      yojana3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.yojana1:
                intent = new Intent(this, ScrollingActivity.class);
                startActivity(intent);
                break;
                case R.id.yojana2:
                intent = new Intent(this,SanjayNiradhar.class);
                startActivity(intent);
                break;
                case R.id.yojana3:
                intent = new Intent(this, Naya.class);
                startActivity(intent);
                break;
                default: break;
        }
    }
}

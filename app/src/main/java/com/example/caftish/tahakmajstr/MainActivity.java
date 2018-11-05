package com.example.caftish.tahakmajstr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    public void setToMath(View view) {
        Intent intent = new Intent(MainActivity.this, MathActivity.class);
        startActivity(intent);
    }
    public void setToPhys(View view) {
        Intent intent = new Intent(MainActivity.this, PhysActivity.class);
        startActivity(intent);
    }
}

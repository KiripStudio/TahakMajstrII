package com.example.caftish.tahakmajstr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }
    public void gotoZlomky(View view) {
        Intent intent = new Intent(MathActivity.this, PhysActivity.class);
        startActivity(intent);
    }
    public void gotoProcenta(View view) {
        Intent intent = new Intent(MathActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

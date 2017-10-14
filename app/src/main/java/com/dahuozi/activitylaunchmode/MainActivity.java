package com.dahuozi.activitylaunchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        Intent intent =null;
        switch (view.getId()){
            case R.id.btn1:
                intent = new Intent(MainActivity.this,MainActivity.class);
                break;
            case R.id.btn2:
                intent = new Intent(MainActivity.this,OtherActivity.class);
                break;
        }
        startActivity(intent);
    }
}

package com.dahuozi.activitylaunchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by lenovo on 2017/10/14.
 * 新
 */

public class OtherActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }
    public void click(View view){
        Intent intent =null;
        switch (view.getId()){
            case R.id.btn3:
                intent =new  Intent(OtherActivity.this,MainActivity.class);
                break;
            case R.id.btn4:
                intent = new Intent(OtherActivity.this,OtherActivity.class);
                break;
        }
        startActivity(intent);
    }
}

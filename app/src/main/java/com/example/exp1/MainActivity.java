package com.example.exp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","调用成功");

    }
    @Override
    protected  void onStart(){
        super.onStart();
        Log.i("MainActivityLife","onStart()");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.i("MainActivityLife","onPause()");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.i("MainActivityLife","onResume()");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i("MainActivityLife","onStop()");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("MainActivityLife","onDestroy()");
    }
}


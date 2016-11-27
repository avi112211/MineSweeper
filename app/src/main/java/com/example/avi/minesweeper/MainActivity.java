package com.example.avi.minesweeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyButtonListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void buttonClick(MyButton myButton) {

    }

    @Override
    public void buttonLongClick(MyButton myButton) {

    }
}

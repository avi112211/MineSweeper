package com.example.avi.minesweeper;

import android.view.View;

/**
 * Created by Avi on 27/11/2016.
 */
public class MyButton implements View.OnClickListener, View.OnLongClickListener
{
    private int row;
    private int col;
    private MyButtonListener listener;

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}

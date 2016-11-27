package com.example.avi.minesweeper;

import android.content.Context;
import android.view.View;
import android.widget.Button;

/**
 * Created by Avi on 27/11/2016.
 */
public class MyButton extends Button implements View.OnClickListener, View.OnLongClickListener
{
    private int row;
    private int col;
    private MyButtonListener listener;

    public MyButton(Context context)
    {
        super(context);

        setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setListener(MyButtonListener listener) {
        this.listener = listener;
    }
}

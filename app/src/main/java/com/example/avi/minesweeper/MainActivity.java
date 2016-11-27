package com.example.avi.minesweeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyButtonListener{

    private static final int COLS = 2;
    private static final int ROWS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        LinearLayout startPage = new LinearLayout(getApplicationContext());
        startPage.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        //layoutParams.setMargins(300, 200, 300, 100);


        //Title - MineSweeper
        TextView title = new TextView(this);
        title.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        title.setTextSize(50);
        title.setText("MineSweeper");
        startPage.addView(title);

        //diff - MineSweeper
        TextView diff = new TextView(this);
        diff.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        diff.setTextSize(30);
        diff.setText("Select difficulty");
        startPage.addView(diff);

        //grid for diff select
        GridLayout grid = new GridLayout(getApplicationContext());
        grid.setOrientation(GridLayout.HORIZONTAL);
        grid.setColumnCount(COLS);
        grid.setRowCount(ROWS);
        grid.setId(0);

        //Easy section
        Button easy = new MyButton(this);
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        easy.setText("Easy");
        grid.addView(easy);

        TextView easyTime = new TextView(this);
        easyTime.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        easyTime.setTextSize(20);
        easyTime.setText("00:00");
        grid.addView(easyTime);

        //Medium section
        Button medium = new MyButton(this);
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        medium.setText("Medium");
        grid.addView(medium);

        TextView mediumTime = new TextView(this);
        mediumTime.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        mediumTime.setTextSize(20);
        mediumTime.setText("00:00");
        grid.addView(mediumTime);

        //Hard section
        Button hard = new MyButton(this);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        hard.setText("Hard");
        grid.addView(hard);

        TextView hardTime = new TextView(this);
        hardTime.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        hardTime.setTextSize(20);
        hardTime.setText("00:00");
        grid.addView(hardTime);

        startPage.addView(grid);



        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.activity_main);
        relativeLayout.addView(startPage, layoutParams);

    }

    @Override
    public void buttonClick(MyButton myButton) {

    }

    @Override
    public void buttonLongClick(MyButton myButton) {

    }
}

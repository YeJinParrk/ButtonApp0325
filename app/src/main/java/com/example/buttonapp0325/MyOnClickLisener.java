package com.example.buttonapp0325;

import android.view.View;

public class MyOnClickLisener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickLisener(MainActivity mainActivity) {
       this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView.setText("You clicked 박예진의 button");
    }
}

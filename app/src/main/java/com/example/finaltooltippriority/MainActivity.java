package com.example.finaltooltippriority;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new Controller();
        controller.init(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (controller != null) {
            controller.dismiss();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        // Show the tooltip when the window gains focus and the activity is visible
        if (hasFocus && controller != null) {
            controller.triggerNextTooltip();
        }
    }
}
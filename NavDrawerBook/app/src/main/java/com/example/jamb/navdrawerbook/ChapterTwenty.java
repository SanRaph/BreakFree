package com.example.jamb.navdrawerbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;
public class ChapterTwenty extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper viewFlipper;
    Button next;
    Button previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twenty);
        viewFlipper = findViewById(R.id.viewFlipper);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);
        next.setOnClickListener(this);
        previous.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == next) {
            viewFlipper.showNext();
        }
        else if (v == previous) {
            viewFlipper.showPrevious();
        }
    }
}
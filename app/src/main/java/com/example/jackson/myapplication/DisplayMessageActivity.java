package com.example.jackson.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //receiving the message
        Intent intent = getIntent();
        String message = intent.getStringExtra(principalActivity.EXTRA_MESSAGE);

        //set the message to the TextView
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}

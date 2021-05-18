package com.bistu.xudachui.messager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_activity);
        //获得intent的引用
        Intent intent = getIntent();
        //根据key值取出value
        String message = intent.getStringExtra(CreateMessageActivity.MESSAGE_KEY);
        //获得文本引用，设置文字
        TextView textView = findViewById(R.id.output);
        textView.setText(message);
    }

}
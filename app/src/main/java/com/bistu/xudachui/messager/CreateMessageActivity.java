package com.bistu.xudachui.messager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {
    public  static  final String MESSAGE_KEY = "bistu.xudachui。messager" ;//字符串随便写什么都行

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
 //对按键进行操作
    public void onSendMessage( android.view.View button ){
        //TODO跳转
        //获得编辑框的引用
        EditText editText = findViewById(R.id.input);
        //取出编辑框文字
        String message = editText.getText().toString();
/*  //同一个app中界面的切换
      //安卓界面跳转是通过架构层进行的，所以要用一个信使（intent）
        Intent intent = new Intent (this,ReceiveMessageActivity.class);
       //再从intent附加消息
        intent.putExtra(MESSAGE_KEY,message);
        */
        //切换到另一个app的界面
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(intent.EXTRA_TEXT,message);
        startActivity(intent);
    }
}
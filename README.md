# Messager_android  
这仅仅是记录自己安卓学习的过程  
## Fuction  
实现简单的信息发送的功能，可以在一个界面输入一个文本，在另一个页面显示出来；也可以启动手机中其他的app发送文本信息。  
### operation interface  
<div align="center">
<img src="https://ftp.bmp.ovh/imgs/2021/05/b8a60aeee21a04b0.png" height="330" width="190" > 
   </div>
第一种情况：App内信息传送  
<div align="center">
<img src="https://ftp.bmp.ovh/imgs/2021/05/9e47cf4dd7080f42.png" height="330" width="190" >
<img src="https://ftp.bmp.ovh/imgs/2021/05/9e47cf4dd7080f42.png" height="330" width="190" >
<img src="https://ftp.bmp.ovh/imgs/2021/05/c4b7680c9f26b7d8.png" height="330" width="190" >
  </div>
第二种情况：启动其他App  
 <div align="center">
<img src="https://ftp.bmp.ovh/imgs/2021/05/9e47cf4dd7080f42.png" height="330" width="190" >
<img src="https://ftp.bmp.ovh/imgs/2021/05/9e47cf4dd7080f42.png" height="330" width="190" >
<img src="https://ftp.bmp.ovh/imgs/2021/05/5874a36e2c0b7d2c.png" height="330" width="190" >
<img src="https://ftp.bmp.ovh/imgs/2021/05/e52c522de6577dcd.png" height="330" width="190" >
  </div>  
  
切换两种方案的代码：
```
    public void onSendMessage( android.view.View button ){
        //TODO跳转
        //获得编辑框的引用
        EditText editText = findViewById(R.id.input);
        //取出编辑框文字
        String message = editText.getText().toString();
  //同一个app中界面的切换
      //安卓界面跳转是通过架构层进行的，所以要用一个信使（intent）
        Intent intent = new Intent (this,ReceiveMessageActivity.class);
       //再从intent附加消息
        intent.putExtra(MESSAGE_KEY,message);
/*  //切换到另一个app的界面
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(intent.EXTRA_TEXT,message);
        */
        startActivity(intent);
    }
}
```
主要利用的核心代码是`intent.putExtra(“key”,data);`  
**putExtra("A", B)** 方法中，AB为键值对，第一个参数为键名，第二个参数为键对应的值，这个值才是真正要传递的数据。

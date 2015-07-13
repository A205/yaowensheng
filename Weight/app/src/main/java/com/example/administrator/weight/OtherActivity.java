package com.example.administrator.weight;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Toast;

public class OtherActivity extends ActionBarActivity{
   protected  void onCreat(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.otherlayout);
       //取数据
       Intent intent=getIntent();
    String shengao=intent.getStringExtra("身高");
    String tizhong = intent.getStringExtra("体重");
       String GMI=intent.getStringExtra("GMI");
      Toast.makeText(this,"身高:"+shengao+"体重:"+tizhong+"GMI:"+GMI,Toast.LENGTH_SHORT).show();
   }
}








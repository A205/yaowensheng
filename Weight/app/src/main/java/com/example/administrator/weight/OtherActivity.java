package com.example.administrator.weight;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Toast;

public class OtherActivity extends ActionBarActivity{
   protected  void onCreat(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.otherlayout);
       //ȡ����
       Intent intent=getIntent();
    String shengao=intent.getStringExtra("���");
    String tizhong = intent.getStringExtra("����");
       String GMI=intent.getStringExtra("GMI");
      Toast.makeText(this,"���:"+shengao+"����:"+tizhong+"GMI:"+GMI,Toast.LENGTH_SHORT).show();
   }
}








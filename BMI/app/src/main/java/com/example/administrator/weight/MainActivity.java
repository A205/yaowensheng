package com.example.administrator.weight;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    private Button btn;
    private TextView sg, tz, show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.absolut);

        btn = (Button) findViewById(R.id.btn);//获取ID
        sg = (TextView) findViewById(R.id.editText);
        tz = (TextView) findViewById(R.id.editText2);
        show = (TextView) findViewById(R.id.show);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {

                                       double bmi = 0;
                                       double h = new Double(sg.getText().toString());
                                       double w = new Double(tz.getText().toString());
                                       if ((h >= 300 || h <= 10)&&(w >= 200 || w <= 10)){
                                           show.setText("您所输入的身高和体重存在错误，请重新填写");
                                       }else if (h >= 300 || h <= 10){
                                           show.setText("您所输入的身高存在错误，请重新填写");
                                       }  else
                                       if (w >= 200 || w <= 10) {
                                           show.setText("您所输入的体重存在错误，请重新填写");
                                       } else {
                                           h = h / 100;
                                           bmi = w / (h * h);
                                           TextView result = (TextView) findViewById(R.id.tv);
                                           result.setText("你的BMI指数为：" + bmi);


                                           if (bmi < 18.5) {
                                               show.setText("极限偏瘦，注意增加饮食！");
                                           } else if (bmi >= 18.5 && bmi < 24) {
                                               show.setText("偏瘦，应该多吃点！");
                                           } else if (bmi >= 24 && bmi < 27) {
                                               show.setText("正常，请继续保持！");
                                           } else if (bmi >= 27 && bmi < 30) {
                                               show.setText("偏胖，注意锻炼！");
                                           } else if (bmi >= 30 && bmi < 35) {
                                               show.setText("肥胖，多锻炼，注意饮食！");
                                           } else if (bmi > 35) {
                                               show.setText("重度肥胖，注意饮食要节制，适当减肥！");
                                           }
                                       }
                                   }
                               }
        );
    }
}
package com.example.administrator.weight;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
private Button  btn;
private TextView sg ,tz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.absolut);
        btn=(Button)findViewById(R.id.btn);//��ȡID
        sg=(TextView)findViewById(R.id.sg);
        tz=(TextView)findViewById(R.id.tz);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //��ת�ڶ�������
                Toast.makeText(MainActivity.this,"����˰�ť",Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(MainActivity.this,OtherActivity.class);
                //��������
                intent.putExtra("���""");
                intent.putExtra("����","");
               //����Activity
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
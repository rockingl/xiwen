package com.lwm.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends Activity{
    //定义组件
    TextView t_c1,t_c2,t_c3,t_c4;
    String title,webUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        t_c1 = (TextView) findViewById(R.id.click1);
        t_c2 = (TextView) findViewById(R.id.click2);
        t_c3 = (TextView) findViewById(R.id.click3);
        t_c4 = (TextView) findViewById(R.id.click4);
        t_c1.setOnClickListener(new OnClickListener()
        {
            public void onClick(View view)
            {
                //传递标题，加载本地html资源
                title="讨曹操檄";
                webUrl="file:///android_asset/1";
                //打开目标activity
                openContent(title,webUrl);

            } });
        t_c2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                //传递标题，加载本地html资源
                title="为徐敬业讨武曌檄";
                webUrl="file:///android_asset/2";
                //打开目标activity
                openContent(title,webUrl);

            }
        });
        t_c3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                //传递标题，加载本地html资源
                title="北伐讨元檄";
                webUrl="file:///android_asset/3";
                //打开目标activity
                openContent(title,webUrl);

            }
        });
        t_c4.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                //传递标题，加载本地html资源
                title="讨粤匪檄";
                webUrl="file:///android_asset/4";
                //打开目标activity
                openContent(title,webUrl);

            }
        });
    }
    //打开新activity(ContentActivity),传入两个参数title，webUrl
    private void openContent(String title,String webUrl){
        Intent intent=new Intent(MainActivity.this,ContentActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        bundle.putString("webUrl",webUrl);
        intent.putExtras(bundle);
        startActivity(intent);
    }




}

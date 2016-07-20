package com.lwm.test;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class ContentActivity extends Activity {
    //用于接收传递的数据
    String title,webUrl;
    //定义title，content
    TextView tv;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
        //获取组件
        wv = (WebView)findViewById(R.id.content);
        tv=(TextView) findViewById(R.id.title);
       //获取要传递的数据
        Bundle bundle = this.getIntent().getExtras();
        title= bundle.getString("title");
        webUrl=bundle.getString("webUrl");
        //显示前台传递的数据
        tv.setText(title);//加载标题
        //设置背景透明
        wv.setBackgroundColor(0); // 设置背景色为透明
        wv.loadUrl(webUrl);//加载本地html
    }
}

package com.bwie.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String []name={"作家协会","美术家协会","杂技家协会","戏剧家协会","舞蹈家协会","音乐家协会","曲艺家协会","民间文艺家协会","书法家协会","电影家协会","摄影家协会","电视艺术家协会","评论家协会","飞天编辑部","文学院","理论研究室"};
    private int[]image={R.drawable.gv1,R.drawable.gv2,R.drawable.gv3,R.drawable.gv4,R.drawable.gv5,R.drawable.gv6,R.drawable.gv7,R.drawable.gv8,R.drawable.gv9,R.drawable.gv10,R.drawable.gv11,R.drawable.gv12,R.drawable.gv13,R.drawable.gv14,R.drawable.gv12,R.drawable.gv12};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找id
        MyListView lv= (MyListView) findViewById(R.id.lv);
        MyGridView gv= (MyGridView) findViewById(R.id.gv);


        //适配器
        gv.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return name.length;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                View v=View.inflate(MainActivity.this,R.layout.list_item,null);
                ImageView tu= (ImageView) v.findViewById(R.id.tu);
                TextView tv= (TextView) v.findViewById(R.id.tv);
                tu.setImageResource(image[i]);
                tv.setText(name[i]);

                return v;
            }
        });

        //listview适配器
        lv.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return name.length;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                View v=View.inflate(MainActivity.this,R.layout.list_item1,null);
                ImageView tu2= (ImageView) v.findViewById(R.id.tu2);
                TextView tv2= (TextView) v.findViewById(R.id.tv2);
                tu2.setImageResource(image[i]);
                tv2.setText(name[i]);

                return v;
            }
        });
    }

}

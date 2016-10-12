package com.example.tianhuihuang.youtubeplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    // download according to this link https://developers.google.com/youtube/android/player/downloads/
    //然后复制黏贴到lib文件里面jar 包,加完一个包之后,在grandle里面改设置

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //inflate the menu, this adds items to the action bar if it is presents
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //handle action bar item clicks here. The action bar will
        //actomatically handle clicks on the home/Up button, so long
        //as you specify a parent activity in androidManifest.xml

        int id=item.getItemId();
        //noinspection simplifiableifstatement
        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

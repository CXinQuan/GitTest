package com.example.lenovo.gittest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text=new TextView(this);

        TextView text2=new TextView(this);

        TextView text3=new TextView(this);


    }
}

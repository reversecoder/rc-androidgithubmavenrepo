package com.reversecoder.publicgithubmavenrepo.androidstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.reversecoder.samplelibrary.androidstudio.AndroidView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_rc_samplelibrary_androidstudio);

        ((Button)findViewById(R.id.btn_check_in)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AndroidView androidView = new AndroidView(MainActivity.this);
                androidView.showAndroidView();
            }
        });
    }
}

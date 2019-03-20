package com.example.seunghun.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SeekBar sb1 = findViewById(R.id.seekBar1);
        final TextView tv1 = findViewById(R.id.textView1);
        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar1) {
                tv1.setText("onStop TrackingTouch");
            }

            public void onStartTrackingTouch(SeekBar seekBar1) {
                tv1.setText("onStart TrackingTouch");
            }

            public void onProgressChanged(SeekBar seekBar1, int progress,
                                          boolean fromUser) {
                tv1.setText("onProgressChanged : " + progress);
            }
        });
    }
}

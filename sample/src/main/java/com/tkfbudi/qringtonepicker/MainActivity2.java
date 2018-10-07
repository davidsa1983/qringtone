package com.tkfbudi.qringtonepicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tkfbudi.ringtone.QRingtone;

/**
 * Created on : 07/10/18
 * Author     : Taufik Budi S
 * GitHub     : https://github.com/tfkbudi
 */
class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new QRingtone(this)
                .setNegativeButton("Cancel")
                .show();
    }
}

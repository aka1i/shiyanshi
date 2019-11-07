package com.example.androidforjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gyf.immersionbar.ImmersionBar;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImmersionBar.with(this).init();
    }
}

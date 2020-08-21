package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment f1 =new fragment_1();
        Fragment f2=new fragment_2();

        getSupportFragmentManager().beginTransaction().replace(R.id.f1,f1).commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.f2,f2).commit();
    }
}

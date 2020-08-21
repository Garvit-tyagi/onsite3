package com.example.myapplication;

import android.annotation.SuppressLint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class fragment_1 extends Fragment {
    private static final String TAG = "fragment_1";
    View view;
    customView_1 mc;
    fragment_2 f2;

    Path path;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_1,container,false);
        mc=view.findViewById(R.id.customView1);


        mc.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                path=mc.getdraw();
                f2=(fragment_2) getActivity().getSupportFragmentManager().findFragmentById(R.id.f2);
                if(f2!=null)
                {
                    Log.d(TAG, "onTouch: "+path);
                    f2.setpath(path);

                }

                return false;
            }
        });



        return view;
    }
}

package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class customView_2 extends View {

    Paint paint;
    Path path;

    public customView_2(Context context) {
        super(context);
        init();
    }

    public customView_2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public customView_2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public customView_2(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    public void init()
    {
        paint= new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);
        paint.setTextSize(85);
        paint.setStrokeWidth(10);
        path=new Path();
        paint.setStyle(Paint.Style.STROKE);
    }

    public void dr(Path p)
    {
        path=p;
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE, PorterDuff.Mode.CLEAR);
        canvas.drawPath(path,paint);



    }
}

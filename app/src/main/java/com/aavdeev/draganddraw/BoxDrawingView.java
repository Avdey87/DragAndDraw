package com.aavdeev.draganddraw;

import android.content.Context;
import android.graphics.PointF;
import android.nfc.Tag;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.jar.Attributes;

public class BoxDrawingView extends View {
    private static final String TAG = "BoxDrawingView";

       //используется при создании представления в коде
    public BoxDrawingView(Context context) {
        this(context, null);
    }

    //используется при заполнении представления по разметки XML
    public BoxDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        PointF current = new PointF(event.getX(), event.getY());
        String action = "";

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
            case MotionEvent.ACTION_CANCEL:
                action = "ACTION_CANCEL";
                break;
        }
        Log.i(TAG, action + "at x=" + current.x + ", y=" + current.y);
        return true;
    }
}

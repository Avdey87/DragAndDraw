package com.aavdeev.draganddraw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import java.util.jar.Attributes;

public class BoxDrawingView extends View {
    //используется при создании представления в коде
    public BoxDrawingView(Context context) {
        this(context, null);
    }

    //используется при заполнении представления по разметки XML
    public BoxDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}

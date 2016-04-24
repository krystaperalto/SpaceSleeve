package com.example.andrew.spacesleeve;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import android.view.*;


/**
 * Created by Andrew on 2016-04-23.
 */



public class CustomTextView extends TextView {
    public CustomTextView (Context context, AttributeSet attrs) {
        super (context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/COLABTHI.OTF"));
    }
}

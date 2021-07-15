package com.example.calibrationapp

import android.widget.TextView
import android.content.Context
import android.util.AttributeSet
import java.time.format.DecimalStyle

class CustomFont: androidx.appcompat.widget.AppCompatTextView {
constructor(context:Context):super(context){
    applyCustomFont(context )
}

    private fun applyCustomFont(context: Context) {
includeFontPadding= false
        typeface = Fontchange.getTypeFace("righteous.ttf",context)

    }

    constructor(context:Context, attrs: AttributeSet):super(context, attrs){
        applyCustomFont(context )
    }
    constructor(context:Context, attrs: AttributeSet, defStyle: Int):super(context, attrs, defStyle){
        applyCustomFont(context )
    }
}
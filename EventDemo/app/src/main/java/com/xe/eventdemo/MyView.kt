package com.xe.eventdemo

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button

/**
 * Created by 86188 on 2021/7/17.
 */
class MyView: View {
    companion object {
        var TAG:String = "Activity"
    }
    constructor(context: Context): super(context){
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs){

    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr){

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d(TAG,"------------onTouchEvent--")
        return super.onTouchEvent(event)
    }
}
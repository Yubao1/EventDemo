package com.xe.eventdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MotionEvent
import android.view.View

/**
 * Created by 86188 on 2021/7/17.
 */
class MainActivity: AppCompatActivity() {
    var mMyView: View? = null ;
    companion object {
        var TAG: String = "Activity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMyView = findViewById(R.id.btn)
        mMyView!!.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                Log.d(TAG,"------------onTouch--")
                return false
            }
        })
        mMyView!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d(TAG,"------------onClick--")
            }
        })

    }
}
//        mMyView!!.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v: View?) {
//                Log.d(TAG,"------------onClick--")
//            }
//        })
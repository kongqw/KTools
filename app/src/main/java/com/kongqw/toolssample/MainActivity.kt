package com.kongqw.toolssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.kongqw.tools.db2px
//import com.kongqw.tools.toDb
import com.kongqw.toolssample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)


//        ViewUtils
//
//        db2px()
//
//        mViewBinding.tv.toDb()

    }
}
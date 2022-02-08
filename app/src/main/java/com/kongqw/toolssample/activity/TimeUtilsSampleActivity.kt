package com.kongqw.toolssample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kongqw.tools.TimeUtils
import com.kongqw.toolssample.databinding.ActivityTimeUtilsSampleBinding

class TimeUtilsSampleActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityTimeUtilsSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityTimeUtilsSampleBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)

        val stringBuilder = StringBuilder()
        stringBuilder.append(TimeUtils.getCurrentYear()).append("-")
        stringBuilder.append(TimeUtils.getCurrentMonth() + 1).append("-")
        stringBuilder.append(TimeUtils.getCurrentDay()).append(" ")
        stringBuilder.append(TimeUtils.getCurrentHour()).append(":")
        stringBuilder.append(TimeUtils.getCurrentMinute()).append(":")
        stringBuilder.append(TimeUtils.getCurrentSecond()).append(":")
        stringBuilder.append(TimeUtils.getCurrentMillisecond())

        Toast.makeText(applicationContext, stringBuilder.toString(), Toast.LENGTH_SHORT).show()

    }
}
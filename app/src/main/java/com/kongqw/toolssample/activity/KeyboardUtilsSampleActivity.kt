package com.kongqw.toolssample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kongqw.tools.KeyboardUtils
import com.kongqw.toolssample.databinding.ActivityKeyboardUtilsSampleBinding

class KeyboardUtilsSampleActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityKeyboardUtilsSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityKeyboardUtilsSampleBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)

        // 开启键盘
        mViewBinding.btnOpenKeyboard.setOnClickListener {
            KeyboardUtils.openKeyboard(mViewBinding.et)
        }
        // 关闭键盘
        mViewBinding.btnCloseKeyboard.setOnClickListener {
            KeyboardUtils.closeKeyboard(mViewBinding.et)
        }
        // 获取键盘开关状态
        mViewBinding.btnKeyboardStatus.setOnClickListener {
//            val isSoftInputShowing = KeyboardUtils.isSoftInputShowing(this)
//            Toast.makeText(applicationContext, "isSoftInputShowing = $isSoftInputShowing", Toast.LENGTH_SHORT).show()
        }
    }
}
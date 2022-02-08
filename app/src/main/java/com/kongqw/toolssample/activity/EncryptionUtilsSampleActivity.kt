package com.kongqw.toolssample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kongqw.tools.DimenUtils
import com.kongqw.tools.md5
import com.kongqw.toolssample.databinding.ActivityEncryptionUtilsSampleBinding

class EncryptionUtilsSampleActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityEncryptionUtilsSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityEncryptionUtilsSampleBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)


        mViewBinding.btnMd5.setOnClickListener {
            val inputContent = getInputContent()

            mViewBinding.tvOut.text = inputContent.md5()

//            val md5 = EncryptionUtils.md5(inputContent)
//            mViewBinding.tvOut.text = md5
        }


        DimenUtils.dp2px(applicationContext,1f)
    }


    /**
     * 获取输入内容
     */
    private fun getInputContent(): String = mViewBinding.etIn.text.toString().trim()
}
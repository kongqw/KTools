package com.kongqw.toolssample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kongqw.tools.InstallUtils
import com.kongqw.toolssample.databinding.ActivityInstallUtilsSampleBinding

class InstallUtilsSampleActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityInstallUtilsSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityInstallUtilsSampleBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)


        mViewBinding.btnIsInstalled.setOnClickListener {
            val inputPackageName = getInputPackageName()
            if (inputPackageName.isEmpty()) {
                Toast.makeText(applicationContext, "请输入包名", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val installed = InstallUtils.isInstalled(applicationContext, inputPackageName)

            Toast.makeText(applicationContext, "包名：$inputPackageName\n${if (installed) "已安装" else "未安装"}", Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * 获取输入的包名
     */
    private fun getInputPackageName(): String = mViewBinding.et.text.toString().trim()
}
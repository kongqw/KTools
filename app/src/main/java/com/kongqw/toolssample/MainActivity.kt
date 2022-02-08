package com.kongqw.toolssample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kongqw.toolssample.activity.EncryptionUtilsSampleActivity
import com.kongqw.toolssample.activity.InstallUtilsSampleActivity
import com.kongqw.toolssample.activity.KeyboardUtilsSampleActivity
import com.kongqw.toolssample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)

        // InstallUtils
        mViewBinding.tvInstallUtils.setOnClickListener {
            startActivity(Intent(this, InstallUtilsSampleActivity::class.java))
        }

        // KeyboardUtils
        mViewBinding.tvKeyboardUtils.setOnClickListener {
            startActivity(Intent(this, KeyboardUtilsSampleActivity::class.java))
        }

        // EncryptionUtils
        mViewBinding.tvEncryptionUtils.setOnClickListener {
            startActivity(Intent(this, EncryptionUtilsSampleActivity::class.java))
        }
    }
}
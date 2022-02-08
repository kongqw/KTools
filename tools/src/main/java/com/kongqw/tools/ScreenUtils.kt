package com.kongqw.tools

import android.content.Context
import android.os.Build
import android.view.Surface
import android.view.WindowManager
import androidx.annotation.RequiresApi

/**
 * 屏幕相关工具类
 */
object ScreenUtils {


    /**
     * 获取当前手机是竖屏还是横屏
     */
    @RequiresApi(Build.VERSION_CODES.R)
    fun getScreenRotation(context: Context): ScreenRotation {
        val rotation = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            context.display?.rotation
        } else {
            (context.applicationContext.getSystemService(Context.WINDOW_SERVICE) as? WindowManager)?.defaultDisplay?.rotation
        }
        Surface.ROTATION_0
        return if (0 == rotation) ScreenRotation.PORTRAIT else ScreenRotation.LANDSCAPE

    }

    enum class ScreenRotation(rotation: String) { PORTRAIT("竖屏"), LANDSCAPE("横屏") }
}
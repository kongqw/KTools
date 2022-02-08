package com.kongqw.tools

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

/**
 * 管理键盘的工具类
 */
object KeyboardUtils {

    /**
     * 开启键盘
     *
     * @param view 焦点View
     */
    @JvmStatic
    fun openKeyboard(view: View) {
        try {
            val inputManager = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            if (view is EditText) {
                view.isFocusable = true
                view.isFocusableInTouchMode = true
                view.requestFocus()
            }
            inputManager.showSoftInput(view, InputMethodManager.RESULT_UNCHANGED_SHOWN)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * 关闭键盘
     * @param view view
     */
    @JvmStatic
    fun closeKeyboard(view: View) {
        try {
            val inputManager = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(view.windowToken, InputMethodManager.RESULT_UNCHANGED_SHOWN)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

//    /**
//     * 获取键盘开关状态
//     *
//     * @param activity activity
//     * @return 开关状态
//     */
//    @JvmStatic
//    fun isSoftInputShowing(activity: Activity): Boolean {
//        // 虚拟键盘隐藏 判断view是否为空
//        val view = activity.window.peekDecorView()
//        if (view != null) {
//            // 隐藏虚拟键盘
//            val inputManager = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
//            // inputManager.hideSoftInputFromWindow(view.getWindowToken(),0);
//            return inputManager.isActive && activity.window.currentFocus != null
//        }
//        return false
//    }
}
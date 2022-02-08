package com.kongqw.tools

import android.content.Context

/**
 *
 */
object DimenUtils {

    /**
     * dp 转换为 px
     */
    @JvmStatic
    fun dp2px(context: Context, dp: Float): Int {
        val scale = context.resources.displayMetrics.density // 当前屏幕密度因子
        return (dp * scale + 0.5f).toInt()
    }
    /*
        public static int dp2Px(Context context, int dpValue) {
            return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, context.getResources().getDisplayMetrics());
        }
     */
}
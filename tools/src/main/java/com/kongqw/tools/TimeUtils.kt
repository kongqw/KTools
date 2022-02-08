package com.kongqw.tools

import java.util.*


/**
 * 获取当前年
 */
fun getCurrentYear() = TimeUtils.getCurrentYear()

/**
 * 获取当前月
 */
fun getCurrentMonth() = TimeUtils.getCurrentMonth()

object TimeUtils {

    /**
     * 获取当前年
     */
    fun getCurrentYear(): Int = Calendar.getInstance()[Calendar.YEAR]

    /**
     * 获取当前月
     */
    fun getCurrentMonth(): Int = Calendar.getInstance()[Calendar.MONTH]

    /**
     * 获取当前日
     */
    fun getCurrentDay(): Int = Calendar.getInstance()[Calendar.DATE]

    /**
     * 获取当前时
     */
    fun getCurrentHour(): Int = Calendar.getInstance()[Calendar.HOUR]

    /**
     * 获取当前分
     */
    fun getCurrentMinute(): Int = Calendar.getInstance()[Calendar.MINUTE]

    /**
     * 获取当前秒
     */
    fun getCurrentSecond(): Int = Calendar.getInstance()[Calendar.SECOND]

    /**
     * 获取当前微秒
     */
    fun getCurrentMillisecond(): Int = Calendar.getInstance()[Calendar.MILLISECOND]
}
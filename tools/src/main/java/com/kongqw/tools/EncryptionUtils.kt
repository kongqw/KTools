package com.kongqw.tools

import java.security.MessageDigest

/**
 * MD5
 */
fun String.md5(): String {
    return EncryptionUtils.md5(this)
}

/**
 * 加密相关工具类
 */
object EncryptionUtils {


    /**
     * md5
     */
    @JvmStatic
    fun md5(text: String): String {
        try {
            // 创建一个MD5加密算法
            val digest = MessageDigest.getInstance("md5")
            // 创建StringBuffer保存十六进制数据
            val sb = StringBuffer()
            // 换成字节数组
            val bytes = digest.digest(text.toByteArray())
            // 遍历字节数组加密
            for (bt in bytes) {
                // 将负数转换为正数
                val i = bt.toInt() and 0xff
                // 将十进制转换为十六进制
                val hex = Integer.toHexString(i)
                // 如果不够2位，前面补0
                if (2 > hex.length) {
                    sb.append(0)
                }
                sb.append(hex)
            }
            return sb.toString()
        } catch (e: Exception) {
            return text
        }
    }
}
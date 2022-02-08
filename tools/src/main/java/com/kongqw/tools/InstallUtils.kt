package com.kongqw.tools

import android.annotation.SuppressLint
import android.content.Context


/**
 * 管理APP的安装，卸载的工具类
 */
object InstallUtils {

    /**
     * 通过包名判断是否安装APP
     * @param context 上下文
     * @param packageName 应用包名
     */
    @SuppressLint("QueryPermissionsNeeded")
    @JvmStatic
    fun isInstalled(context: Context, packageName: String): Boolean {
        try {
            context.packageManager.getInstalledPackages(0).forEach { packageInfo ->
                if (packageName == packageInfo.packageName) {
                    return true
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return false
    }

}
package com.small.version

/**
 * Created by small-ho on 2022/11/10 星期四 14:55
 * title: 版本统一管理
 */
object Versions {
    const val versionCode = 1
    const val versionName = "1.0"
    const val minSdkVersion = 22
    const val targetSdkVersion = 33
    const val compileSdkVersion = 33

    const val coreKtx = "1.9.0"
    const val appcompat = "1.5.1"
    const val material = "1.7.0"
    const val layout = "2.1.4"
    const val junit = "4.13.2"
    const val junit_ext = "1.1.3"
    const val espresso_core = "3.4.0"
}

object Dependencies {
    const val junit = "junit:junit:${Versions.junit}"
    const val junit_ext = "androidx.test.ext:junit:${Versions.junit_ext}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"

    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val layout = "androidx.constraintlayout:constraintlayout:${Versions.layout}"
}
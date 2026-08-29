package com.example.lib

object SampleLibUtils {

    fun greet(name: String): String = "Hello, $name!"

    // 运行时可以区分当前是源码依赖还是 AAR 依赖
    fun depType(): String = "source"
}

package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun parseIntOrThrow(str: String): Int? {
    // kotlin에서 try-catching은 expression으로 사용 가능
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

class FilePrinter {
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }
}

class FilePrinter2 {
    // Java의 try-with-resources 구문과 동일
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}

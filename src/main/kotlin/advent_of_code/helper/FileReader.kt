package advent_of_code.helper

import java.io.BufferedReader
import java.io.File

object FileReader {
    fun readFile(filename: String): String {
        try {
            val bufferedReader: BufferedReader = File(filename).bufferedReader()
            return bufferedReader.use { it.readText() }
        } catch (e: Exception) {
            throw e
        }
    }
}
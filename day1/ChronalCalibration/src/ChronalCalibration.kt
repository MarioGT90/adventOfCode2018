import java.io.File

fun main(args: Array<String>) {
    println("Chronal calibration output is: ${File(args[0]).readLines().map { it.toInt() }.sumBy { it }}")
}



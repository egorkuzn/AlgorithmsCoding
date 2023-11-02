package yandex.contest.trainings.first_day.forth

import java.lang.System.exit
import java.util.HashMap

fun forth() {
    val str1 = readln()
    val str2 = readln()

    if (str1.length != str2.length) {
        println("NO")
        exit(0)
    }

    var map = HashMap<Char, Int>()

    str1.map { map[it] = if (map.contains(it)) map[it]!!.inc() else 1}
    str2.map { if (map.contains(it)) {
        map[it] = map[it]!! - 1
    } else {
        println("NO")
        exit(0)
    }}

    map = map.filter { it.value != 0 } as HashMap<Char, Int>

    if (map.size == 0)
        println("YES")
    else
        println("NO")
}
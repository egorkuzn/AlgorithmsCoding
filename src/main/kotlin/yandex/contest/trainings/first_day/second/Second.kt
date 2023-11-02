package yandex.contest.trainings.first_day.second

import kotlin.math.*

fun second() {
    val XaYaXbYb = readln().split(" ").map{it.toDouble()}
    val X = XaYaXbYb[2] - XaYaXbYb[0]
    val Y = XaYaXbYb[3] - XaYaXbYb[1]
    println("%.12f".format(sqrt(X * X + Y * Y)))
}
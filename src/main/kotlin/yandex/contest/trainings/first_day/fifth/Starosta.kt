package yandex.contest.trainings.first_day.fifth

fun five() {
    val n = readln().toInt()
    val ratings = readln().split(" ").map { it.toInt() }

    var leftSum = 0
    var rightSum = ratings.sum()
    var answ = StringBuilder()

    for (i in 0 until n) {
        val value = ratings[i]
        val res = (i shl 1 - n) * value - leftSum + rightSum
        answ.append("$res ")
        leftSum += value
        rightSum -= value
    }

    println(answ)
}
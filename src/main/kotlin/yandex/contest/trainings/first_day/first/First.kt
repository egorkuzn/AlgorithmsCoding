fun first() {
    val m = readln().split(" ").map { it.toInt() }.last()
    val array = readln().split(" ").map { it.toInt() }

    repeat(m) {
        val LR = readln().split(" ").map { it.toInt() }
        for (i in LR.first()..LR.last()) {
            if (array[LR.first()] > array[i]) {
                println(array[LR.first()])
                return@repeat
            } else if (array[LR.first()] < array[i]) {
                println(array[i])
                return@repeat
            }
        }
        println("NOT FOUND")
    }
}
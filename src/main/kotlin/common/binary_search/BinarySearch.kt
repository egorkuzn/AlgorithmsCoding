package common.binary_search

fun binarySearch() {
    val inputArray = arrayOf(1, 2, 3, 4, 5, 5, 7, 7, 9, 10, 11, 12, 13, 14, 15)
    val searchedValue = 7

    val index = search(inputArray, searchedValue)

    println("Index $index, value $searchedValue")
}

fun search(inputArray: Array<Int>, searchedValue: Int): Int {
    var left = 0
    var right = inputArray.size - 1

    while (left <= right) {
        val middle = (left + right) / 2

        when {
            inputArray[middle] == searchedValue -> return middle
            inputArray[middle] < searchedValue -> left = middle + 1
            else -> right = middle - 1
        }
    }

    return -1
}
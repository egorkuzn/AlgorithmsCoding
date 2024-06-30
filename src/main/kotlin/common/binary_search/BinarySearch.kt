package common.binary_search

fun binarySearch() {
    val inputArray = arrayOf(1, 2, 3, 4, 5, 5, 7, 7, 9, 10, 11, 12, 13, 14, 15)
    val searchedValue = 7
    val index = search(inputArray, searchedValue)

    println("Index $index, value $searchedValue")
}

fun search(inputArray: Array<Int>, searchedValue: Int): Int {
    val size = inputArray.size

    return when {
        inputArray.isEmpty() -> throw Exception("Нет такого элемента")
        searchedValue == inputArray[size/2] -> size / 2
        searchedValue in inputArray[size/2] .. inputArray.last() -> size / 2 + search(inputArray.copyOfRange(size / 2, size), searchedValue)
        else -> search(inputArray.copyOfRange(0, size / 2), searchedValue)
    }
}
package common.binary_search

fun binarySearch() {
    val inputArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    val searchedValue = 7
    val index = search(inputArray, searchedValue)

    println("Index $index, value $searchedValue")
}

fun search(inputArray: Array<Int>, searchedValue: Int): Int {
    val size = inputArray.size

    return if (inputArray.isEmpty())
        throw Exception("Нет такого элемента")
    else if (searchedValue == inputArray[size/2])
        size / 2
    else if (searchedValue in inputArray[size/2] .. inputArray.last())
        size / 2 + search(inputArray.copyOfRange(size/2, size), searchedValue)
    else
        search(inputArray.copyOfRange(0, size/2), searchedValue)
}
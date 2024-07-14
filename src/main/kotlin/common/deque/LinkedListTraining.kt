package common.deque

import java.util.*

class LinkedListTraining {
    fun commonFun(s: String = "", x: Int = 5, y: Int = 4): Int {
        val linkedList = LinkedList(s.map{it})
        var result = 0
        var iterator = linkedList.listIterator()

        var pointer1 = 'f'
        if (!iterator.hasNext()) return 0
        var pointer2 = iterator.next()

        var firstLetter = 'a'
        var secondLetter = 'b'
        var firstVal = x
        var secondVal = y
        if (x < y) {
            firstLetter = 'b'
            secondLetter = 'a'
            firstVal = y
            secondVal = x
        }

        while (iterator.hasNext()) {
            pointer1 = pointer2
            pointer2 = iterator.next()

            if (pointer1 == firstLetter && pointer2 == secondLetter) {
                iterator.remove()
                iterator.previous()
                iterator.next()
                iterator.remove()
                if (iterator.hasPrevious())
                    pointer2 = iterator.previous()
                else if (linkedList.isNotEmpty())
                    pointer2 = linkedList.first
                result += firstVal
            }
        }

        iterator = linkedList.listIterator()

        pointer1 = 'f'
        if (!iterator.hasNext()) return result
        pointer2 = iterator.next()

        while (iterator.hasNext()) {
            pointer1 = pointer2
            pointer2 = iterator.next()

            if (pointer1 == secondLetter && pointer2 == firstLetter) {
                iterator.remove()
                iterator.previous()
                iterator.next()
                iterator.remove()
                if (iterator.hasPrevious())
                    pointer2 = iterator.previous()
                else if (linkedList.isNotEmpty())
                    pointer2 = linkedList.first
                result += secondVal
            }
        }


        return result
    }
}
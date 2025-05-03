package leetcode

import kotlin.math.min

/**
 * # 1007. Minimum Domino Rotations For Equal Row
 *
 * In a row of dominoes, tops[[i]] and bottoms[[i]] represent the top and bottom halves of the ith domino. (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)
 *
 * We may rotate the ith domino, so that tops[[i]] and bottoms[[i]] swap values.
 *
 * Return the minimum number of rotations so that all the values in tops are the same, or all the values in bottoms are the same.
 *
 * If it cannot be done, return -1
 */

fun minDominoRotations(tops: IntArray, bottoms: IntArray): Int {
    val n = tops.size
    var res = Int.Companion.MAX_VALUE
    val face = IntArray(7)
    for (i in 0..<n) {
        face[tops[i]]++
        if (bottoms[i] != tops[i]) face[bottoms[i]]++
    }
    for (x in 1..6) {
        if (face[x] < n) continue
        var maintainTop = 0
        var maintainBottom = 0
        var possible = true
        for (i in 0..<n) {
            if (tops[i] != x && bottoms[i] != x) {
                possible = false
                break
            }
            if (tops[i] != x) maintainTop++
            if (bottoms[i] != x) maintainBottom++
        }
        if (possible) res = min(res, min(maintainTop, maintainBottom))
    }
    return if (res == Int.Companion.MAX_VALUE) -1 else res
}

package com.andersmurphy.functional.sandbox.recursion

/**
 * Created by anders on 24/09/15.
 */
class KotlinRecursiveSum {
    fun sum(list: List<Int>): Int {
        if ( list.size == 1) return list.get(0) else return list.get(0) + sum(list.subList(1, list.size))
    }

    fun tailrecSum(list: List<Int>): Int {
        return sum(0, list)
    }

    tailrec fun sum(accumulator: Int, list: List<Int>): Int {
        if ( list.size == 0)
            return accumulator
        else
            return sum(accumulator + list.get(0), list.subList(1, list.size))
    }
}
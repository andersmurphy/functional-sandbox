package com.andersmurphy.functional.sandbox

/**
 * Created by anders on 24/09/15.
 */
class KotlinRecursiveSum {
    fun sum(list: List<Int>): Int {
        if ( list.size() == 1) return list.get(0) else return list.get(0) + sum(list.subList(1, list.size()))
    }
}
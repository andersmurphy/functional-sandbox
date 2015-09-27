package com.andersmurphy.functional.sandbox.recursion;

import java.util.List;

/**
 * Created by anders on 24/09/15.
 */
public final class RecursiveSum {
    public int sum(List<Integer> integerList) {
        if (integerList.size() == 1) {
            return integerList.get(0);
        } else {
            return integerList.get(0) + sum(integerList.subList(1,integerList.size()));
        }
    }
}

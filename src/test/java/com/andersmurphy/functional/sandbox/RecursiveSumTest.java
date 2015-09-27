package com.andersmurphy.functional.sandbox;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by anders on 24/09/15.
 */
public class RecursiveSumTest {
    @Test
    public void recurisve_sum() throws Exception {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(9);

        RecursiveSum recursiveSum = new RecursiveSum();

        assertThat(recursiveSum.sum(integerList), is(equalTo(24)));
    }

    @Test
    public void kotlin_recurisve_sum() throws Exception {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(9);

        KotlinRecursiveSum recursion = new KotlinRecursiveSum();

        assertThat(recursion.sum(integerList), is(equalTo(24)));
    }
}
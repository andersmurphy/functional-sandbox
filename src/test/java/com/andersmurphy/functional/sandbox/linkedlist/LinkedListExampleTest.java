package com.andersmurphy.functional.sandbox.linkedlist;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

/**
 * Created by anders on 05/12/2015.
 */
public class LinkedListExampleTest {

	@Test
	public void linked_list_fold_left_sum_example() throws Exception {
		fj.data.List<Integer> numbers = fj.data.List.list(1,2,3,4,5);

		int actual = numbers.foldLeft((x, y) -> x + y, 0);

		assertThat(actual, is(equalTo(15)));
	}

}
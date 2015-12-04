package com.andersmurphy.functional.sandbox.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by anders on 04/12/2015.
 */
public class StreamExamplesTest {

	@Test
	public void filterOddNumbers() throws Exception {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		List<Integer> onlyEvenNumbers = StreamExamples.filterOddNumbers(numbers);


		List<Integer> evenNumbers = new ArrayList<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		assertThat(onlyEvenNumbers,is(equalTo(evenNumbers)));
	}

	@Test
	public void numbers_to_strings() throws Exception {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(22);
		numbers.add(43);

		List<String> actual = StreamExamples.integerListToString(numbers);

		List<String> expected = new ArrayList<>();
		expected.add("22");
		expected.add("43");
		assertThat(actual,is(equalTo(expected)));
	}
}

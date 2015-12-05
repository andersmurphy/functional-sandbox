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
	public void filter_odd_numbers() throws Exception {
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

	@Test
	public void using_range_to_count() throws Exception {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);

		List<Integer> actual = StreamExamples.countTo(5);

		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void using_find_to_find_first_even_number() throws Exception {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		int firstEvenNumber = StreamExamples.findFirstEvenOrReturnZero(numbers);

		assertThat(firstEvenNumber,is(equalTo(2)));
	}

	@Test
	public void using_exists_to_check_if_number_is_prime() throws Exception {
		assertThat(StreamExamples.isPrime(7),is(equalTo(true)));
		assertThat(StreamExamples.isPrime(4),is(equalTo(false)));
		assertThat(StreamExamples.isPrime(13),is(equalTo(true)));
	}
}

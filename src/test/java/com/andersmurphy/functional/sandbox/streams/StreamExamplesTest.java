package com.andersmurphy.functional.sandbox.streams;

import fj.P2;
import fj.data.Stream;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static fj.data.Stream.stream;
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
		List<Integer> numbers = new ArrayList<>();
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
		List<Integer> expected = new ArrayList<>();
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
		List<Integer> numbers = new ArrayList<>();
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

	@Test
	public void using_foldleft1_to_concatonate_a_list_of_strings() throws Exception {
		List<String> words = new ArrayList<>();
		words.add("one");
		words.add("two");
		words.add("three");
		words.add("four");
		words.add("five");

		String actual = stream(words).foldLeft1((a,b) -> a + " " + b);

		String expected = "one two three four five";
		assertThat(actual, is(equalTo(expected)));
	}


	@Test
	public void using_suming_numbers() throws Exception {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		int sum = stream(numbers).foldLeft1((a,b) -> a + b);

		assertThat(sum,is(equalTo(15)));
	}

	@Test
	public void using_split_to_create_a_tuple_with_two_streams() throws Exception {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		P2<Stream<Integer>, Stream<Integer>> twoStreams = stream(numbers).split(a -> a > 3);
		List<Integer> threeOrLess = twoStreams._1().toList().toJavaList();
		List<Integer> greaterThanThree = twoStreams._2().toList().toJavaList();

		assertThat(greaterThanThree,is(equalTo(fj.data.List.list(4,5).toJavaList())));
		assertThat(threeOrLess,is(equalTo(fj.data.List.list(1,2,3).toJavaList())));
	}
}

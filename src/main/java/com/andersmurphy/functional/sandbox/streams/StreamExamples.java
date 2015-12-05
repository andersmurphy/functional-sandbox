package com.andersmurphy.functional.sandbox.streams;

import fj.data.Stream;

import java.util.ArrayList;
import java.util.List;

import static fj.data.Stream.stream;

/**
 * Created by anders on 04/12/2015.
 */
public final class StreamExamples {

	public static List<Integer> filterOddNumbers(List<Integer> numbers) {
		Stream<Integer> streamOfNumbers = stream(numbers);
		return streamOfNumbers.filter(number -> number % 2 == 0).toList().toJavaList();
	}

	public static List<String> integerListToString(List<Integer> numbers) {
		return stream(numbers).map(Object::toString).toList().toJavaList();
	}

	public static List<Integer> countTo(int number) {
		return Stream.range(1, number +1).toList().toJavaList();
	}

}

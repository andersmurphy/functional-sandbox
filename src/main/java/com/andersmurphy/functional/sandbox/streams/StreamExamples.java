package com.andersmurphy.functional.sandbox.streams;

import fj.F;
import fj.data.Stream;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static fj.data.Stream.stream;

/**
 * Created by anders on 04/12/2015.
 */
public final class StreamExamples {

	public static List<Integer> filterOddNumbers(List<Integer> numbers) {
		Stream<Integer> streamOfNumbers = stream(numbers);
		return streamOfNumbers.filter(StreamExamples::isEven).toList().toJavaList();
	}

	public static List<String> integerListToString(List<Integer> numbers) {
		return stream(numbers).map(Object::toString).toList().toJavaList();
	}

	public static List<Integer> countTo(int number) {
		return Stream.range(1, number + 1).toList().toJavaList();
	}

	public static int findFirstEvenOrReturnZero(List<Integer> numbers) {
		return stream(numbers).find(StreamExamples::isEven).orSome(0);
	}

	public static boolean isPrime(int number) {
		return !Stream.range(2, number).exists(currentNumber -> number % currentNumber == 0);
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
}

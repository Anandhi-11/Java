package com.k2js.stream.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Prog1 {
	public static void main(String[] args) {
		// create stream of empty
		Stream<String> s = Stream.empty();
		System.out.println(s.count());
		//create stream of single element with type t
		Stream<String> s1 = Stream.of(new String());
		Stream<Student> s2 = Stream.of(new Student());
		System.out.println(s2.count());
		//create stream with values 
		Stream<Integer> i1 = Stream.of(10, 20, 30, 40);
		System.out.println(i1.count());
		// create stream from collection
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("One");
		listOfStrings.add("Two");
		listOfStrings.add("Three");
		listOfStrings.stream().forEach(System.out::println);
	}
}

package com.k2js.stream.practice;

import java.util.ArrayList;
import java.util.List;

public class Prog3 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("One");
		l.add("Two");
		l.add("anandhi");
		l.add("java");
		l.add("selenium");
		l.add("java");
		l.stream().map(String::length).forEach(System.out::println);
		/*
		 * ArrayList<Integer> l1 = new ArrayList<>(); l1.add(10); l1.add(78);
		 * l1.add(89); l1.add(67); l1.add(45);
		 */
		l.stream().sorted().forEach(System.out::println);
		l.stream().sorted((x, y) -> x.length() - y.length()).forEach(System.out::println);

		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		names.stream().sorted().forEach(System.out::println);
		List<String> l1 = new ArrayList<>();
		l1.add("One");
		l1.add("hii");
		l1.add("anandhi");
		l1.add("java");
		l1.add("selenium");
		l1.stream().sorted().forEach(System.out::println);
	}
}

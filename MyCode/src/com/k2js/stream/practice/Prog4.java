package com.k2js.stream.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;

import java.util.stream.Collectors;

public class Prog4 {
	public static void main(String[] args) {
		int i = Arrays.stream(new int[] { 10, 20, 30, 40, 50 }).reduce(0, (a, b) -> a + b);
		System.out.println(i);
		OptionalInt i1 = Arrays.stream(new int[] { 10, 20, 30, 40, 50 }).min();
		System.out.println(i1);
		OptionalInt i2 = Arrays.stream(new int[] { 10, 20, 30, 40, 50 }).max();
		System.out.println(i2);
		long i3 = Arrays.stream(new int[] { 10, 20, 30, 40, 50 }).count();
		System.out.println(i3);
		List<String> l1 = new ArrayList<>();
		l1.add("One");
		l1.add("hii");
		l1.add("anandhi");
		l1.add("java");
		l1.add("world");
		Set<String> s = l1.stream().filter(x->x.length()>3).collect(Collectors.toSet());
		System.out.println(s);
	}
}

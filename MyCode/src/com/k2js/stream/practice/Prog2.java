package com.k2js.stream.practice;

import java.util.ArrayList;
import java.util.List;

public class Prog2 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("java");
		l.add("selenium");
		l.add("java");
		System.out.println("---------filter method----------");
		l.stream().filter(x->x.length()>=4).forEach(System.out::println);
		System.out.println("-------distinct method---------");
		l.stream().distinct().forEach(System.out::println);
		System.out.println("-------limit method---------");
		l.stream().limit(5).forEach(System.out::println);
		System.out.println("-------skip method---------");
		l.parallelStream().skip(2).forEach(System.out::println);
	}
}

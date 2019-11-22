package com.k2js.stream.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Prog5 {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("One");
		l1.add("hii");
		l1.add("core");
		l1.add("anandhi");
		l1.add("java");
		l1.add("world");
		if(l1.stream().anyMatch(x->x.length()==4)) {
			System.out.println(" a word in length 4");
		}
		if(l1.stream().allMatch(x->x.length()>2)) {
			System.out.println(" all words length greater than 2");
		}
		if(l1.stream().noneMatch(x->x.length()>7)) {
			System.out.println(" no word in this list length greater than 7");
		}
		Optional<String> first = l1.stream().findFirst();
		System.out.println(first);
		System.out.println(l1.stream().findAny());
		
		
		
		Object[] arr = l1.stream()
        .filter(name -> name.length() > 2)
        .peek(e -> System.out.println("Filtered Name :"+e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped Name :"+e))
        .toArray();
		System.out.println(Arrays.toString(arr));
	}
}

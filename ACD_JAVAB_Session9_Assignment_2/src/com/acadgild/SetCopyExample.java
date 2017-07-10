package com.acadgild;

import java.util.HashSet;
import java.util.Set;

public class SetCopyExample {

	public static void main(String[] args) {
		
		Set<Integer> set2=new HashSet<Integer>();
		Set<Integer> set1=new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
		set1.addAll(set2);
		
		System.out.println(set1);
		
		

	}

}

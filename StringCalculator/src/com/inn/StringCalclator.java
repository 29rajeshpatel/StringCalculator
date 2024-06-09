package com.inn;

import java.util.List;

public class StringCalclator {
public static void main(String[] args) {
		
		System.out.println(add("1,2"));

	}
	public static int add(String input) {
		if(input.isEmpty()) {return 0;}
		String[] inputs =input.replaceAll("\\n", ",").split(",");
		
		
		int sum=0;
		for(int i=0;i<inputs.length;i++) {
			int nmber=Integer.parseInt(inputs[i]);
			
			if(nmber<0)
			{
				throw new RuntimeException("Number can not be negative");
			}
			if (nmber <= 1000) 
			sum+=(nmber);
		}
		return sum;
		
	}
}

package com.usa.collection;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		// old ll
		
		int [] num = new int[100];  // Array length is fixed
		num[0] = 20; // 1
		num[1] = 30; // 2
		num[2] = 30; // 3
		num[3] = 40; // 4
		num[4] = 50; // 5 
		num[5] = 60;
		
	//If you want to print the specific value by index number	
	//System.out.println(num[1]);
	
	
	//System.out.println(Arrays.toString(num));
		
	
	int [] number = {1,2,3,4,5,6,};
	//System.out.println(Arrays.toString(number));
	
	
	int[][]numbers = {{1,2,3,4,5,6,},
			         { 6,7,8,9,0,1}};
	
	System.out.println(numbers[1][5]);
	
	//System.out.println(Arrays.toString(numbers));
	
	
	
		String [] name = new String[5];
		name[0] = "Mir";
		name[1] = "Sazzad";
		name[2] = "Habib";
		name[3] = "Rahad";
		name[4] = "Alam";
		
		System.out.println(name[3]);

	}


}

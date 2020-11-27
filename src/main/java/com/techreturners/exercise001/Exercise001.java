package com.techreturners.exercise001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    public int singles(int [] arr){
    	Integer[] objectArray = new Integer[arr.length];

		for(int i = 0; i < arr.length; i++) {
		    objectArray[i] = Integer.valueOf(arr[i]); // returns Integer value
		}
		
		List<Integer> l =  Arrays.asList(objectArray);
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for(Integer j : l) {
			if(hm.containsKey(j)) {
				hm.put(j, hm.get(j)+1);
			}else {
				hm.put(j, 1);
			}
		}
		
		int result =(int) hm.entrySet().stream().filter(s->s.getValue().equals(1))
		.map(Map.Entry::getKey)
		.reduce(0, (sum,element)-> sum+element);
	
		
        return result;
    }
}

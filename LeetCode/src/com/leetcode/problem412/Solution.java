package com.leetcode.problem412;

import java.util.LinkedList;
import java.util.List;

class Solution {

	public List<String> fizzBuzz(int n){
		LinkedList<String> res = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			StringBuilder s = new StringBuilder();
			
			if(i % 3 == 0)
				s.append("Fizz");
			if(i%5==0)
				s.append("Buzz");
			if(s.length() == 0)
				s.append(i);
			
			res.add(s.toString());
		}
		return res;
	}
}

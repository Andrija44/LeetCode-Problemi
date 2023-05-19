package com.leetcode.problem13;

import java.util.Map;
import java.util.TreeMap;

class Solution {

	public static int romanToInt(String s) {
		int res = 0;
		Map<String, Integer> romans = new TreeMap<>();
		romans.put("I", 1);
		romans.put("V", 5);
		romans.put("X", 10);
		romans.put("L", 50);
		romans.put("C", 100);
		romans.put("D", 500);
		romans.put("M", 1000);

		String[] chars = s.split("");

		for (int i = 0; i < chars.length; i++) {
			if (i + 1 < chars.length)
				res = (romans.get(chars[i + 1]).intValue() > romans.get(chars[i]).intValue())
						? res - romans.get(chars[i]).intValue()
						: res + romans.get(chars[i]).intValue();
			else
				res += romans.get(chars[i]).intValue();
		}

		return res;
	}
}

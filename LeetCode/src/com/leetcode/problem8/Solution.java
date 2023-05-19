package com.leetcode.problem8;

class Solution {

	public int myAtoi(String s) {

		StringBuilder string = new StringBuilder();
		double res = 0;
		boolean started = false;
		s = s.strip();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				string.append(s.charAt(i));
				started = true;
			} else if (!started && (s.charAt(i) == '-' || s.charAt(i) == '+') && i != s.length() - 1) {
				string.append(s.charAt(i));
				started = true;
			} else
				break;
		}

		try {
			res = Double.parseDouble(string.toString());
		} catch (Exception e) {

		}

		if (res > Integer.MAX_VALUE)
			res = Integer.MAX_VALUE;
		else if (res < Integer.MIN_VALUE)
			res = Integer.MIN_VALUE;

		return (int) res;
	}
}

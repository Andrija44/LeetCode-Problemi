package com.leetcode.problem234;

import java.util.ArrayList;

class Solution {

	public static boolean isPalindrome(ListNode head) {
		ArrayList<Integer> vals = new ArrayList<>();

		while (head != null) {
			vals.add(head.val);
			head = head.next;
		}

//		if (vals.size() % 2 != 0 && vals.size() > 1)
//			return false;

		for (int i = 0, j = vals.size() - 1; i < vals.size() / 2; i++, j--) {
			if (vals.get(i) != vals.get(j))
				return false;
		}

		return true;
	}
}

package com.leetcode.problem876;

import java.util.ArrayList;

class Solution {

	public ListNode middleNode(ListNode head) {
		ListNode first = head;
		ArrayList<Integer> vals = new ArrayList<>();

		while (head != null) {
			vals.add(head.val);
			head = head.next;
		}

		for (int i = 0; i < vals.size() / 2; i++) {
			first = first.next;
		}

		return first;
	}
}

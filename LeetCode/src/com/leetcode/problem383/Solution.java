package com.leetcode.problem383;

class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder s = new StringBuilder(magazine);
        String[] st = ransomNote.split("");
        
        for (String str : st) {
			if(s.indexOf(str) == -1)
				return false;
			else {
				s.deleteCharAt(s.indexOf(str));
			}
		}
        return true;
    }
}

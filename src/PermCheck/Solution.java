package PermCheck;

import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A) {
		Arrays.sort(A);
		for (int i = 1; i <= A.length; i++) {
			if (A[i - 1] != i) {
				return 0;
			}
		}
		return 1;
	}
}
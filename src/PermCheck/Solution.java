package PermCheck;

import java.util.*;


public class Solution {
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
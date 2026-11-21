package PermMissingElem;

import java.util.*;


public class Solution {
	public int solution(int[] A) {

		int answer = 0;
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {

			if (A[i] != i + 1) {
				return i + 1;
			}
		}
		return A.length + 1;

	}
}
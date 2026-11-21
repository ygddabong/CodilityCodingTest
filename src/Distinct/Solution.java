package Distinct;

import java.util.*;


public class Solution {
	public int solution(int[] A) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		return set.size();
	}
}
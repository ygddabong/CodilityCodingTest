package MissingInteger;

import java.util.*;


public class Solution {
	public int solution(int[] A) {
		Set<Integer> set = new HashSet<>();
		for (int a : A) {
			set.add(a);
		}
		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return -1;
	}
}
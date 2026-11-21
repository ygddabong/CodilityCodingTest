package FrogRiverOne;

import java.util.*;


public class Solution {
	public int solution(int X, int[] A) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 1; i < X + 1; i++) {
			map.put(i, 0);
		}
		for (int p = 0; p < A.length; p++) {
			map.remove(A[p]);
			if (map.isEmpty()) {
				return p;
			}
		}
		return -1;
	}
}

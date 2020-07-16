package FrogRiverOne;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public int solution(int X, int[] A) {
		// write your code in Java SE 8
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

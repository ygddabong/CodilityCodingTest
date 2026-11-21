package Triangle;

import java.util.*;

public class Solution {
	public int solution(int[] A) {
		Arrays.sort(A);
		for (int i = 2; i < A.length; i++) {
			if (A[i - 2] > A[i] - A[i - 1]) {
				return 1;
			}
		}
		return 0;
	}
}
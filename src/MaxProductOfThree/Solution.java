package MaxProductOfThree;

import java.util.*;

class Solution {
	public int solution(int[] A) {
		Arrays.sort(A);
		int x = A.length;
		int answer = A[x - 1] * A[x - 2] * A[x - 3];
		if (A[0] < 0 && A[1] < 0 && A[x - 1] >= 0) {
			int answer2 = A[0] * A[1] * A[x - 1];
			if (answer < answer2) {
				answer = answer2;
			}
		}
		return answer;
	}
}
package TapeEquilibrium;

class Solution {
	public int solution(int[] A) {
		int sum_top = 0;
		int sum_bottom = 0;
		int integerMax = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			sum_bottom += A[i];
		}

		for (int p = 1; p < A.length; p++) {
			sum_top += A[p - 1];
			sum_bottom -= A[p - 1];

			int diff = Math.abs(sum_top - sum_bottom);
			if (diff < integerMax) {
				integerMax = diff;
			}
		}
		return integerMax;
	}
}
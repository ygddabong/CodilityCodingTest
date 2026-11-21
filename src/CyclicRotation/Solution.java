package CyclicRotation;

public class Solution {
	public int[] solution(int[] A, int K) {
		int arraySize = A.length;
		int result[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			result[(i + K) % arraySize] = A[i];
		}
		return result;
	}
}

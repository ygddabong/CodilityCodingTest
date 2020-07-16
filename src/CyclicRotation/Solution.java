package CyclicRotation;

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int arraySize = A.length;
        int result[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[(i + K) % arraySize] = A[i];
        }
        return result;
    }
}

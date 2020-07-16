package OddOccurrencesInArray;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}
		for (int key : map.keySet()) {
			if (map.get(key) % 2 == 1) {
				answer = key;
				break;
			}
		}
		return answer;
	}
}
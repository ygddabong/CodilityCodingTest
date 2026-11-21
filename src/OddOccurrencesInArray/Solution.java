package OddOccurrencesInArray;

import java.util.*;


public class Solution {
	public int solution(int[] A) {
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
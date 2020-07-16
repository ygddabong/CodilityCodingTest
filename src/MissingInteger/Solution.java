package MissingInteger;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
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
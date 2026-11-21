package FrogJmp;

import java.util.*;


public class Solution {
	public int solution(int X, int Y, int D) {

		int XX = Y - X;
		Double XXX = XX / (double) D;
		int XXXX = (int) Math.ceil(XXX);
		return XXXX;
	}
}
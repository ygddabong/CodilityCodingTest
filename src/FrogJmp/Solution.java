package FrogJmp;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(int X, int Y, int D) {
     // write your code in Java SE 8
 	
 	int XX = Y-X;
 	Double XXX = XX / (double) D;
 	int XXXX = (int)Math.ceil(XXX);
		return XXXX;
	}
}
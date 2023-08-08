
import java.util.*;

import looping.intermethods;
import looping.native1;

public class Question1 {
	interface AdvancedArithmetic{
		int divisor_sum(int n);
	}
	public abstract class MyCalcualtor implements AdvancedArithmetic{
		public MyCalcualtor(int n) {
			int sum=0;
			// TODO Auto-generated constructor stub
			for (int i = 0; i < n ; i++) {
				if(n%i==0) {
					sum+=i;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		
	}

}

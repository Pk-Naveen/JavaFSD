package looping;

import java.util.*;

public class profitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int profit;
		int arr[] =  new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] =in.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[i+1]) {
					int buy = arr[i+1];
				}
			}
		}
		
	}

}

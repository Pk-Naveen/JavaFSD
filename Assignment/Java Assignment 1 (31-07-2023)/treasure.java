package looping;

import java.util.ArrayList;
import java.util.Scanner;

public class treasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum=0;
		int n = in.nextInt();
		int arr[] = new int[n];
//		ArrayList<Integer>arr= new ArrayList<Integer>();		
		for (int i =0; i<arr.length;i++) {
				arr[i]=in.nextInt();
				sum+=arr[i];
		}

		if(sum%2==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}

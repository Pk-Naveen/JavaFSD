package looping;

import java.util.Scanner;

public class platform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int jumps=0;
	int n = in.nextInt();
		int count =0;
//		int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
		int arr[] = new int [n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		
		
		for(int i=0; i<arr.length;i++) {

			if(i>0) {
				int l = arr.length;
				jumps = l-arr[i];
				i+=arr[i];
				count++;
				
				
			}
		}
		System.out.println(count);

	}

}

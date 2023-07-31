package looping;

import java.util.*;

public class marathonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Starting Distance");
		int start_dist = in.nextInt();
		int n = start_dist;
		if(start_dist>=5 && start_dist<=8) {
			while(start_dist!=0) {
				int l = start_dist--;
				System.out.println("Distance to run:" + l);
				if(start_dist<2) {
					System.out.println("almost there");
				}
				if(start_dist==0) {
					System.out.println("Done for the day");
				}
			}
			
		}
		else {
			System.out.println("choose again");
		}
		
		
	}
		

}

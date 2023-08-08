package looping;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		ArrayList<String> arr = new ArrayList<String>();
		String[] words = {"baa","abcd","cab","cad"};
		int n = in.nextInt();
		 String[] k = {"bdac"};
		 for(int i=0;i<k.length;i++) {
			 	for(int j=0;j<words.length;j++) {
			 		if(k[0] == words[1]) {
			 			System.out.println(1);
			 			break;
			 		}
			 		else {
			 			System.out.println(0);
			 			break;
			 		}
			}

		 }
		 
		 
		 
	}

}

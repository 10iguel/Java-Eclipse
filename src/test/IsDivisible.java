package test;

import java.util.Scanner;

public class IsDivisible {
	public static void main(String[] args) {
		String answer1;   
		String answer2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("As you want???");
		answer1 = scanner.next();
		answer2 = scanner.next(); 
		// System.out.println("Other???");
		//answer2 = scanner.nextLine();  
		
		System.out.println(isDivisible(answer1, answer2));
		
		scanner.close();
		
	}
	public static boolean isDivisible(String answer1, String answer2) {
		//Best Practice
		
		  boolean answer = (Integer.parseInt(answer1) % Integer.parseInt(answer2) == 0);
		  return answer;
		 
		//if(Integer.parseInt(answer1) % Integer.parseInt(answer2) == 0  ) {
			//answer = true;
		//}else {
			//answer = false;
		//}
		
		//return answer;
		
	}

}

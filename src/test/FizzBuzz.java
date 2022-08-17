package test;

import java.util.Scanner;

//If its divisible by 5 ---> Fizz
//If its divisible by 3 ---> Buzz
//If its divisible by 15 ---> FizzBuzz
//If its not divisible by 3 an 5 ---> the number


public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ans;   
		
		System.out.print("Number: ");
		ans = scanner.nextLine();
		
		System.out.print(isdivisible(ans));
		
		scanner.close();
	}
	
	private static String isdivisible(String num) {
		int res = Integer.parseInt(num);
		if(res % 5 == 0 & res % 3 == 0 ) {
			return "FizzBuzz";
		} else if(res % 5 == 0 ) {
			return "Fizz";
		} else if(res % 3 == 0 ) {
			return "Buzz";
		} else {
			return   num; 
		}
		
	}

}

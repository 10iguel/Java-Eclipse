package test;

import java.util.Scanner;

public class inputValidation {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		num1 = validValues("Please enter a number: ");
		
		num2 = num1+1000;
		num3 = num1 * 2;
		
		
		System.out.println("num1= "+ num1);
		System.out.println("num2= "+ num2);
		System.out.println("num3= "+ num3);

		
				
	}
	
	public static int validValues(String text){
		boolean valid = false;
		String answer;
		Scanner scanner = new Scanner(System.in);
		int num = 0;

		do{
			System.out.print(text);
			answer = scanner.nextLine();
			try {
				num = Integer.parseInt(answer);
				valid = true;
			} catch (Exception e) {
				System.out.println("Error: Please enter a whole number.");
			}
		}while (!valid);
		
		scanner.close();

		return num;
	}

}

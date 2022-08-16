package test;
 
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Put the number you want to see in fibonacci");
		String inputs = scanner.nextLine();
		int res[] = fib(Integer.parseInt(inputs));
		for (int i = 0; i < res.length; i++) {
            System.out.print(" " + res[i] + " ");
        }
		
		scanner.close();
	}
	public static int[]  fib(int num) {
		int fibSum[] = new int[num];
		for (int i = 0; i < num; i++) {
			if (i == 0) {
				fibSum[i] = i;
				continue;
			} 
			if (i == 1 || i == 2) {
				fibSum[i] = 1;
				continue;
			}
			
			fibSum[i] = fibSum[i-1]+ fibSum[i-2];
		}
		return fibSum;
	}
	 

}

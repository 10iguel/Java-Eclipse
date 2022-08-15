package week03;

import java.util.Scanner;

public class AsteriskPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter to see how many lines you would like to see: ");
		int lines = scanner.nextInt();
		System.out.println();
		scanner.close();
		
		for(int size = 1; size <= lines; size++) {
			for(int blank = 1 ; blank <= lines - size; blank++ ) {
				System.out.print(" ");
			}
			for(int asterisk = 1 ; asterisk <= (size*2)-1; asterisk++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
	}

}

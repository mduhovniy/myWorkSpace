package myHomeWorks;

import java.util.Scanner;

public class page46ex1 {

	private static Scanner input;
	
	public static int countResult(int maccabi, int other) {
		int points = 0;
		if(maccabi > other)
			points = 2;
		else if (maccabi == other)
			points =1;
		return points;
	}
	
	public static void main(String[] args) {
		int result = 0;
		input = new Scanner(System.in);
		for (int i=1; i < 4; i++) {
			int x, y;
			System.out.println("Enter score of game#" + i + ":");
			x = input.nextInt();
			y = input.nextInt();
			if (x < 0 || y < 0) {
				System.out.println("Error! Try again");
				i--;
				continue;
			} else {
				result += countResult(x,y);
			}
		}
		System.out.println("Result of Maccabi TLV " + result + " points");
		
		input.close();
	}

}

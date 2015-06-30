package myHomeWorks;

import java.util.Scanner;

public class page46ex2 {

private static Scanner input;
	
	public static float average(int[] arr, int lenth) {
		float result = 0;
		for (int i = 0; i < lenth; i++) {
			result += (float)(arr[i]);
		}
		result /= lenth;
		return result;
	}
	
	public static void main(String[] args) {
		int num[] = new int[4];
		int len = 0;
		boolean stop = false;
		input = new Scanner(System.in);
		for (int i=0; i < 4; i++) {
			num[i] = input.nextInt();
			if (num[i] == 0 && !stop) {
				len = i;
				stop = true;
			}
		}
		if (len == 0 && stop) {
			System.out.println("No result!");
			stop = true;
		} else {
			if (!stop)
				len = 4;	
			System.out.println("Average of array until 0 = " + average(num, len));	
		}
		input.close();
	}
}


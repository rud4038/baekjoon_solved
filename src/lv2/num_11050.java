package lv2;

import java.util.Scanner;

public class num_11050 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int answer = factorial(n)/(factorial(k) * factorial(n-k));
		
		System.out.println(answer);
	}
	
	static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n-1);
	}
}

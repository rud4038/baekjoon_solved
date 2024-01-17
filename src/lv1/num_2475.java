package lv1;

import java.util.Scanner;

public class num_2475 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			sum += n*n;
		}
		
		System.out.println(sum % 10);
	}
}

package lv2;

import java.util.Scanner;

public class num_2231 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int answer = 0;
		for(int i = 1; i < n; i++) {
			int sum = i;
			int n2 = i;
			while(true) {
				sum += n2 % 10;
				n2 /= 10;
				if(n2 == 0) break;
			}
			
			if(sum == n) {
				answer = i;
				break;
			}
			
		}
		System.out.println(answer);
	}
}

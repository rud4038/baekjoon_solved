package lv2;

import java.util.Scanner;

public class num_1978 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			boolean check = true;
			
			if(a == 1) continue;
			
			for(int j = 2; j <= Math.sqrt(a); j ++) {
				if(a % j == 0) {
					check = false;
					break;
				}
			}
			if(check) count++;
		}
		
		System.out.println(count);
	}
}

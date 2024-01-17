package lv1;

import java.util.Scanner;

public class num_2577 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int gob = a*b*c;
		while(gob > 0) {
			int n = gob % 10;
			gob = gob/10;
			nums[n]++;
		}
		
		for(int n : nums) {
			System.out.println(n);
		}

	}

}
